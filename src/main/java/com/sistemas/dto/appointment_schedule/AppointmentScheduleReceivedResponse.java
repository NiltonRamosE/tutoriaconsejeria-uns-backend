package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentReceivedResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleReceivedResponse {
    private AppointmentReceivedResponse appointmentResponse;
    private List<StudentAttendanceResponse> receiverStudents;
    private String senderFullName;
    private String receiverFullName;
}
