package com.sistemas.service;

import com.sistemas.domain.Assessment;

import java.util.Optional;

public interface AssessmentService extends IGenericService<Assessment, Long>{
    Optional<Assessment> findAssessment(Long studentId, Long instructorId, char type, boolean isStudentEvaluating);
}
