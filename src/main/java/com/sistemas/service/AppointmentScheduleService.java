package com.sistemas.service;

import com.sistemas.domain.AppointmentSchedule;

import java.util.List;

public interface AppointmentScheduleService extends IGenericService<AppointmentSchedule, Long>{
    List<AppointmentSchedule> findByAppointmentIdIn(List<Long> appointmentIds);
    List<AppointmentSchedule> findByInstructorIdAndSender(Long instructorId);
}
