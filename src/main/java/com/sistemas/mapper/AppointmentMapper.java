package com.sistemas.mapper;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentMethod;
import com.sistemas.domain.AppointmentReason;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import org.springframework.stereotype.Component;

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

    private <E extends Enum<E>> E safeEnumValueOf(Class<E> enumClass, String value) {
        try {
            return Enum.valueOf(enumClass, value);
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IllegalArgumentException("Invalid value '" + value + "' for enum " + enumClass.getSimpleName());
        }
    }
}
