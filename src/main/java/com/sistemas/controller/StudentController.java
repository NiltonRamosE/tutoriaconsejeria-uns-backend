package com.sistemas.controller;

import com.sistemas.domain.*;
import com.sistemas.dto.student.AssignedInstructorResponse;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import com.sistemas.dto.student.StudentProfileResponse;
import com.sistemas.mapper.AcademicAssignmentMapper;
import com.sistemas.mapper.AppointmentMapper;
import com.sistemas.mapper.AppointmentScheduleMapper;
import com.sistemas.mapper.StudentMapper;
import com.sistemas.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/student", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Autowired
    private AppointmentScheduleService appointmentScheduleService;

    @Autowired
    private AppointmentScheduleMapper appointmentScheduleMapper;

    @Autowired
    private AcademicAssignmentService academicAssignmentService;

    @Autowired
    private AcademicAssignmentMapper academicAssignmentMapper;

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
        Student savedStudent = studentService.create(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity <StudentProfileResponse> getStudentById(
            @PathVariable("id") Long id) {

        StudentProfileResponse studentProfileResponse = studentMapper.mapToStudentProfileResponse(studentService.search(id));

        if (studentProfileResponse != null) {
            return new ResponseEntity<>(studentProfileResponse, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new StudentProfileResponse(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/assigned/instructor/{id}")
    public ResponseEntity<List<AssignedInstructorResponse>> getAssignedInstructor(@PathVariable("id") Long id) {
        List<AcademicAssignment> academicAssignments  = academicAssignmentService.findAcademicAssignmentsByStudentId(id);

        List<AssignedInstructorResponse> assignedInstructors = academicAssignments.stream()
            .map(academicAssignmentMapper::mapToAssignedInstructorResponse)
            .collect(Collectors.toMap(
                AssignedInstructorResponse::getId,
                response -> response,
                (existing, duplicate) -> {
                    existing.setBothActivities(true);
                    return existing;
                }
            ))
            .values()
            .stream()
            .toList();

        return new ResponseEntity<>(assignedInstructors, HttpStatus.OK);
    }

    @PostMapping("/appointment/individual")
    public ResponseEntity<AppointmentSchedule> scheduleIndividualAppointment(@Valid @RequestBody ScheduleIndividualAppointmentRequest request) {

        Instructor instructor = instructorService.search(request.getInstructorId());
        Student student = studentService.search(request.getStudentId());

        Appointment appointmentCreated = appointmentService.create(appointmentMapper.mapToAppointment(request));

        AppointmentSchedule appointmentSchedule = appointmentScheduleMapper.mapToAppointmentSchedule(
                request,
                student,
                instructor,
                appointmentCreated
        );

        return ResponseEntity.ok(appointmentScheduleService.create(appointmentSchedule));
    }

    @PostMapping("/appointment/group")
    public ResponseEntity<AppointmentSchedule> scheduleGroupAppointment(@Valid @RequestBody ScheduleIndividualAppointmentRequest request) {

        Instructor instructor = instructorService.search(request.getInstructorId());
        Student student = studentService.search(request.getStudentId());

        Appointment appointmentCreated = appointmentService.create(appointmentMapper.mapToAppointment(request));

        AppointmentSchedule appointmentSchedule = appointmentScheduleMapper.mapToAppointmentSchedule(
                request,
                student,
                instructor,
                appointmentCreated
        );

        return ResponseEntity.ok(appointmentScheduleService.create(appointmentSchedule));
    }
}
