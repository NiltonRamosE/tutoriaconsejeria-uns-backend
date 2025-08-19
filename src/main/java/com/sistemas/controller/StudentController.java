package com.sistemas.controller;

import com.sistemas.domain.Student;
import com.sistemas.dto.student.StudentProfileResponse;
import com.sistemas.mapper.StudentMapper;
import com.sistemas.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
        Student savedStudent = studentService.create(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity <StudentProfileResponse> getStudentById(
            @PathVariable("id") Long id) {

        StudentProfileResponse studentProfileResponse = studentMapper.mapToStudentProfileResponse(studentService.search(id));

        if (studentProfileResponse != null) {
            return new ResponseEntity<>(studentProfileResponse, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new StudentProfileResponse(), HttpStatus.NOT_FOUND);
        }
    }
}
