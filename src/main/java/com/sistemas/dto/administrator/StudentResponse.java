package com.sistemas.dto.administrator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private Long studentId;
    private String studentName;
    private String studentCode;
    private String studentInstitutionalEmail;
    private String studentCellphone;
    private String yearOfStudy;

}
