package com.sistemas.domain.vo.questionnaire.academic_assessment;

import com.sistemas.domain.AcademicSchedule;
import lombok.Data;

@Data
public class ExpectedGrade {
    private AcademicSchedule academicSchedule;
    private double expectedAverageGrade;
    private double averageGradeAchievedFirstExam;
    private boolean isRisk;
    private String whatWasDone;
    private String whatNeedsToBeDone;
    private double averageGradeAchievedLastExam;
}
