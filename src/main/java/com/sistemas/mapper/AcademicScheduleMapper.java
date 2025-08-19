package com.sistemas.mapper;

import com.sistemas.domain.AcademicSchedule;
import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class AcademicScheduleMapper {
    public AcademicScheduleResponse mapToAcademicScheduleResponse(AcademicSchedule academicSchedule) {
        if (academicSchedule == null) {
            return null;
        }

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        return AcademicScheduleResponse.builder()
                .day(academicSchedule.getDay())
                .course(academicSchedule.getCourse())
                .type(academicSchedule.getAcademicScheduleTypeCode())
                .startTime(academicSchedule.getStartTime().format(timeFormatter))
                .endTime(academicSchedule.getEndTime().format(timeFormatter))
                .build();
    }
}
