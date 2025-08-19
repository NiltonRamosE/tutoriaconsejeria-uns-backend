package com.sistemas.controller;

import com.sistemas.dto.auth.AuthenticationRequest;
import com.sistemas.dto.auth.AuthenticationResponse;
import com.sistemas.dto.auth.UserResponse;
import com.sistemas.jwt.CustomUserDetailsService;
import com.sistemas.jwt.JwtUtil;
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

        UserResponse userResponse = getUserInfo(userType, authenticationRequest.getInstitutionalEmail());

        return ResponseEntity.ok(new AuthenticationResponse(jwt, userType, userResponse));
    }

    private UserResponse getUserInfo(String userType, String email) {
        return switch (userType) {
            case "student" -> studentService.findByInstitutionalEmail(email)
                    .map(s -> new UserResponse(s.getId(), s.getName() + " " + s.getPaternalSurname() + " " + s.getMaternalSurname(), s.getInstitutionalEmail(), s.getGenderCode()))
                    .orElse(null);
            case "instructor" -> instructorService.findByInstitutionalEmail(email)
                    .map(i -> new UserResponse(i.getId(), i.getName() + " " + i.getPaternalSurname() + " " + i.getMaternalSurname(), i.getInstitutionalEmail(), i.getGenderCode()))
                    .orElse(null);
            case "administrator" -> administratorService.findByInstitutionalEmail(email)
                    .map(a -> new UserResponse(a.getId(), a.getName() + " " + a.getPaternalSurname() + " " + a.getMaternalSurname(), a.getInstitutionalEmail(), a.getGenderCode()))
                    .orElse(null);
            default -> null;
        };
    }

}
