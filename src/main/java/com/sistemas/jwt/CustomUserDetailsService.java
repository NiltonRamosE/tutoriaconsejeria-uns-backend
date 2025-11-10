package com.sistemas.jwt;

import com.sistemas.domain.Administrator;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.service.AdministratorService;
import com.sistemas.service.InstructorService;
import com.sistemas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private InstructorService instructorService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Student student = studentService.findByInstitutionalEmail(email).orElse(null);
        if (student != null) {
            return new User(student.getInstitutionalEmail(), student.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_STUDENT")));
        }

        Administrator administrator = administratorService.findByInstitutionalEmail(email).orElse(null);
        if (administrator != null) {
            return new User(administrator.getInstitutionalEmail(), administrator.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_ADMINISTRATOR")));
        }

        Instructor instructor = instructorService.findByInstitutionalEmail(email).orElse(null);
        if (instructor != null) {
            return new User(instructor.getInstitutionalEmail(), instructor.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_INSTRUCTOR")));
        }

        throw new UsernameNotFoundException("User not found with email: " + email);
    }
}
