package com.sistemas.controller;

import com.sistemas.domain.*;
import com.sistemas.dto.academic_schedule.AcademicScheduleResponse;
import com.sistemas.dto.administrator.StudentResponse;
import com.sistemas.dto.appointment.AppointmentConfirmRequest;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleReceivedResponse;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleSentResponse;
import com.sistemas.dto.appointment_schedule.ScheduleGroupAppointmentRequest;
import com.sistemas.dto.appointment_schedule.ScheduleIndividualAppointmentRequest;
import com.sistemas.dto.assessment.AssessmentRequest;
import com.sistemas.dto.student.AssignedStudentResponse;
import com.sistemas.dto.student.StudentProfileResponse;
import com.sistemas.mapper.*;
import com.sistemas.service.*;
import com.sistemas.service.implement.AppointmentFacadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/instructor", produces = "application/json")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentFacadeService appointmentFacadeService;

    @Autowired
    private AcademicAssignmentService academicAssignmentService;

    @Autowired
    private AcademicAssignmentMapper academicAssignmentMapper;

    @Autowired
    private AppointmentScheduleService appointmentScheduleService;

    @Autowired
    private AppointmentScheduleMapper appointmentScheduleMapper;

    @Autowired
    private  AcademicScheduleService academicScheduleService;

    @Autowired
    private AcademicScheduleMapper academicScheduleMapper;

    @Autowired
    private AssessmentService assessmentService;

    @Autowired
    private AssessmentMapper assessmentMapper;

    @PostMapping("")
    public ResponseEntity<Instructor> createInstructor(@Valid @RequestBody Instructor instructor) {
        Instructor savedInstructor = instructorService.create(instructor);
        return ResponseEntity.ok(savedInstructor);
    }

    @GetMapping("/assigned/{id}")
    public ResponseEntity<List<AssignedStudentResponse>> getStudentsAssignedByInstructor(@PathVariable("id") Long id) {
        List<AcademicAssignment> academicAssignments  = academicAssignmentService.findAcademicAssignmentsByInstructorId(id);

        List<AssignedStudentResponse> assignedStudentResponses = academicAssignments.stream()
                .map(academicAssignmentMapper::mapToAssignedStudentResponse)
                .toList();

        return new ResponseEntity<>(assignedStudentResponses, HttpStatus.OK);
    }

    @GetMapping("/list/assigned/{id}")
    public ResponseEntity<List<StudentResponse>> getListStudentsAssignedByInstructor(@PathVariable("id") Long id) {
        List<AcademicAssignment> academicAssignments  = academicAssignmentService.findAcademicAssignmentsByInstructorId(id);

        List<StudentResponse> studentResponse = academicAssignments.stream()
                .map(academicAssignmentMapper::mapToStudentResponse)
                .toList();
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }

    @PostMapping("/appointment/individual")
    public ResponseEntity<AppointmentSchedule> scheduleIndividualAppointment(@Valid @RequestBody ScheduleIndividualAppointmentRequest request) {

        AppointmentSchedule appointmentSchedule = appointmentFacadeService.createIndividualAppointment(request, "instructor");

        return ResponseEntity.ok(appointmentSchedule);
    }

    @PostMapping("/appointment/group")
    public ResponseEntity<List<AppointmentSchedule>> scheduleGroupAppointment(@Valid @RequestBody ScheduleGroupAppointmentRequest request) {

        List<AppointmentSchedule> appointmentScheduleList = appointmentFacadeService.createGroupAppointment(request, "instructor");

        return ResponseEntity.ok(appointmentScheduleList);
    }

    @GetMapping("/appointments/sent/{id}")
    public ResponseEntity<List<AppointmentScheduleSentResponse>> getAppointmentsSent(@PathVariable Long id) {

        List<AppointmentSchedule> appointmentScheduleList = appointmentScheduleService.findByInstructorIdAndSender(id, "instructor");

        Map<Long, List<AppointmentSchedule>> schedulesGrouped =
                appointmentScheduleList.stream()
                        .collect(Collectors.groupingBy(as -> as.getAppointment().getId()));

        List<AppointmentScheduleSentResponse> response = schedulesGrouped.values().stream()
                .map(appointmentScheduleMapper::mapToAppointmentScheduleSentResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/appointments/received/{id}")
    public ResponseEntity<List<AppointmentScheduleReceivedResponse>> getAppointmentsReceived(@PathVariable Long id) {

        List<AppointmentSchedule> appointmentScheduleList = appointmentScheduleService.findByInstructorIdAndSender(id, "student");

        Map<Long, List<AppointmentSchedule>> schedulesGrouped =
                appointmentScheduleList.stream()
                        .collect(Collectors.groupingBy(as -> as.getAppointment().getId()));

        List<AppointmentScheduleReceivedResponse> response = schedulesGrouped.values().stream()
                .map(appointmentScheduleMapper::mapToAppointmentScheduleReceivedResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @PutMapping("/appointments/confirm/{id}")
    public ResponseEntity<Void> putAppointmentConfirm(@PathVariable Long id, @Valid @RequestBody AppointmentConfirmRequest appointmentConfirmRequest) {
        Appointment appointmentFound = appointmentService.search(id);

        LocalDateTime dateTime = LocalDateTime.parse(appointmentConfirmRequest.getChosenDateTime());

        appointmentFound.setDate(dateTime.toLocalDate());
        appointmentFound.setStartTime(dateTime.toLocalTime());
        appointmentFound.setEndTime(dateTime.toLocalTime().plusHours(1));
        appointmentFound.setAppointmentState(AppointmentState.ACEPTADA);
        appointmentService.update(appointmentFound);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/appointments/cancel/{id}")
    public ResponseEntity<Void> putAppointmentCancel(@PathVariable Long id) {
        Appointment appointmentFound = appointmentService.search(id);
        appointmentFound.setAppointmentState(AppointmentState.CANCELADA);
        appointmentService.update(appointmentFound);

        List<AppointmentSchedule> appointmentSchedules = appointmentScheduleService.findByAppointmentId(id);

        appointmentSchedules.forEach(appointmentSchedule -> {
            appointmentSchedule.setAppointmentScheduleAttendance(AppointmentScheduleAttendance.RECHAZADA);
            appointmentScheduleService.update(appointmentSchedule);
        });

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/view/student/schedule/{id}")
    public ResponseEntity<List<AcademicScheduleResponse>> getStudentSchedule(@PathVariable Long id) {
        List<AcademicScheduleResponse> academicScheduleResponse = academicScheduleService.findByStudentSchedulesStudentId(id).stream()
                .map(academicSchedule -> academicScheduleMapper.mapToAcademicScheduleResponse(academicSchedule)).toList();
        return ResponseEntity.ok(academicScheduleResponse);
    }

    @PostMapping("/assessment/student")
    public ResponseEntity<Assessment> evaluateStudent(@Valid @RequestBody AssessmentRequest assessmentRequest) {
        Assessment assessment =  assessmentService.create(assessmentMapper.mapToStudentAssessment(assessmentRequest));
        return ResponseEntity.ok(assessment);
    }
}
