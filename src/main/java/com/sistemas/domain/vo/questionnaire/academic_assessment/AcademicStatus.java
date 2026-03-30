package com.sistemas.domain.vo.questionnaire.academic_assessment;

import lombok.Data;

import java.util.List;

@Data
public class AcademicStatus {
    private List<CourseCondition> courseConditions;
    private double averageGrade;
    private int orderOfMerit;
    private String levelAcademicPerformance;
    private String previousSemester;
}
