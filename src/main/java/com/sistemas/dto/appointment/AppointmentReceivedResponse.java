package com.sistemas.dto.appointment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentReceivedResponse {
    private Long id;
    private String date;
    private String startTime;
    private String endTime;
    private String appointmentModality;
    private String appointmentMethod;
    private String specificAppointmentMethod;
    private String appointmentReason;
    private String specificAppointmentReason;
    private String typeActivity;
    private String state;
    private String altScheduleA;
    private String altScheduleB;
    private String altScheduleC;
}
