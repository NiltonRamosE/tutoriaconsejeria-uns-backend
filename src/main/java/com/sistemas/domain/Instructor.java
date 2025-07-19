package com.sistemas.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Long id;

    @Column(length = 50, nullable = false)
    @Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
    @NotBlank(message = "El campo nombre no debe quedar vacío")
    private String name;

    @Column(length = 20, nullable = false)
    @Size(max = 20, message = "El apellido paterno no puede tener más de 20 caracteres")
    @NotBlank(message = "El campo apellido paterno no debe quedar vacío")
    private String paternalSurname;

    @Column(length = 20, nullable = false)
    @Size(max = 20, message = "El apellido materno no puede tener más de 20 caracteres")
    @NotBlank(message = "El campo apellido materno no debe quedar vacío")
    private String maternalSurname;

    @Column(length = 50, nullable = false)
    @Size(max = 50, message = "La escolaridad no puede tener más de 50 caracteres")
    @NotBlank(message = "La escolaridad no debe quedar vacío")
    private String profession;

    @Column(length = 15, nullable = false)
    @Size(max = 15, message = "El máximo grado académico no puede tener más de 15 caracteres")
    @NotBlank(message = "El máximo grado académico no debe quedar vacío")
    private String maxAcademicDegree;

    @Column(length = 20, nullable = false)
    @Size(max = 20, message = "El departamento académico no puede tener más de 20 caracteres")
    @NotBlank(message = "El departamento académico no debe quedar vacío")
    private String academicDepartment;

    @Column(name = "condition", length = 1, nullable = false)
    private char instructorConditionCode;

    @Transient
    private InstructorCondition instructorCondition;

    @Column(name = "category", length = 1, nullable = false)
    private char instructorCategoryCode;

    @Transient
    private InstructorCategory instructorCategory;

    @Column(name = "dedication", length = 3, nullable = false, columnDefinition = "CHAR(3)")
    private String instructorDedicationCode;

    @Transient
    private InstructorDedication instructorDedication;

    @Column(length = 9, nullable = false, unique = true, columnDefinition = "CHAR(9)")
    @Size(min = 9, max = 9, message = "El número de celular debe tener exactamente 9 caracteres")
    @NotBlank(message = "El campo celular no debe quedar vacío")
    private String cellphoneNumber;

    @Column(nullable = false)
    @Min(value = 0, message = "Los años de experiencia no deben ser negativos")
    @NotNull(message = "Los años de experiencia no debe quedar vacío")
    private Integer yearsOfTeaching;

    @Column(name = "gender", length = 1)
    private char genderCode;

    @Transient
    private Gender gender;

    @Column(length = 100, nullable = false, unique = true)
    @Size(max = 100, message = "El correo institucional no puede tener más de 100 caracteres")
    @NotBlank(message = "El campo correo institucional no debe quedar vacío")
    @Email(message = "El correo institucional debe tener un formato válido")
    private String institutionalEmail;

    @JsonIgnore
    @Column(length = 100, nullable = false)
    @NotBlank(message = "El campo contraseña no debe quedar vacío")
    private String password;

    @Column(length = 9)
    @Size(min = 6, max = 9, message = "El teléfono debe tener entre 6 y 9 dígitos")
    private String homePhoneNumber;

    public InstructorCondition getInstructorCondition(){
        return InstructorCondition.fromCode(instructorConditionCode);
    }

    public void setInstructorCondition(InstructorCondition instructorCondition){
        this.instructorCondition = instructorCondition;
        this.instructorConditionCode = instructorCondition.getCode();
    }

    public InstructorCategory getInstructorCategory(){
        return InstructorCategory.fromCode(instructorCategoryCode);
    }

    public void setInstructorCategory(InstructorCategory instructorCategory){
        this.instructorCategory = instructorCategory;
        this.instructorCategoryCode = instructorCategory.getCode();
    }

    public InstructorDedication getInstructorDedication(){
        return InstructorDedication.fromCode(instructorDedicationCode);
    }

    public void setInstructorDedication(InstructorDedication instructorDedication){
        this.instructorDedication = instructorDedication;
        this.instructorDedicationCode = instructorDedication.getCode();
    }
    public Gender getGender(){
        return Gender.fromCode(genderCode);
    }

    public void setGender(Gender gender){
        this.gender = gender;
        this.genderCode = gender.getCode();
    }
}
