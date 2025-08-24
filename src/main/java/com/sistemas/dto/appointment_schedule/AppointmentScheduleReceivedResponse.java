package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentSentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleReceivedResponse {
    private AppointmentSentResponse appointmentResponse;
    private String fullName; // sender == student ? instructorFullName : studentFullName
    private String altScheduleA;
    private String altScheduleB;
    private String altScheduleC;
}
