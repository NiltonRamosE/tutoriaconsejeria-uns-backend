package com.sistemas.repository;

import com.sistemas.domain.InstructorSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorScheduleRepository extends JpaRepository<InstructorSchedule, Long> {
    List<InstructorSchedule> findByAcademicScheduleId(Long academicScheduleId);
    List<InstructorSchedule> findByInstructorId(Long instructorId);
}
