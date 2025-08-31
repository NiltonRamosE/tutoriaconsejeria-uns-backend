package com.sistemas.controller;

import com.sistemas.domain.*;
import com.sistemas.dto.appointment.AppointmentConfirmRequest;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleReceivedResponse;
import com.sistemas.dto.appointment_schedule.AppointmentScheduleSentResponse;
import com.sistemas.dto.appointment_schedule.ScheduleGroupAppointmentRequest;
import com.sistemas.dto.appointment_schedule.ScheduleIndividualAppointmentRequest;
import com.sistemas.dto.student.*;
import com.sistemas.mapper.AcademicAssignmentMapper;
import com.sistemas.mapper.AppointmentScheduleMapper;
import com.sistemas.mapper.StudentMapper;
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
@RequestMapping(path = "/student", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentScheduleService appointmentScheduleService;

    @Autowired
    private AppointmentScheduleMapper appointmentScheduleMapper;

    @Autowired
    private AcademicAssignmentService academicAssignmentService;

    @Autowired
    private AcademicAssignmentMapper academicAssignmentMapper;

    @Autowired
    private AppointmentFacadeService appointmentFacadeService;

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

        AppointmentSchedule appointmentSchedule = appointmentFacadeService.createIndividualAppointment(request, "student");

        return ResponseEntity.ok(appointmentSchedule);
    }

    @PostMapping("/appointment/group")
    public ResponseEntity<List<AppointmentSchedule>> scheduleGroupAppointment(@Valid @RequestBody ScheduleGroupAppointmentRequest request) {

        List<AppointmentSchedule> appointmentScheduleList = appointmentFacadeService.createGroupAppointment(request, "student");

        appointmentScheduleList.stream()
                .filter(a -> a.getStudent().getId().equals(request.getStudentId()))
                .findFirst()
                .ifPresent(a -> {
                    a.setAppointmentScheduleAttendance(AppointmentScheduleAttendance.CONFIRMADA);
                    appointmentScheduleService.update(a);
                });

        return ResponseEntity.ok(appointmentScheduleList);
    }

    @GetMapping("/appointments/sent/{id}")
    public ResponseEntity<List<AppointmentScheduleSentResponse>> getAppointmentsSent(@PathVariable Long id) {

        List<Appointment> appointments = appointmentService.findByStudentSenderId(id);

        List<Long> appointmentIds = appointments.stream()
                .map(Appointment::getId)
                .toList();

        List<AppointmentSchedule> appointmentScheduleList = appointmentScheduleService.findByAppointmentIdIn(appointmentIds);

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

        List<AppointmentSchedule> appointmentScheduleList = appointmentScheduleService.findAppointmentsForStudentWhereNotSender(id);

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

        if (appointmentFound.getAppointmentModality() == AppointmentModality.INDIVIDUAL){
            List<AppointmentSchedule> appointmentSchedules = appointmentScheduleService.findByAppointmentId(id);

            if (!appointmentSchedules.isEmpty()) {
                AppointmentSchedule appointmentScheduleIndividual = appointmentSchedules.getFirst();
                appointmentScheduleIndividual.setAppointmentScheduleAttendance(AppointmentScheduleAttendance.CONFIRMADA);
                appointmentScheduleService.update(appointmentScheduleIndividual);
            }
        }

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/appointments/cancel/{appointmentId}")
    public ResponseEntity<Void> cancelIndividualAppointment(@PathVariable Long appointmentId) {
        Appointment appointmentFound = appointmentService.search(appointmentId);

        appointmentFound.setAppointmentState(AppointmentState.CANCELADA);
        appointmentService.update(appointmentFound);

        List<AppointmentSchedule> appointmentSchedules = appointmentScheduleService.findByAppointmentId(appointmentId);
        AppointmentSchedule appointmentScheduleIndividual = appointmentSchedules.getFirst();
        appointmentScheduleIndividual.setAppointmentScheduleAttendance(AppointmentScheduleAttendance.RECHAZADA);
        appointmentScheduleService.update(appointmentScheduleIndividual);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/appointments/cancel/{appointmentId}/{studentId}")
    public ResponseEntity<Void> cancelGroupAppointmentAttendance(@PathVariable Long appointmentId, @PathVariable Long studentId) {
        List<AppointmentSchedule> appointmentSchedules = appointmentScheduleService.findByAppointmentId(appointmentId);
        appointmentSchedules.stream()
                .filter(a -> a.getStudent().getId().equals(studentId))
                .findFirst()
                .ifPresent(a -> {
                    a.setAppointmentScheduleAttendance(AppointmentScheduleAttendance.RECHAZADA);
                    appointmentScheduleService.update(a);
                });
        return ResponseEntity.noContent().build();
    }
}
