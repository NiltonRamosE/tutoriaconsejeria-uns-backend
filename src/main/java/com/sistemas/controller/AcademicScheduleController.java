package com.sistemas.controller;

import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.mapper.AcademicScheduleMapper;
import com.sistemas.service.AcademicScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/academic-schedule", produces = "application/json")
public class AcademicScheduleController {

    @Autowired
    private AcademicScheduleService academicScheduleService;

    @Autowired
    private AcademicScheduleMapper academicScheduleMapper;

    @GetMapping("")
    public ResponseEntity<List<AcademicScheduleResponse>> findByCycle(
            @RequestParam Integer cycle) {
        List<AcademicScheduleResponse> academicScheduleResponses = academicScheduleService.findByCycle(cycle).stream()
                .map(academicScheduleMapper::mapToAcademicScheduleResponse)
                .toList();
        return new ResponseEntity<>(academicScheduleResponses, HttpStatus.OK);
    }

    @GetMapping("/compare/{studentId}/{instructorId}")
    public ResponseEntity<?> getBusySchedulesByStudentAndInstructor(
            @PathVariable("studentId") Long studentId, @PathVariable("instructorId") Long instructorId) {

        List<Object[]> busySchedules = academicScheduleService.findAcademicScheduleByStudentAndInstructor(studentId, instructorId);

        return new ResponseEntity<>(busySchedules, HttpStatus.OK);
    }
}
