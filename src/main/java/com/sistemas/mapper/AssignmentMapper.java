package com.sistemas.mapper;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.TypeActivity;
import com.sistemas.dto.assignment.AssignmentResponse;
import org.springframework.stereotype.Component;

@Component
public class AssignmentMapper {
    public AssignmentResponse mapToAssignmentResponse(AcademicAssignment assignment) {
        if (assignment == null || assignment.getStudent() == null || assignment.getInstructor() == null) {
            return null;
        }

        return AssignmentResponse.builder()
            .academicAssignmentId(assignment.getId())
            .studentId(assignment.getStudent().getId())
            .instructorId(assignment.getInstructor().getId())
            .studentName(
                assignment.getStudent().getName() + " " +
                assignment.getStudent().getPaternalSurname() + " " +
                assignment.getStudent().getMaternalSurname()
            )
            .instructorName(
                assignment.getInstructor().getName() + " " +
                assignment.getInstructor().getPaternalSurname() + " " +
                assignment.getInstructor().getMaternalSurname()
            )
            .studentInstitutionalEmail(assignment.getStudent().getInstitutionalEmail())
            .instructorInstitutionalEmail(assignment.getInstructor().getInstitutionalEmail())
            .studentCode(assignment.getStudent().getStudentCode())
            .typeActivity(TypeActivity.fromCode(assignment.getTypeActivityCode()).toString())
            .build();
    }
}
