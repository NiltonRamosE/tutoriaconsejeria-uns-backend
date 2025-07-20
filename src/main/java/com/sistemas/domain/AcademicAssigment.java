package com.sistemas.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "academic_assignments")
public class AcademicAssigment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_academic_assignments_students"))
    private Student student;

    @ManyToOne
    @JoinColumn(
            name = "instructor_id",
            referencedColumnName = "instructor_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_academic_assignments_instructors"))
    private Instructor instructor;

    @Column(name = "type_activity", length = 1)
    private char typeActivityCode;

    @Transient
    private TypeActivity typeActivity;

    public TypeActivity getTypeActivity(){
        return TypeActivity.fromCode(typeActivityCode);
    }

    public void setTypeActivity(TypeActivity typeActivity){
        this.typeActivity = typeActivity;
        this.typeActivityCode = typeActivity.getCode();
    }
}
