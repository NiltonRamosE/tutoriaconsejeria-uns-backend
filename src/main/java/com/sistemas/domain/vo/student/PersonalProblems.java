package com.sistemas.domain.vo.student;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PersonalProblems {

    @Enumerated(EnumType.STRING)
    private PersonalProblemType personalProblemType;

    @Size(max = 200, message = "La descripción de otros problemas no debe exceder los 200 caracteres")
    private String otherProblems;

    @NotBlank(message = "El nombre del apoderado no debe quedar vacío")
    @Size(max = 100, message = "El nombre del apoderado no puede tener más de 100 caracteres")
    private String nameOfTheRepresentative;
}
