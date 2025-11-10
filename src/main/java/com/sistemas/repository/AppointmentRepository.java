package com.sistemas.repository;

import com.sistemas.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByStudentSenderId(Long studentSenderId);
}
