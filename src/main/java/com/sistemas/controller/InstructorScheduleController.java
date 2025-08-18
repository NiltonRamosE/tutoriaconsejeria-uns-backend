package com.sistemas.controller;

import com.sistemas.domain.AcademicSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.InstructorSchedule;
import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.dto.instructorSchedule.InstructorScheduleResponse;
import com.sistemas.service.InstructorScheduleService;
import com.sistemas.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/instructor-schedule", produces = "application/json")
public class InstructorScheduleController {
    @Autowired
    private InstructorScheduleService instructorScheduleService;

    @Autowired
    private InstructorService instructorService;

    @GetMapping("")
    public ResponseEntity<InstructorScheduleResponse> findInstructorScheduleByInstructor(
            @RequestParam String emailInstructor) {

        Optional<Instructor> instructorWanted = instructorService.findByInstitutionalEmail(emailInstructor);
        if (instructorWanted.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Instructor instructor = instructorWanted.get();

        List<InstructorSchedule> instructorSchedules = instructorScheduleService.findByInstructorId(instructor.getId());

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        List<AcademicScheduleResponse> academicScheduleResponses = instructorSchedules.stream()
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
                .collect(Collectors.toList());

        InstructorScheduleResponse response = InstructorScheduleResponse.builder()
                .instructorName(
                        instructor.getName() + " " +
                                instructor.getPaternalSurname() + " " +
                                instructor.getMaternalSurname()
                )
                .academicSchedule(academicScheduleResponses)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
