package com.sistemas.dto.assessment;

import com.sistemas.domain.vo.assessment.InstructorAssessment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentInstructorResponse {
    private String instructorFullName;
    private String typeActivity;
    private String semester;
    private InstructorAssessment instructorAssessment;
}
