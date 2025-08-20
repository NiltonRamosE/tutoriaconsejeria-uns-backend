package com.sistemas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "appointment_schedules")
public class AppointmentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_schedule_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "appointment_id",
            referencedColumnName = "appointment_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_appointment_schedules_appointments"))
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_appointment_schedules_students"))
    private Student student;

    @ManyToOne
    @JoinColumn(
            name = "instructor_id",
            referencedColumnName = "instructor_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_appointment_schedules_instructors"))
    private Instructor instructor;

    @Column(length = 25, name = "alt_schedule_a")
    @NotBlank(message = "El campo horario alternativo A no debe quedar vacío")
    private String altScheduleA;

    @Column(length = 25, name = "alt_schedule_b")
    @NotBlank(message = "El campo horario alternativo B no debe quedar vacío")
    private String altScheduleB;

    @Column(length = 25, name = "alt_schedule_c")
    @NotBlank(message = "El campo horario alternativo C no debe quedar vacío")
    private String altScheduleC;

    @Column(length = 10)
    @NotBlank(message = "El campo remitente no debe quedar vacío")
    private String sender;
}
