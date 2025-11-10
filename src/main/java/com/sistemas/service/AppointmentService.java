package com.sistemas.service;

import com.sistemas.domain.Appointment;

import java.util.List;

public interface AppointmentService extends IGenericService<Appointment, Long>{
    List<Appointment> findByStudentSenderId(Long studentSenderId);
}
