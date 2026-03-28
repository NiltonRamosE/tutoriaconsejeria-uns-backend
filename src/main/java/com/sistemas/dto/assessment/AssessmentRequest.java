package com.sistemas.dto.assessment;

import com.sistemas.domain.vo.assessment.AssessedQuestion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentRequest {
    private Long studentId;
    private Long instructorId;
    private String typeActivity;
    @NotEmpty
    @Valid
    private List<AssessedQuestion> questions;
    private String observation;
    private String suggestion;
}
