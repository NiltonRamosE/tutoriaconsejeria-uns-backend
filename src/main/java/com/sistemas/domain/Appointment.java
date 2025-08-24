package com.sistemas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long id;

    @Future(message = "Ingrese una fecha válida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;

    @Column(name = "modality", length = 1)
    private char appointmentModalityCode;

    @Transient
    private AppointmentModality appointmentModality;

    @Enumerated(EnumType.STRING)
    @Column(name = "reason", length = 1)
    private AppointmentReason appointmentReason;

    @Column(name = "specific_reason", length = 100)
    @Size(max = 100, message = "El motivo específico no debe superar los 100 caracteres")
    private String specificAppointmentReason;

    @Enumerated(EnumType.STRING)
    @Column(name = "method", length = 1)
    private AppointmentMethod appointmentMethod;

    @Column(name = "specific_method", length = 100)
    @Size(max = 100, message = "La forma de cita específica no debe superar los 100 caracteres")
    private String specificAppointmentMethod;

    @Column(name = "state", length = 1)
    private char appointmentStateCode;

    @Transient
    private AppointmentState appointmentState;

    @Column(name = "type_activity", length = 1)
    private char typeActivityCode;

    @Transient
    private TypeActivity typeActivity;

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

    @ManyToOne
    @JoinColumn(
            name = "student_sender_id",
            referencedColumnName = "student_id",
            foreignKey = @ForeignKey(name = "fk_appointment_schedules_student_sender"))
    private Student studentSender;

    public AppointmentModality getAppointmentModality(){
        return AppointmentModality.fromCode(appointmentModalityCode);
    }

    public void setAppointmentModality(AppointmentModality appointmentModality){
        this.appointmentModality = appointmentModality;
        this.appointmentModalityCode = appointmentModality.getCode();
    }

    public AppointmentState getAppointmentState(){
        return AppointmentState.fromCode(appointmentStateCode);
    }

    public void setAppointmentState(AppointmentState appointmentState){
        this.appointmentState = appointmentState;
        this.appointmentStateCode = appointmentState.getCode();
    }

    public TypeActivity getTypeActivity(){
        return TypeActivity.fromCode(typeActivityCode);
    }

    public void setTypeActivity(TypeActivity typeActivity){
        this.typeActivity = typeActivity;
        this.typeActivityCode = typeActivity.getCode();
    }
}
