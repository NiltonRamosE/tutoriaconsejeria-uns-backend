package com.sistemas.dto.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignedStudentResponse {
    private Long id;
    private String fullName;
    private char typeActivityCode;
}
