package com.sistemas.dto.student;

import com.sistemas.dto.appointment.AppointmentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleStudentResponse {
    private AppointmentResponse appointment;
    private String instructorFullName;
}