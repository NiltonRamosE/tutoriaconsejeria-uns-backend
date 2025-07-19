package com.sistemas.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "administrators")
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "administrator_id")
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

    public Gender getGender(){
        return Gender.fromCode(genderCode);
    }

    public void setGender(Gender gender){
        this.gender = gender;
        this.genderCode = gender.getCode();
    }
}
