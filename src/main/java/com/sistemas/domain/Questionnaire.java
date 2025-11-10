package com.sistemas.domain;

import com.sistemas.domain.vo.questionnaire.AcademicAssessment;
import com.sistemas.domain.vo.questionnaire.GoalAcademicSemester;
import com.sistemas.domain.vo.questionnaire.PsychopedagogicalAssessment;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@Table(name = "questionnaires")
public class Questionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionnaire_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_questionnaires_students"))
    private Student student;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private AcademicAssessment academicAssessment;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private PsychopedagogicalAssessment psychopedagogicalAssessment;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private GoalAcademicSemester goalAcademicSemester;

    @Column(length = 7, nullable = false)
    private String semester;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @PastOrPresent(message = "La fecha no puede ser futura")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;


    @PrePersist
    public void setRegistrationDate() {
        this.date = new Date();
    }
}
