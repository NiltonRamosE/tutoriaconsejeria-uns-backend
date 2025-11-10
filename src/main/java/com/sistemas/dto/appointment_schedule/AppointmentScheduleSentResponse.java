package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentSentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleSentResponse {
    private AppointmentSentResponse appointmentResponse;
    private List<String> receiverStudentsFullNames;
    private String senderFullName;
    private String receiverFullName;
}
