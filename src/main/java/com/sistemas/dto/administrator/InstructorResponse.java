package com.sistemas.dto.administrator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstructorResponse {
    private Long instructorId;
    private String instructorName;
    private String instructorMaxAcademicDegree;
    private String instructorInstitutionalEmail;
    private String instructorAcademicDepartment;
    private String instructorDedication;
}
