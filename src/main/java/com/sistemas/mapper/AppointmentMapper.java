package com.sistemas.mapper;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentMethod;
import com.sistemas.domain.AppointmentReason;
import com.sistemas.dto.appointment.AppointmentReceivedResponse;
import com.sistemas.dto.appointment.AppointmentRequest;
import com.sistemas.dto.appointment.AppointmentSentResponse;
import com.sistemas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentMapper {

    @Autowired
    private StudentService studentService;

    public Appointment mapToAppointmentCreate(AppointmentRequest request, String sender) {
        return Appointment.builder()
            .appointmentMethod(safeEnumValueOf(AppointmentMethod.class, request.getAppointmentMethod()))
            .appointmentReason(safeEnumValueOf(AppointmentReason.class, request.getAppointmentReason()))
            .appointmentModalityCode(request.getAppointmentModalityCode())
            .specificAppointmentMethod(request.getSpecificAppointmentMethod())
            .specificAppointmentReason(request.getSpecificAppointmentReason())
            .appointmentStateCode('P')
            .sender(sender)
            .altScheduleA(request.getAltScheduleA())
            .altScheduleB(request.getAltScheduleB())
            .altScheduleC(request.getAltScheduleC())
            .studentSender("student".equals(sender) ? studentService.search(request.getStudentId()) : null)
            .typeActivityCode(request.getTypeActivityCode())
            .build();
    }

    public AppointmentSentResponse mapToAppointmentSentResponse(Appointment appointment) {
        return AppointmentSentResponse.builder()
            .id(appointment.getId())
            .date(appointment.getDate() != null ? appointment.getDate().toString() : null)
            .startTime(appointment.getStartTime() != null ? appointment.getStartTime().toString() : null)
            .endTime(appointment.getEndTime() != null ? appointment.getEndTime().toString() : null)
            .appointmentMethod(appointment.getAppointmentMethod() != null ? appointment.getAppointmentMethod().getCode() : null)
            .appointmentReason(appointment.getAppointmentReason() != null ? appointment.getAppointmentReason().getCode() : null)
            .appointmentModality(appointment.getAppointmentModality() != null ? appointment.getAppointmentModality().toString() : null)
            .specificAppointmentMethod(appointment.getSpecificAppointmentMethod())
            .specificAppointmentReason(appointment.getSpecificAppointmentReason())
            .state(appointment.getAppointmentState() != null ? appointment.getAppointmentState().toString() : null)
            .typeActivity(appointment.getTypeActivity() != null ? appointment.getTypeActivity().toString() : null)
            .build();
    }

    public AppointmentReceivedResponse mapToAppointmentReceivedResponse(Appointment appointment) {
        return AppointmentReceivedResponse.builder()
                .id(appointment.getId())
                .date(appointment.getDate() != null ? appointment.getDate().toString() : null)
                .startTime(appointment.getStartTime() != null ? appointment.getStartTime().toString() : null)
                .endTime(appointment.getEndTime() != null ? appointment.getEndTime().toString() : null)
                .appointmentMethod(appointment.getAppointmentMethod() != null ? appointment.getAppointmentMethod().getCode() : null)
                .appointmentReason(appointment.getAppointmentReason() != null ? appointment.getAppointmentReason().getCode() : null)
                .appointmentModality(appointment.getAppointmentModality() != null ? appointment.getAppointmentModality().toString() : null)
                .specificAppointmentMethod(appointment.getSpecificAppointmentMethod())
                .specificAppointmentReason(appointment.getSpecificAppointmentReason())
                .state(appointment.getAppointmentState() != null ? appointment.getAppointmentState().toString() : null)
                .typeActivity(appointment.getTypeActivity() != null ? appointment.getTypeActivity().toString() : null)
                .altScheduleA(appointment.getAltScheduleA())
                .altScheduleB(appointment.getAltScheduleB())
                .altScheduleC(appointment.getAltScheduleC())
                .build();
    }

    private <E extends Enum<E>> E safeEnumValueOf(Class<E> enumClass, String value) {
        if (value == null || value.isEmpty()) {
            return null; // Permitimos null
        }

        try {
            return Enum.valueOf(enumClass, value);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Invalid value '" + value + "' for enum " + enumClass.getSimpleName()
            );
        }
    }
}
