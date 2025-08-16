package com.sistemas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "academic_schedules")
public class AcademicSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long id;

    @Column(length = 65, nullable = false)
    @Size(max = 65, message = "El curso no puede tener más de 65 caracteres")
    @NotBlank(message = "El campo curso no debe quedar vacío")
    private String course;

    @Column(name = "type", length = 3, columnDefinition = "CHAR(3)")
    private String academicScheduleTypeCode;

    @Transient
    private AcademicScheduleType academicScheduleType;

    @Column(length = 9, nullable = false)
    @Size(max = 9, message = "El día no puede tener más de 9 caracteres")
    @NotBlank(message = "El campo día no debe quedar vacío")
    private String day;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;

    public AcademicScheduleType getAcademicScheduleType(){
        return AcademicScheduleType.fromCode(academicScheduleTypeCode);
    }

    public void setAcademicScheduleType(AcademicScheduleType academicScheduleType){
        this.academicScheduleType = academicScheduleType;
        this.academicScheduleTypeCode = academicScheduleType.getCode();
    }
}
