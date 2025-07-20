package com.sistemas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "student_schedules")
public class StudentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_schedule_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "schedule_id",
            referencedColumnName = "schedule_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_student_schedules_academic_schedules"))
    private AcademicSchedule academicSchedule;

    @ManyToOne
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_student_schedules_students"))
    private Student student;

    @Column(nullable = false)
    @Min(value = 1, message = "La condición de matrícula debe ser al menos 1")
    @Max(value = 3, message = "La condición de matrícula debe ser como máximo 3")
    @NotBlank(message = "El campo condición de matrícula no debe quedar vacío")
    private Integer registrationCondition;
}
