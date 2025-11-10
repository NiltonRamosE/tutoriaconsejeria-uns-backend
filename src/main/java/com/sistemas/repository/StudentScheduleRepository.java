package com.sistemas.repository;

import com.sistemas.domain.StudentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentScheduleRepository extends JpaRepository<StudentSchedule, Long> {
    @Query("SELECT ss FROM StudentSchedule ss " +
            "JOIN FETCH ss.academicSchedule " +
            "JOIN FETCH ss.student " +
            "WHERE ss.student.id = :studentId")
    List<StudentSchedule> findByStudentId(@Param("studentId") Long studentId);
}
