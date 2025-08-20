package com.sistemas.mapper;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.dto.student.AssignedInstructorResponse;
import org.springframework.stereotype.Component;

@Component
public class AcademicAssignmentMapper {

    public AssignedInstructorResponse mapToAssignedInstructorResponse(AcademicAssignment academicAssignment) {
        if (academicAssignment == null) {
            return null;
        }

        return AssignedInstructorResponse.builder()
            .id(academicAssignment.getInstructor().getId())
            .fullName(
                academicAssignment.getInstructor().getName() + " " +
                academicAssignment.getInstructor().getPaternalSurname() + " " +
                academicAssignment.getInstructor().getMaternalSurname()
            )
            .typeActivity(academicAssignment.getTypeActivityCode())
            .bothActivities(false)
            .build();
    }
}
