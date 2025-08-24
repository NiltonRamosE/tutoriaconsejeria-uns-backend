package com.sistemas.mapper;

import com.sistemas.domain.*;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleReceivedResponse;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleSentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppointmentScheduleMapper {

    @Autowired
    private AppointmentMapper appointmentMapper;

    public AppointmentSchedule mapToAppointmentScheduleCreate(
            Student student,
            Instructor instructor,
            Appointment appointment
    ) {
        return AppointmentSchedule.builder()
            .appointment(appointment)
            .student(student)
            .instructor(instructor)
            .build();
    }

    public AppointmentScheduleSentResponse mapToAppointmentScheduleSentResponse(List<AppointmentSchedule> appointmentScheduleList) {
        if (appointmentScheduleList == null || appointmentScheduleList.isEmpty()) {
            throw new IllegalArgumentException("La lista de AppointmentSchedule no puede estar vacía");
        }

        Appointment appointment = appointmentScheduleList.getFirst().getAppointment();
        boolean isStudentSender = "student".equals(appointment.getSender());

        String senderFullName;
        String receiverFullName = null;
        List<String> receiverFullNames = new ArrayList<>();

        if (isStudentSender) {
            senderFullName = buildStudentFullName(appointment.getStudentSender());
            receiverFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());
            receiverFullNames = appointmentScheduleList.stream()
                    .map(as -> buildStudentFullName(as.getStudent()))
                    .toList();

        } else {
            senderFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());

            if (appointment.getAppointmentModality() == AppointmentModality.INDIVIDUAL) {
                // Individual → un solo estudiante en este schedule
                receiverFullName = buildStudentFullName(appointmentScheduleList.getFirst().getStudent());
                receiverFullNames = List.of(receiverFullName);
            } else {
                // Grupal → todos los estudiantes de la lista
                receiverFullNames = appointmentScheduleList.stream()
                        .map(as -> buildStudentFullName(as.getStudent()))
                        .toList();
            }
        }

        return AppointmentScheduleSentResponse.builder()
                .appointmentResponse(appointmentMapper.mapToAppointmentSentResponse(appointment))
                .senderFullName(senderFullName)
                .receiverFullName(receiverFullName)
                .receiverStudentsFullNames(receiverFullNames)
                .build();
    }



    private String buildStudentFullName(Student student) {
        return (student.getName() + " " +
                student.getPaternalSurname() + " " +
                student.getMaternalSurname()).trim();
    }

    private String buildInstructorFullName(Instructor instructor) {
        return (instructor.getName() + " " +
                instructor.getPaternalSurname() + " " +
                instructor.getMaternalSurname()).trim();
    }

/*
    public AppointmentScheduleReceivedResponse mapToAppointmentScheduleReceivedResponse(AppointmentSchedule appointmentSchedule) {

        boolean isStudentSender = "student".equals(appointmentSchedule.getSender());

        String fullName = isStudentSender
                ? appointmentSchedule.getStudent().getName() + " " +
                appointmentSchedule.getStudent().getPaternalSurname() + " " +
                appointmentSchedule.getStudent().getMaternalSurname()
                : appointmentSchedule.getInstructor().getName() + " " +
                appointmentSchedule.getInstructor().getPaternalSurname() + " " +
                appointmentSchedule.getInstructor().getMaternalSurname();

        return AppointmentScheduleReceivedResponse.builder()
                .appointmentResponse(appointmentMapper.mapToAppointmentResponse(appointmentSchedule.getAppointment()))
                .fullName(fullName.trim())
                .altScheduleA(appointmentSchedule.getAltScheduleA())
                .altScheduleB(appointmentSchedule.getAltScheduleB())
                .altScheduleC(appointmentSchedule.getAltScheduleC())
                .build();
    }
*/
}
