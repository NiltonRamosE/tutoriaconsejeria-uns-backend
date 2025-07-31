package com.sistemas.dto.assignment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentResponse {
    private Long academicAssignmentId;
    private Long studentId;
    private Long instructorId;
    private String studentName;
    private String instructorName;
    private String studentInstitutionalEmail;
    private String instructorInstitutionalEmail;
    private String studentCode;
    private String typeActivity;
}
