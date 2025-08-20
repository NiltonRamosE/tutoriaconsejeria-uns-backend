package com.sistemas.controller;

import com.sistemas.domain.*;
import com.sistemas.dto.student.*;
import com.sistemas.mapper.AcademicAssignmentMapper;
import com.sistemas.mapper.AppointmentMapper;
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

        Instructor instructor = instructorService.search(request.getInstructorId());
        Student student = studentService.search(request.getStudentId());

        AppointmentSchedule appointmentSchedule = appointmentFacadeService.createIndividualAppointment(
            request,
            student,
            instructor,
            "student"
        );

        return ResponseEntity.ok(appointmentSchedule);
    }

    @PostMapping("/appointment/group")
    public ResponseEntity<List<AppointmentSchedule>> scheduleGroupAppointment(@Valid @RequestBody ScheduleGroupAppointmentRequest request) {

        Instructor instructor = instructorService.search(request.getInstructorId());

        List<Student> students = request.getStudentsId().stream()
            .map(studentService::search)
            .toList();

        List<AppointmentSchedule> appointmentScheduleList = appointmentFacadeService.createGroupAppointment(
                request,
                students,
                instructor,
                "student"
        );

        return ResponseEntity.ok(appointmentScheduleList);
    }

    @GetMapping("/appointments/sent/{id}")
    public ResponseEntity<List<AppointmentScheduleStudentResponse>> getAppointmentsSent(@PathVariable Long id) {
        return ResponseEntity.ok(getAppointmentsBySender(id, "student"));
    }

    @GetMapping("/appointments/received/{id}")
    public ResponseEntity<List<AppointmentScheduleStudentResponse>> getAppointmentsReceived(@PathVariable Long id) {
        return ResponseEntity.ok(getAppointmentsBySender(id, "instructor"));
    }

    private List<AppointmentScheduleStudentResponse> getAppointmentsBySender(Long studentId, String sender) {
        return appointmentScheduleService.findByStudentIdAndSender(studentId, sender).stream()
            .map(appointmentScheduleMapper::mapToAppointmentScheduleResponse)
            .toList();
    }

}
