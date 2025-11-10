package com.sistemas.service;

import com.sistemas.domain.Instructor;

import java.util.Optional;

public interface InstructorService extends IGenericService<Instructor, Long> {

    Optional<Instructor> findByInstitutionalEmail(String institutionalEmail);
}
