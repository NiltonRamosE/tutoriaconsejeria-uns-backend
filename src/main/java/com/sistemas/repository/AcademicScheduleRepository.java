package com.sistemas.repository;

import com.sistemas.domain.AcademicSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicScheduleRepository extends JpaRepository<AcademicSchedule, Long> {
}
