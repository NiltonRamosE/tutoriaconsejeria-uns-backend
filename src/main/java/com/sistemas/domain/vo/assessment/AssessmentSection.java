package com.sistemas.domain.vo.assessment;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssessmentSection {

    @Valid
    @NotEmpty(message = "Debe incluirse al menos una pregunta evaluada")
    private List<AssessedQuestion> questions;

    private String observation;

    private String suggestion;
}
