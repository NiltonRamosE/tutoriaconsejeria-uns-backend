package com.sistemas.dto.instructorSchedule;

import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstructorScheduleResponse {

    private String instructorName;
    private List<AcademicScheduleResponse> academicSchedule;
}
