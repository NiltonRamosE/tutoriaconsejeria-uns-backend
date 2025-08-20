package com.sistemas.mapper;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentMethod;
import com.sistemas.domain.AppointmentReason;
import com.sistemas.dto.student.AppointmentResponse;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AppointmentMapper {
    public Appointment mapToAppointment(ScheduleIndividualAppointmentRequest request) {
        return Appointment.builder()
                .appointmentMethod(safeEnumValueOf(AppointmentMethod.class, request.getAppointmentMethod()))
                .appointmentReason(safeEnumValueOf(AppointmentReason.class, request.getAppointmentReason()))
                .appointmentModalityCode(request.getAppointmentModalityCode())
                .specificAppointmentMethod(request.getSpecificAppointmentMethod())
                .specificAppointmentReason(request.getSpecificAppointmentReason())
                .appointmentStateCode('P') // Al momento de crear la cita, el estado es 'P' (Pendiente)
                .typeActivityCode(request.getTypeActivityCode())
                .build();
    }

    public AppointmentResponse mapToAppointmentResponse(Appointment appointment) {
        return AppointmentResponse.builder()
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
