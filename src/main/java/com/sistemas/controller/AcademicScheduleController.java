package com.sistemas.controller;

import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.mapper.AcademicScheduleMapper;
import com.sistemas.service.AcademicScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.toList());
        return new ResponseEntity<>(academicScheduleResponses, HttpStatus.OK);
    }
}
