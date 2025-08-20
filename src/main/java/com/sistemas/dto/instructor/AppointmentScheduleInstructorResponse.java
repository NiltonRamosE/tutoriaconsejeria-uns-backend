package com.sistemas.dto.instructor;

import com.sistemas.dto.student.AppointmentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleInstructorResponse {
    private AppointmentResponse appointment;
    private String studentFullName;
}
