package com.sistemas.dto.appointment_schedule;

import com.sistemas.domain.AppointmentScheduleAttendance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentAttendanceResponse {
    private Long studentId;
    private String fullName;
    private AppointmentScheduleAttendance attendance;
}
