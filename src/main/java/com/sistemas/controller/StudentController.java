package com.sistemas.controller;

import com.sistemas.domain.Student;
import com.sistemas.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {

        student.setPassword(passwordEncoder.encode(student.getPassword()));

        Student savedStudent = studentService.create(student);
        return ResponseEntity.ok(savedStudent);
    }
}
