package com.sistemas.repository;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AcademicAssignmentRepository extends JpaRepository<AcademicAssignment, Long> {

    @Query("SELECT COUNT(aa) FROM AcademicAssignment aa WHERE aa.instructor.id = :instructorId AND aa.typeActivityCode = :typeActivityCode")
    long countStudentsByInstructorAndTypeActivity(
            @Param("instructorId") Long instructorId,
            @Param("typeActivityCode") char typeActivityCode
    );

    @Query(value = """
        SELECT i
        FROM AcademicAssignment aa
        INNER JOIN aa.instructor i
        WHERE aa.student.id = :studentId
    """)
    List<Instructor> findInstructorsByStudentId(
            @Param("studentId") Long studentId
    );

    @Query(value = """
        SELECT aa
        FROM AcademicAssignment aa
        WHERE aa.student.id = :studentId
    """)
    List<AcademicAssignment> findAcademicAssignmentsByStudentId(
            @Param("studentId") Long studentId
    );

    @Query(value = """
        SELECT s
        FROM AcademicAssignment aa
        INNER JOIN aa.student s
        WHERE aa.instructor.id = :instructorId
          AND aa.typeActivityCode = :typeActivityCode
    """)
    List<Student> findStudentsByInstructorId(
            @Param("instructorId") Long instructorId,
            @Param("typeActivityCode") char typeActivityCode
    );
}
