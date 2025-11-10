package com.sistemas.dto.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignedInstructorResponse {
    private Long id;
    private String fullName;
    private char typeActivity;
    private boolean bothActivities;
}
