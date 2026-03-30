package com.sistemas.controller;

import com.sistemas.domain.Assessment;
import com.sistemas.mapper.AssessmentMapper;
import com.sistemas.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/assessment", produces = "application/json")
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @Autowired
    private AssessmentMapper assessmentMapper;


    @GetMapping("/{id}")
    public ResponseEntity<?> getAssessmentById(@PathVariable Long id) {

        Assessment assessment = assessmentService.search(id);

        if (assessment == null) {
            return ResponseEntity.notFound().build();
        }

        if (assessment.getInstructorAssessment() != null) {
            return ResponseEntity.ok(
                    assessmentMapper.mapToInstructorAssessmentResponse(assessment)
            );
        }

        return ResponseEntity.ok(
                assessmentMapper.mapToStudentAssessmentResponse(assessment)
        );
    }

    @GetMapping("/enabled")
    public ResponseEntity<?> isEnabledAssessment(
            @RequestParam Long studentId,
            @RequestParam Long instructorId,
            @RequestParam String typeActivity,
            @RequestParam boolean isStudentEvaluating
    ) {

        Optional<Assessment> assessment = assessmentService.findAssessment(
                studentId,
                instructorId,
                typeActivity.charAt(0),
                isStudentEvaluating
        );

        if (assessment.isPresent()) {
            return ResponseEntity.ok(assessment.get().getId());
        }

        return ResponseEntity.noContent().build();
    }
}
