package com.sistemas.domain.vo.questionnaire.academic_assessment;

import lombok.Data;

import java.util.List;

@Data
public class StudyEnvironmentCondition {
    List<StudyEnvironmentAnswer> studyEnvironmentAnswers;
    private String diagnosisStudyEnvironment;

}
