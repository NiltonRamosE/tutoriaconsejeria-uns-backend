package com.sistemas.domain.vo.questionnaire.academic_assessment;

import lombok.Data;

@Data
public class AcademicAssessment {
    private AcademicStatus academicStatus;
    private StudyEnvironmentCondition studyEnvironmentCondition;
    private GoalCurrentAcademicSemester goalCurrentAcademicSemester;

}
