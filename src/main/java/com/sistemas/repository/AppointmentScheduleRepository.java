package com.sistemas.repository;

import com.sistemas.domain.AppointmentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {
}
