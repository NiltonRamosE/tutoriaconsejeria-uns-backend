package com.sistemas.domain;

import jakarta.persistence.*;
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
}
