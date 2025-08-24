package com.sistemas.service;

import com.sistemas.domain.Appointment;

import java.util.List;

public interface AppointmentService extends IGenericService<Appointment, Long>{
    List<Appointment> findByStudentSenderIdAndSender(Long studentSenderId, String sender);
}
