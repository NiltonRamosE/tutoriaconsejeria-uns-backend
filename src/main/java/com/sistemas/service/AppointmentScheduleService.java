package com.sistemas.service;

import com.sistemas.domain.AppointmentSchedule;

import java.util.List;

public interface AppointmentScheduleService extends IGenericService<AppointmentSchedule, Long>{
    List<AppointmentSchedule> findByStudentIdAndSender(Long studentId, String sender);
}
