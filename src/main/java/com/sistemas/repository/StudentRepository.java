package com.sistemas.repository;

import com.sistemas.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByInstitutionalEmail(String institutionalEmail);
    @Query(value = """
            SELECT DISTINCT e.student_id, MAX(he.registration_condition) AS registration_condition
            FROM students e
            JOIN student_schedules he ON he.student_id = e.student_id
            WHERE e.year_of_study IN (:yearOfStudy)
            GROUP BY e.student_id
            """, nativeQuery = true)
    List<Object[]> findStudentsByYearOfStudy (
            @Param("yearOfStudy") List<Integer> yearOfStudy
    );
}
