package com.sistemas.controller;

import com.sistemas.domain.Administrator;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.auth.AuthenticationRequest;
import com.sistemas.dto.auth.AuthenticationResponse;
import com.sistemas.dto.auth.UserResponse;
import com.sistemas.jwt.CustomUserDetailsService;
import com.sistemas.jwt.JwtUtil;
import com.sistemas.mapper.UserMapper;
import com.sistemas.service.AdministratorService;
import com.sistemas.service.InstructorService;
import com.sistemas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/auth", produces = "application/json")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private StudentService studentService;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getInstitutionalEmail(), authenticationRequest.getPassword())
        );

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getInstitutionalEmail());
        final String jwt = jwtUtil.generateToken(userDetails.getUsername());
        String userType = userDetails.getAuthorities().stream()
                .map(grantedAuthority -> grantedAuthority.getAuthority())
                .map(role -> role.startsWith("ROLE_") ? role.substring(5).toLowerCase() : role.toLowerCase())
                .findFirst()
                .orElse("unknown");

        String email = authenticationRequest.getInstitutionalEmail();

        Student student = studentService.findByInstitutionalEmail(email).orElse(null);
        Instructor instructor = instructorService.findByInstitutionalEmail(email).orElse(null);
        Administrator administrator = administratorService.findByInstitutionalEmail(email).orElse(null);

        UserResponse userResponse = userMapper.getUserInfo(userType, student, instructor, administrator);

        return ResponseEntity.ok(new AuthenticationResponse(jwt, userType, userResponse));
    }

}
