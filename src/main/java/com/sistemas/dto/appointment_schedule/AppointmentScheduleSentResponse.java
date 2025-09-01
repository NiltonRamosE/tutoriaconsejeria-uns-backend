package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentSentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleSentResponse {
    private AppointmentSentResponse appointmentResponse;
    private List<StudentAttendanceResponse> receiverStudents;
    private Map<String, Long> altScheduleCounts;
    private String senderFullName;
    private String receiverFullName;
}
