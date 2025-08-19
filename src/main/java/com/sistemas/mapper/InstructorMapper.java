package com.sistemas.mapper;

import com.sistemas.domain.Instructor;
import com.sistemas.dto.administrator.InstructorResponse;
import org.springframework.stereotype.Component;

@Component
public class InstructorMapper {
    public InstructorResponse mapToInstructorResponse(Instructor instructor) {
        if (instructor == null) {
            return null;
        }

        return InstructorResponse.builder()
            .instructorId(instructor.getId())
            .instructorName(
                instructor.getName() + " " +
                instructor.getPaternalSurname() + " " +
                instructor.getMaternalSurname()
            )
            .instructorInstitutionalEmail(instructor.getInstitutionalEmail())
            .instructorMaxAcademicDegree(instructor.getMaxAcademicDegree())
            .instructorAcademicDepartment(instructor.getAcademicDepartment())
            .instructorDedication(instructor.formatDedication(instructor.getInstructorDedication().toString()))
            .build();
    }
}
