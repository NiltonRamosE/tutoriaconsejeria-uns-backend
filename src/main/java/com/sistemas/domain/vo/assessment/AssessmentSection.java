package com.sistemas.domain.vo.assessment;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class AssessmentSection {

    @Valid
    @NotEmpty(message = "Debe incluirse al menos una pregunta evaluada")
    private List<AssessedQuestion> questions;

    private String observation;

    private String sugestion;
}
