package com.sistemas.dto.instructor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstructorProfileResponse {
    private String fullName;
    private String profession;
    private String maxAcademicDegree;
    private String academicDepartment;
    private String instructorCondition;
    private String instructorCategory;
    private String instructorDedication;
    private String cellphoneNumber;
    private Integer yearsOfTeaching;
    private char gender;
    private String institutionalEmail;
    private String homePhoneNumber;
}
