package com.sistemas.domain.vo.student;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SocioeconomicInformation {

    @NotBlank(message = "El lugar de nacimiento no debe quedar vacío")
    private String placeOfBirth;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "El estado civil es obligatorio")
    private MaritalStatus maritalStatus;

    @Min(value = 0, message = "El número de hijos no puede ser negativo")
    private int numberOfChildren;

    private String currentJobOccupation;

    private String workCenter;

    @Min(value = 0, message = "La antigüedad en el trabajo no puede ser negativa")
    private int seniorityAtWork;

    @DecimalMin(value = "0.0", inclusive = true, message = "El ingreso mensual no puede ser negativo")
    private double monthlyFamilyIncome;

    @Size(min = 6, max = 9, message = "El teléfono debe tener entre 6 y 9 dígitos")
    private String homePhoneNumber;

    @Email(message = "El correo debe tener un formato válido")
    private String email;

    private String homeAddress;

    @Min(value = 1, message = "Debe haber al menos un miembro en el hogar")
    private int numberOfHouseHoldMembers;

    private String kinshipRelationship;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Debe seleccionar un tipo de vivienda")
    private HousingType housingType;
}
