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
@Table(name = "instructor_schedules")
public class InstructorSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_schedule_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "schedule_id",
            referencedColumnName = "schedule_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_instructor_schedules_academic_schedules"))
    private AcademicSchedule academicSchedule;

    @ManyToOne
    @JoinColumn(
            name = "instructor_id",
            referencedColumnName = "instructor_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_instructor_schedules_instructors"))
    private Instructor instructor;
}
