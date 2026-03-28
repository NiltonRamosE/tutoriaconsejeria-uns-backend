package com.sistemas.mapper;

import com.sistemas.AppProperties;
import com.sistemas.domain.Assessment;
import com.sistemas.domain.vo.assessment.InstructorAssessment;
import com.sistemas.domain.vo.assessment.StudentAssessment;
import com.sistemas.dto.assessment.AssessmentInstructorResponse;
import com.sistemas.dto.assessment.AssessmentRequest;
import com.sistemas.dto.assessment.AssessmentStudentResponse;
import com.sistemas.service.InstructorService;
import com.sistemas.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AssessmentMapper {

    @Autowired
    private StudentService studentService;

    @Autowired
    private InstructorService instructorService;

    private final AppProperties appProperties;

    public Assessment mapToStudentAssessment(AssessmentRequest assessmentRequest){

        StudentAssessment studentAssessment = StudentAssessment.builder()
                .questions(assessmentRequest.getQuestions())
                .observation(assessmentRequest.getObservation())
                .suggestion(assessmentRequest.getSuggestion())
                .build();

        return Assessment.builder()
                .student(studentService.search(assessmentRequest.getStudentId()))
                .instructor(instructorService.search(assessmentRequest.getInstructorId()))
                .typeActivityCode(assessmentRequest.getTypeActivity().charAt(0))
                .studentAssessment(studentAssessment)
                .semester(appProperties.getSemester())
                .build();
    }

    public Assessment mapToInstructorAssessment(AssessmentRequest assessmentRequest){

        InstructorAssessment instructorAssessment = InstructorAssessment.builder()
                .questions(assessmentRequest.getQuestions())
                .observation(assessmentRequest.getObservation())
                .suggestion(assessmentRequest.getSuggestion())
                .build();

        return Assessment.builder()
                .student(studentService.search(assessmentRequest.getStudentId()))
                .instructor(instructorService.search(assessmentRequest.getInstructorId()))
                .typeActivityCode(assessmentRequest.getTypeActivity().charAt(0))
                .instructorAssessment(instructorAssessment)
                .semester(appProperties.getSemester())
                .build();
    }

    public AssessmentStudentResponse mapToStudentAssessmentResponse(Assessment assessment){
        return AssessmentStudentResponse.builder()
                .studentFullName(
                        assessment.getStudent().getName() + " " +
                        assessment.getStudent().getPaternalSurname() + " " +
                        assessment.getStudent().getMaternalSurname()
                )
                .semester(assessment.getSemester())
                .typeActivity(String.valueOf(assessment.getTypeActivity().getCode()))
                .studentAssessment(assessment.getStudentAssessment())
                .build();
    }

    public AssessmentInstructorResponse mapToInstructorAssessmentResponse(Assessment assessment){
        return AssessmentInstructorResponse.builder()
                .instructorFullName(
                        assessment.getInstructor().getName() + " " +
                        assessment.getInstructor().getPaternalSurname() + " " +
                        assessment.getInstructor().getMaternalSurname()
                )
                .semester(assessment.getSemester())
                .typeActivity(String.valueOf(assessment.getTypeActivity().getCode()))
                .instructorAssessment(assessment.getInstructorAssessment())
                .build();
    }
}
