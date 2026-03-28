package com.sistemas.dto.assessment;

import com.sistemas.domain.vo.assessment.StudentAssessment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentStudentResponse {
    private String studentFullName;
    private String typeActivity;
    private String semester;
    private StudentAssessment studentAssessment;
}
