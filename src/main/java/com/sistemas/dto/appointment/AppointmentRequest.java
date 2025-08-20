package com.sistemas.dto.appointment;

public interface AppointmentRequest {
    String getAppointmentMethod();
    String getAppointmentReason();
    char getAppointmentModalityCode();
    String getSpecificAppointmentMethod();
    String getSpecificAppointmentReason();
    char getTypeActivityCode();
}
