package com.sistemas.mapper;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.Student;
import com.sistemas.dto.administrator.StudentResponse;
import com.sistemas.dto.student.AssignedInstructorResponse;
import com.sistemas.dto.student.AssignedStudentResponse;
import com.sistemas.dto.student.StudentProfileResponse;
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

    public StudentResponse mapToStudentResponse(AcademicAssignment academicAssignment) {
        if (academicAssignment == null) {
            return null;
        }

        return StudentResponse.builder()
                .studentId(academicAssignment.getStudent().getId())
                .studentName(
                    academicAssignment.getStudent().getName() + " " +
                    academicAssignment.getStudent().getPaternalSurname() + " " +
                    academicAssignment.getStudent().getMaternalSurname()
                )
                .studentInstitutionalEmail(academicAssignment.getStudent().getInstitutionalEmail())
                .studentCode(academicAssignment.getStudent().getStudentCode())
                .studentCellphone(String.format("+51 %s", academicAssignment.getStudent().getCellphoneNumber()))
                .yearOfStudy(academicAssignment.getStudent().getYearOfStudy().toString())
                .build();
    }
}
