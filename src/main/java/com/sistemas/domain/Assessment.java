package com.sistemas.domain;

import com.sistemas.domain.vo.assessment.InstructorAssessment;
import com.sistemas.domain.vo.assessment.StudentAssessment;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import org.hibernate.annotations.Type;

@Entity
@Data
@Table(name = "assessments")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_assessments_students"))
    private Student student;

    @ManyToOne
    @JoinColumn(
            name = "instructor_id",
            referencedColumnName = "instructor_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_assessments_instructors"))
    private Instructor instructor;


    @Column(name = "type_activity", length = 1)
    private char typeActivityCode;

    @Transient
    private TypeActivity typeActivity;

    @Column(length = 7, nullable = false)
    private String semester;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private InstructorAssessment instructorAssessment;

    @Valid
    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    private StudentAssessment studentAssessment;

    public TypeActivity getTypeActivity(){
        return TypeActivity.fromCode(typeActivityCode);
    }

    public void setTypeActivity(TypeActivity typeActivity){
        this.typeActivity = typeActivity;
        this.typeActivityCode = typeActivity.getCode();
    }
}
