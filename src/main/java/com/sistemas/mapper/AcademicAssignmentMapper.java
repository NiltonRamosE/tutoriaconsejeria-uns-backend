package com.sistemas.mapper;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.dto.student.AssignedInstructorResponse;
import com.sistemas.dto.student.AssignedStudentResponse;
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

    public AssignedStudentResponse mapToAssignedStudentResponse(AcademicAssignment academicAssignment) {
        if (academicAssignment == null) {
            return null;
        }

        return AssignedStudentResponse.builder()
            .id(academicAssignment.getStudent().getId())
            .fullName(
                academicAssignment.getStudent().getName() + " " +
                academicAssignment.getStudent().getPaternalSurname() + " " +
                academicAssignment.getStudent().getMaternalSurname()
            )
            .typeActivityCode(academicAssignment.getTypeActivityCode())
            .build();
    }
}
