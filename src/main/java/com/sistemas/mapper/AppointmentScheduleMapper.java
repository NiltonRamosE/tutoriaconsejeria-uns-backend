package com.sistemas.mapper;

import com.sistemas.domain.*;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleReceivedResponse;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleSentResponse;
import com.sistemas.dto.appointment_schedule.StudentAttendanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
            .appointmentScheduleAttendance(AppointmentScheduleAttendance.SIN_CONFIRMAR)
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
        List<StudentAttendanceResponse> receiverStudents = new ArrayList<>();

        if (isStudentSender) {
            senderFullName = buildStudentFullName(appointment.getStudentSender());
            receiverFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());

        } else {
            senderFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());

            if (appointment.getAppointmentModality() == AppointmentModality.INDIVIDUAL) {
                // Individual → un solo estudiante en este schedule
                receiverFullName = buildStudentFullName(appointmentScheduleList.getFirst().getStudent());
            }
        }

        receiverStudents = appointmentScheduleList.stream()
                .map(as -> new StudentAttendanceResponse(
                        as.getStudent().getId(),
                        buildStudentFullName(as.getStudent()),
                        as.getAppointmentScheduleAttendance()
                ))
                .toList();

        Map<String, Long> altScheduleCounts = appointmentScheduleList.stream()
                .filter(as -> as.getAltScheduleSelected() != null)
                .collect(Collectors.groupingBy(
                        AppointmentSchedule::getAltScheduleSelected,
                        Collectors.counting()
                ));

        return AppointmentScheduleSentResponse.builder()
                .appointmentResponse(appointmentMapper.mapToAppointmentSentResponse(appointment))
                .senderFullName(senderFullName)
                .receiverFullName(receiverFullName)
                .receiverStudents(receiverStudents)
                .altScheduleCounts(altScheduleCounts)
                .build();
    }

    public AppointmentScheduleReceivedResponse mapToAppointmentScheduleReceivedResponse(List<AppointmentSchedule> appointmentScheduleList) {
        if (appointmentScheduleList == null || appointmentScheduleList.isEmpty()) {
            throw new IllegalArgumentException("La lista de AppointmentSchedule no puede estar vacía");
        }

        Appointment appointment = appointmentScheduleList.getFirst().getAppointment();
        boolean isStudentSender = "student".equals(appointment.getSender());

        String senderFullName;
        String receiverFullName = null;
        List<StudentAttendanceResponse> receiverStudents = new ArrayList<>();

        if (isStudentSender) {
            senderFullName = buildStudentFullName(appointment.getStudentSender());
            receiverFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());

        } else {
            senderFullName = buildInstructorFullName(appointmentScheduleList.getFirst().getInstructor());

            if (appointment.getAppointmentModality() == AppointmentModality.INDIVIDUAL) {
                // Individual → un solo estudiante en este schedule
                receiverFullName = buildStudentFullName(appointmentScheduleList.getFirst().getStudent());
            }
        }

        receiverStudents = appointmentScheduleList.stream()
                .map(as -> new StudentAttendanceResponse(
                        as.getStudent().getId(),
                        buildStudentFullName(as.getStudent()),
                        as.getAppointmentScheduleAttendance()
                ))
                .toList();

        Map<String, Long> altScheduleCounts = appointmentScheduleList.stream()
                .filter(as -> as.getAltScheduleSelected() != null)
                .collect(Collectors.groupingBy(
                        AppointmentSchedule::getAltScheduleSelected,
                        Collectors.counting()
                ));

        return AppointmentScheduleReceivedResponse.builder()
                .appointmentResponse(appointmentMapper.mapToAppointmentReceivedResponse(appointment))
                .senderFullName(senderFullName)
                .receiverFullName(receiverFullName)
                .receiverStudents(receiverStudents)
                .altScheduleCounts(altScheduleCounts)
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
}
