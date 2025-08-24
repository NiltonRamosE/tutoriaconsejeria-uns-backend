package com.sistemas.controller;

import com.sistemas.domain.*;
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

        return ResponseEntity.ok(appointmentScheduleList);
    }

    @GetMapping("/appointments/sent/{id}")
    public ResponseEntity<List<AppointmentScheduleSentResponse>> getAppointmentsSent(@PathVariable Long id) {

        List<Appointment> appointments = appointmentService.findByStudentSenderIdAndSender(id, "student");

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
/*
    @GetMapping("/appointments/received/{id}")
    public ResponseEntity<List<AppointmentScheduleReceivedResponse>> getAppointmentsReceived(@PathVariable Long id) {

        List<AppointmentScheduleReceivedResponse> appointmentScheduleReceived = appointmentService.findByStudentSenderIdAndSender(id, "instructor").stream()
                .map(appointmentScheduleMapper::mapToAppointmentScheduleReceivedResponse)
                .toList();

        return ResponseEntity.ok(appointmentScheduleReceived);
    }
*/
}
