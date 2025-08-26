package com.sistemas.controller;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleReceivedResponse;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleSentResponse;
import com.sistemas.dto.appointment_schedule.ScheduleGroupAppointmentRequest;
import com.sistemas.dto.appointment_schedule.ScheduleIndividualAppointmentRequest;
import com.sistemas.dto.student.AssignedStudentResponse;
import com.sistemas.mapper.AcademicAssignmentMapper;
import com.sistemas.mapper.AppointmentScheduleMapper;
import com.sistemas.service.*;
import com.sistemas.service.implement.AppointmentFacadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/instructor", produces = "application/json")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

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

}
