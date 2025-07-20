package com.sistemas.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "activity_logs")
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_log_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "appointment_id",
            referencedColumnName = "appointment_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_activity_logs_appointments"))
    private Appointment appointment;

    private String orientation;

    private String referralToArea;

    private String observation;

    @Column(length = 7, nullable = false)
    private String semester;
}
