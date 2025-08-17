package com.sistemas.repository;

import com.sistemas.domain.AcademicSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicScheduleRepository extends JpaRepository<AcademicSchedule, Long> {
    List<AcademicSchedule> findByCycle(Integer cycle);
}
