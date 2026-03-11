package com.sistemas.mapper;

import com.sistemas.domain.Instructor;
import com.sistemas.dto.administrator.InstructorResponse;
import com.sistemas.dto.instructor.InstructorProfileResponse;
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

    public InstructorProfileResponse mapToInstructorProfileResponse(Instructor instructor) {
        if (instructor == null) {
            return null;
        }

        return InstructorProfileResponse.builder()
            .fullName(
                instructor.getName() + " " +
                instructor.getPaternalSurname() + " " +
                instructor.getMaternalSurname()
            )
            .profession(instructor.getProfession())
            .maxAcademicDegree(instructor.getMaxAcademicDegree())
            .academicDepartment(instructor.getAcademicDepartment())
            .instructorCondition(instructor.getInstructorCondition().toString())
            .instructorCategory(instructor.getInstructorCategory().toString())
            .instructorDedication(instructor.formatDedication(instructor.getInstructorDedication().toString()))
            .cellphoneNumber(String.format("+51 %s", instructor.getCellphoneNumber()))
            .yearsOfTeaching(instructor.getYearsOfTeaching())
            .gender(instructor.getGenderCode())
            .institutionalEmail(instructor.getInstitutionalEmail())
            .homePhoneNumber(String.format(instructor.getHomePhoneNumber()))
            .build();
    }
}
