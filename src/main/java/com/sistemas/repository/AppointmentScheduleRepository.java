package com.sistemas.repository;

import com.sistemas.domain.AppointmentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {

    List<AppointmentSchedule> findByStudentIdAndSender(Long studentId, String sender);
}
