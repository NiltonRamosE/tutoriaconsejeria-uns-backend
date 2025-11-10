package com.sistemas.domain.vo.assessment;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AssessedQuestion {

    @NotNull
    private Integer order;

    @NotBlank
    private String question;

    @NotNull
    @Min(0) @Max(4)
    private Integer score;
}
