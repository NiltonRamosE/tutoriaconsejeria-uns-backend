package com.sistemas.dto.appointment_schedule;

import com.sistemas.dto.appointment.AppointmentRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleGroupAppointmentRequest implements AppointmentRequest, AppointmentRequestWithAltSchedule {
    private char appointmentModalityCode;
    private String appointmentMethod;
    private String specificAppointmentMethod;
    private String appointmentReason;
    private String specificAppointmentReason;
    private char typeActivityCode;
    private List<Long> studentsId;
    private Long instructorId;
    private String altScheduleA;
    private String altScheduleB;
    private String altScheduleC;
}
