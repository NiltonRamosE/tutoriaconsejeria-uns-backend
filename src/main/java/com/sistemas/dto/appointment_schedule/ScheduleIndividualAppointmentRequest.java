package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleIndividualAppointmentRequest implements AppointmentRequest {
    private char appointmentModalityCode;
    private String appointmentMethod;
    private String specificAppointmentMethod;
    private String appointmentReason;
    private String specificAppointmentReason;
    private char typeActivityCode;
    private Long studentId;
    private Long instructorId;
    private String altScheduleA;
    private String altScheduleB;
    private String altScheduleC;

}
