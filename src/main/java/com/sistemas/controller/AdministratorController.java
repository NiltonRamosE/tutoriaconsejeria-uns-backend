package com.sistemas.controller;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.Administrator;
import com.sistemas.domain.Student;
import com.sistemas.service.AcademicAssignmentService;
import com.sistemas.service.AdministratorService;
import com.sistemas.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/administrator", produces = "application/json")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private AcademicAssignmentService academicAssignmentService;


    @PostMapping("")
    public ResponseEntity<Administrator> createAdministrator(@Valid @RequestBody Administrator administrator) {
        Administrator savedAdministrator = administratorService.create(administrator);
        return ResponseEntity.ok(savedAdministrator);
    }

    @GetMapping("")
    public ResponseEntity<List<Administrator>> getIndex() {

        return new ResponseEntity<>(administratorService.listAll(), HttpStatus.OK);
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
    public ResponseEntity <Administrator> update(
            @RequestBody Administrator administrator) {

        Administrator putAdministrator = administratorService.update(administrator);
        return new ResponseEntity<>(putAdministrator, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Administrator> delete(@PathVariable("id") Long id) {

        administratorService.delete(id);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/students/early-stage")
    public ResponseEntity<List<Student>> getStudentsEarlyStage() {

        return new ResponseEntity<>(studentService.getStudentsEarlyStage(), HttpStatus.OK);
    }

    @GetMapping("/students/late-stage")
    public ResponseEntity<List<Student>> getStudentsLateStage(
            @PathVariable("semester") String semester) {

        return new ResponseEntity<>(studentService.getStudentsLateStage(), HttpStatus.OK);
    }

    @GetMapping("/students/irregular/early-stage")
    public ResponseEntity<List<Student>> getIrregularConditionStudentsEarlyStage() {

        return new ResponseEntity<>(studentService.getIrregularConditionStudentsEarlyStage(), HttpStatus.OK);
    }

    @GetMapping("/students/irregular/late-stage")
    public ResponseEntity<List<Student>> getIrregularConditionStudentsLateStage() {

        return new ResponseEntity<>(studentService.getIrregularConditionStudentsLateStage(), HttpStatus.OK);
    }

    @PostMapping("/students/assign")
    public ResponseEntity<Void> distributeStudentsAmongInstructors() {
        academicAssignmentService.distributeStudentsAmongInstructors();

        return ResponseEntity.ok().build();
    }

    @GetMapping("/assign/list")
    public ResponseEntity<List<AcademicAssignment>> getAcademicAssignmentList() {
        List<AcademicAssignment> academicAssignmentList = academicAssignmentService.listAll();
        return new ResponseEntity<>(academicAssignmentList, HttpStatus.OK);
    }
}
