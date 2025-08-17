package com.sistemas.dto.academic_schedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AcademicScheduleResponse {

    private String day;
    private String course;
    private String type;
    private String startTime;
    private String endTime;
}
