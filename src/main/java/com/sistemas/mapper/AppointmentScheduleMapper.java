package com.sistemas.mapper;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.appointment_schedule.AppointmentRequestWithAltSchedule;
import com.sistemas.dto.student.AppointmentScheduleStudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentScheduleMapper {

    @Autowired
    private AppointmentMapper appointmentMapper;

    public AppointmentSchedule mapToAppointmentScheduleCreate(
            AppointmentRequestWithAltSchedule request,
            Student student,
            Instructor instructor,
            Appointment appointment,
            String sender
    ) {
        return AppointmentSchedule.builder()
            .appointment(appointment)
            .student(student)
            .instructor(instructor)
            .altScheduleA(request.getAltScheduleA())
            .altScheduleB(request.getAltScheduleB())
            .altScheduleC(request.getAltScheduleC())
            .sender(sender)
            .build();
    }

    public AppointmentScheduleStudentResponse mapToAppointmentScheduleResponse(AppointmentSchedule appointmentSchedule) {

        return AppointmentScheduleStudentResponse.builder()
                .appointment(appointmentMapper.mapToAppointmentResponse(appointmentSchedule.getAppointment()))
                .instructorFullName(
                    appointmentSchedule.getInstructor().getName() + " " +
                    appointmentSchedule.getInstructor().getPaternalSurname() + " " +
                    appointmentSchedule.getInstructor().getMaternalSurname()
                )
            .build();
    }


}
