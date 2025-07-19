package com.sistemas.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sistemas.domain.vo.student.FamilyGroupInformation;
import com.sistemas.domain.vo.student.PersonalProblems;
import com.sistemas.domain.vo.student.SocioeconomicInformation;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
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

    @Column(length = 9, nullable = false, unique = true, columnDefinition = "CHAR(9)")
    @Size(min = 9, max = 9, message = "El código de matrícula debe tener exactamente 9 caracteres")
    @NotBlank(message = "El campo codigo de matricula no debe quedar vacío")
    private String studentCode;

    @Column(length = 50, nullable = false, unique = true)
    @Size(max = 50, message = "El correo institucional no puede tener más de 50 caracteres")
    @NotBlank(message = "El campo correo institucional no debe quedar vacío")
    @Email(message = "El correo institucional debe tener un formato válido")
    private String institutionalEmail;

    @Column(nullable = false)
    @Min(value = 1, message = "El año de estudio debe ser al menos 1")
    @Max(value = 10, message = "El año de estudio no debe ser mayor que 10")
    @NotNull(message = "El campo año de estudio no debe quedar vacío")
    private Integer yearOfStudy;

    @Column(name = "gender", length = 1)
    private char genderCode;

    @Transient
    private Gender gender;

    @Past(message = "Ingrese una fecha válida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(length = 9, nullable = false, unique = true, columnDefinition = "CHAR(9)")
    @Size(min = 9, max = 9, message = "El número de celular debe tener exactamente 9 caracteres")
    @NotBlank(message = "El campo celular no debe quedar vacío")
    private String cellphoneNumber;

    @JsonIgnore
    @Column(length = 100, nullable = false)
    @NotBlank(message = "El campo contraseña no debe quedar vacío")
    private String password;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private SocioeconomicInformation socioeconomicInformation;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private PersonalProblems personalProblems;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private FamilyGroupInformation familyGroupInformation;

    public Gender getGender(){
        return Gender.fromCode(genderCode);
    }

    public void setGender(Gender gender){
        this.gender = gender;
        this.genderCode = gender.getCode();
    }
}
