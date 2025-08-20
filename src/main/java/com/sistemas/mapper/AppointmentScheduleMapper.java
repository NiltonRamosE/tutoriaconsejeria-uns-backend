package com.sistemas.mapper;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import org.springframework.stereotype.Component;

@Component
public class AppointmentScheduleMapper {

    public AppointmentSchedule mapToAppointmentSchedule(
            ScheduleIndividualAppointmentRequest request,
            Student student,
            Instructor instructor,
            Appointment appointment
    ) {
        return AppointmentSchedule.builder()
            .appointment(appointment)
            .student(student)
            .instructor(instructor)
            .altScheduleA(request.getAltScheduleA())
            .altScheduleB(request.getAltScheduleB())
            .altScheduleC(request.getAltScheduleC())
            .build();
    }
}
