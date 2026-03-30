package com.sistemas.domain.vo.questionnaire.academic_assessment;

import lombok.Data;

@Data
public class StudyEnvironmentAnswer {
    private String question;
    private String appreciation;
    private StudyEnvironmentType type;
}
