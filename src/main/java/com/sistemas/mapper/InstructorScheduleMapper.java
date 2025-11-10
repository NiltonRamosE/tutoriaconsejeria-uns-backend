package com.sistemas.mapper;

import com.sistemas.domain.AcademicSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.InstructorSchedule;
import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.dto.instructorSchedule.InstructorScheduleResponse;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class InstructorScheduleMapper {
    public InstructorScheduleResponse mapToInstructorScheduleResponse(List<InstructorSchedule> instructorScheduleList, Instructor instructor) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        List<AcademicScheduleResponse> academicScheduleResponses = instructorScheduleList.stream()
            .map(instructorSchedule -> {
                AcademicSchedule schedule = instructorSchedule.getAcademicSchedule();
                return AcademicScheduleResponse.builder()
                    .day(schedule.getDay())
                    .course(schedule.getCourse())
                    .type(schedule.getAcademicScheduleTypeCode())
                    .startTime(schedule.getStartTime().format(timeFormatter))
                    .endTime(schedule.getEndTime().format(timeFormatter))
                    .build();
            })
            .toList();

        return InstructorScheduleResponse.builder()
            .instructorName(
                instructor.getName() + " " +
                instructor.getPaternalSurname() + " " +
                instructor.getMaternalSurname()
            )
            .academicSchedule(academicScheduleResponses)
            .build();
    }
}
