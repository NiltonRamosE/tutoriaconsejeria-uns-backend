package com.sistemas.service.implement;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import com.sistemas.mapper.AppointmentMapper;
import com.sistemas.mapper.AppointmentScheduleMapper;
import com.sistemas.service.AppointmentScheduleService;
import com.sistemas.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppointmentFacadeService {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentScheduleService appointmentScheduleService;

    @Autowired
    private AppointmentScheduleMapper appointmentScheduleMapper;

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Transactional
    public AppointmentSchedule createIndividualAppointment(
            ScheduleIndividualAppointmentRequest request,
            Student student,
            Instructor instructor,
            String sender
    ) {
        Appointment appointmentCreated = appointmentService.create(
                appointmentMapper.mapToAppointment(request)
        );

        AppointmentSchedule appointmentSchedule = appointmentScheduleMapper.mapToAppointmentScheduleCreate(
                request,
                student,
                instructor,
                appointmentCreated,
                sender
        );

        return appointmentScheduleService.create(appointmentSchedule);
    }
}

