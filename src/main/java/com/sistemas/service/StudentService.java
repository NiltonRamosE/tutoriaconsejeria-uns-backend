package com.sistemas.service;

import com.sistemas.domain.Student;

import java.util.Optional;

public interface StudentService extends IGenericService<Student, Long> {

    Optional<Student> findByInstitutionalEmail(String institutionalEmail);
}
