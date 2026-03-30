package com.sistemas.repository;

import com.sistemas.domain.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {

    Assessment findByStudentIdAndInstructorIdAndTypeActivityCode(Long studentId, Long instructorId, char type);

    @Query("""
        SELECT a FROM Assessment a
        WHERE a.student.id = :studentId
        AND a.instructor.id = :instructorId
        AND a.typeActivityCode = :type
        AND a.instructorAssessment IS NOT NULL
    """)
    Assessment findStudentEvaluatedInstructor(
            Long studentId,
            Long instructorId,
            char type
    );

    @Query("""
        SELECT a FROM Assessment a
        WHERE a.student.id = :studentId
        AND a.instructor.id = :instructorId
        AND a.typeActivityCode = :type
        AND a.studentAssessment IS NOT NULL
    """)
    Assessment findInstructorEvaluatedStudent(
            Long studentId,
            Long instructorId,
            char type
    );

}
