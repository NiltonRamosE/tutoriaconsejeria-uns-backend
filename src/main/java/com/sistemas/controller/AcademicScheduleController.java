package com.sistemas.controller;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.AcademicSchedule;
import com.sistemas.domain.TypeActivity;
import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.dto.assignment.AssignmentResponse;
import com.sistemas.service.AcademicScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/academic-schedule", produces = "application/json")
public class AcademicScheduleController {

    @Autowired
    private AcademicScheduleService academicScheduleService;

    @GetMapping("")
    public ResponseEntity<List<AcademicScheduleResponse>> findByCycle(
            @RequestParam Integer cycle) {
        List<AcademicScheduleResponse> academicScheduleResponses = academicScheduleService.findByCycle(cycle).stream()
                .map(this::mapToAcademicScheduleResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(academicScheduleResponses, HttpStatus.OK);
    }


    private AcademicScheduleResponse mapToAcademicScheduleResponse(AcademicSchedule academicSchedule) {
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
