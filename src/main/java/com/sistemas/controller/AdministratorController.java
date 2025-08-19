package com.sistemas.controller;

import com.sistemas.domain.*;
import com.sistemas.dto.administrator.AdministratorRequest;
import com.sistemas.dto.administrator.AdministratorResponse;
import com.sistemas.dto.administrator.InstructorResponse;
import com.sistemas.dto.administrator.StudentResponse;
import com.sistemas.dto.assignment.AssignmentResponse;
import com.sistemas.service.AcademicAssignmentService;
import com.sistemas.service.AdministratorService;
import com.sistemas.service.InstructorService;
import com.sistemas.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/administrator", produces = "application/json")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private AcademicAssignmentService academicAssignmentService;

    @PostMapping("")
    public ResponseEntity<AdministratorResponse> createAdministrator(
            @Valid @RequestBody AdministratorRequest administratorRequest) {

        Administrator administrator = Administrator.builder()
                .name(administratorRequest.getAdministratorName())
                .paternalSurname(administratorRequest.getAdministratorPaternalSurname())
                .maternalSurname(administratorRequest.getAdministratorMaternalSurname())
                .password(administratorRequest.getPassword())
                .genderCode(administratorRequest.getGender())
                .build();

        Administrator savedAdministrator = administratorService.create(administrator);

        AdministratorResponse response = this.mapToAdministratorResponse(savedAdministrator);

        return ResponseEntity.ok(response);
    }

    @GetMapping("")
    public ResponseEntity<List<AdministratorResponse>> getIndex() {
        List<AdministratorResponse> administratorResponses = administratorService.listAll().stream()
                .map(this::mapToAdministratorResponse)
                .collect(Collectors.toList());

        return new ResponseEntity<>(administratorResponses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Administrator> getAdministratorById(
            @PathVariable("id") Long id) {

        Administrator administrator = administratorService.search(id);

        if (administrator != null) {
            return new ResponseEntity<>(administrator, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new Administrator(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity <AdministratorResponse> update(
            @RequestBody AdministratorRequest administratorRequest) {

        Administrator administrator = administratorService.search(administratorRequest.getId());
        administrator.setName(administratorRequest.getAdministratorName());
        administrator.setPaternalSurname(administratorRequest.getAdministratorPaternalSurname());
        administrator.setMaternalSurname(administratorRequest.getAdministratorMaternalSurname());
        administrator.setGenderCode(administratorRequest.getGender());

        if (administratorRequest.getPassword() != null && !administratorRequest.getPassword().isEmpty()) {
            administrator.setPassword(administratorRequest.getPassword());
        }

        Administrator updatedAdministrator = administratorService.update(administrator);

        AdministratorResponse response = this.mapToAdministratorResponse(updatedAdministrator);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Administrator> delete(@PathVariable("id") Long id) {

        administratorService.delete(id);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/students/early-stage")
    public ResponseEntity<List<StudentResponse>> getStudentsEarlyStage() {
        List<StudentResponse> studentResponses = studentService.getStudentsEarlyStage().stream()
                .map(this::mapToStudentResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(studentResponses, HttpStatus.OK);
    }

    @GetMapping("/students/late-stage")
    public ResponseEntity<List<StudentResponse>> getStudentsLateStage() {
        List<StudentResponse> studentResponses = studentService.getStudentsLateStage().stream()
                .map(this::mapToStudentResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(studentResponses, HttpStatus.OK);
    }

    @GetMapping("/students/irregular/early-stage")
    public ResponseEntity<List<StudentResponse>> getIrregularConditionStudentsEarlyStage() {
        List<StudentResponse> studentResponses = studentService.getIrregularConditionStudentsEarlyStage().stream()
                .map(this::mapToStudentResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(studentResponses, HttpStatus.OK);
    }

    @GetMapping("/students/irregular/late-stage")
    public ResponseEntity<List<StudentResponse>> getIrregularConditionStudentsLateStage() {
        List<StudentResponse> studentResponses = studentService.getIrregularConditionStudentsLateStage().stream()
                .map(this::mapToStudentResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(studentResponses, HttpStatus.OK);
    }

    @PostMapping("/students/assign")
    public ResponseEntity<Void> distributeStudentsAmongInstructors() {

        academicAssignmentService.distributeStudentsAmongInstructors();

        return ResponseEntity.ok().build();
    }

    @GetMapping("/students/list")
    public ResponseEntity<List<StudentResponse>> getStudentsList() {
        List<StudentResponse> studentResponses = studentService.listAll().stream()
                .map(this::mapToStudentResponse)
                .collect(Collectors.toList());

        return new ResponseEntity<>(studentResponses, HttpStatus.OK);
    }

    @GetMapping("/instructors/list")
    public ResponseEntity<List<InstructorResponse>> getInstructorsList() {
        List<InstructorResponse> instructorResponses = instructorService.listAll().stream()
                .map(this::mapToInstructorResponse)
                .collect(Collectors.toList());

        return new ResponseEntity<>(instructorResponses, HttpStatus.OK);
    }

    @GetMapping("/assign/list")
    public ResponseEntity<List<AssignmentResponse>> getAcademicAssignmentList() {
        List<AssignmentResponse> assignmentResponses = academicAssignmentService.listAll().stream()
                .map(this::mapToAssignmentResponse)
                .collect(Collectors.toList());

        return new ResponseEntity<>(assignmentResponses, HttpStatus.OK);
    }

    private AssignmentResponse mapToAssignmentResponse(AcademicAssignment assignment) {
        if (assignment == null || assignment.getStudent() == null || assignment.getInstructor() == null) {
            return null;
        }

        return AssignmentResponse.builder()
                .academicAssignmentId(assignment.getId())
                .studentId(assignment.getStudent().getId())
                .instructorId(assignment.getInstructor().getId())
                .studentName(
                        assignment.getStudent().getName() + " " +
                                assignment.getStudent().getPaternalSurname() + " " +
                                assignment.getStudent().getMaternalSurname()
                )
                .instructorName(
                        assignment.getInstructor().getName() + " " +
                                assignment.getInstructor().getPaternalSurname() + " " +
                                assignment.getInstructor().getMaternalSurname()
                )
                .studentInstitutionalEmail(assignment.getStudent().getInstitutionalEmail())
                .instructorInstitutionalEmail(assignment.getInstructor().getInstitutionalEmail())
                .studentCode(assignment.getStudent().getStudentCode())
                .typeActivity(TypeActivity.fromCode(assignment.getTypeActivityCode()).toString())
                .build();
    }

    private StudentResponse mapToStudentResponse(Student student) {
        if (student == null) {
            return null;
        }

        return StudentResponse.builder()
                .studentId(student.getId())
                .studentName(
                        student.getName() + " " +
                        student.getPaternalSurname() + " " +
                        student.getMaternalSurname()
                )
                .studentInstitutionalEmail(student.getInstitutionalEmail())
                .studentCode(student.getStudentCode())
                .studentCellphone(String.format("+51 %s", student.getCellphoneNumber()))
                .yearOfStudy(student.getYearOfStudy().toString())
                .build();
    }

    private InstructorResponse mapToInstructorResponse(Instructor instructor) {
        if (instructor == null) {
            return null;
        }

        return InstructorResponse.builder()
                .instructorId(instructor.getId())
                .instructorName(
                        instructor.getName() + " " +
                                instructor.getPaternalSurname() + " " +
                                instructor.getMaternalSurname()
                )
                .instructorInstitutionalEmail(instructor.getInstitutionalEmail())
                .instructorMaxAcademicDegree(instructor.getMaxAcademicDegree())
                .instructorAcademicDepartment(instructor.getAcademicDepartment())
                .instructorDedication(instructor.formatDedication(instructor.getInstructorDedication().toString()))
                .build();
    }

    private AdministratorResponse mapToAdministratorResponse(Administrator administrator) {
        if (administrator == null) {
            return null;
        }

        return AdministratorResponse.builder()
                .id(administrator.getId())
                .administratorName(administrator.getName())
                .administratorPaternalSurname(administrator.getPaternalSurname())
                .administratorMaternalSurname(administrator.getMaternalSurname())
                .administratorInstitutionalEmail(administrator.getInstitutionalEmail())
                .gender(administrator.getGender().toString())
                .build();
    }

}
