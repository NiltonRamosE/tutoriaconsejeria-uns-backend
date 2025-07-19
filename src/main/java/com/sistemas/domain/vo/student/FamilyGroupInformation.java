package com.sistemas.domain.vo.student;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class FamilyGroupInformation {

    @NotBlank(message = "El nivel educativo del padre no debe quedar vacío")
    @Size(max = 50, message = "El nivel educativo del padre no debe superar los 50 caracteres")
    private String fatherEducationLevel;

    @NotBlank(message = "El nivel educativo de la madre no debe quedar vacío")
    @Size(max = 50, message = "El nivel educativo de la madre no debe superar los 50 caracteres")
    private String motherEducationLevel;

    @NotBlank(message = "La ocupación del padre no debe quedar vacía")
    @Size(max = 50, message = "La ocupación del padre no debe superar los 50 caracteres")
    private String fatherOccupation;

    @NotBlank(message = "La ocupación de la madre no debe quedar vacía")
    @Size(max = 50, message = "La ocupación de la madre no debe superar los 50 caracteres")
    private String motherOccupation;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "La composición familiar no debe quedar vacía")
    private FamilyComposition familyComposition;

    @Min(value = 0, message = "El número total de hermanos no puede ser negativo")
    @Max(value = 20, message = "El número total de hermanos no puede ser mayor a 20")
    private int totalSiblings;

    @Min(value = 0, message = "El número de dependientes no puede ser negativo")
    @Max(value = 20, message = "El número de dependientes no puede ser mayor a 20")
    private int numberOfDependents;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "El tipo de familia no debe quedar vacío")
    private FamilyType familyType;

    @NotBlank(message = "El número de celular del apoderado no debe quedar vacío")
    @Size(min = 9, max = 9, message = "El número de celular debe tener 9 dígitos")
    private String representativePhoneNumber;
}
