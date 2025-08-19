package com.sistemas.mapper;

import com.sistemas.domain.Student;
import com.sistemas.dto.administrator.StudentResponse;
import com.sistemas.dto.student.StudentProfileResponse;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentProfileResponse mapToStudentProfileResponse(Student student) {
        if (student == null) {
            return null;
        }

        PersonalProblemsMapper personalProblemsMapper = new PersonalProblemsMapper();

        return StudentProfileResponse.builder()
            .fullName(
                student.getName() + " " +
                student.getPaternalSurname() + " " +
                student.getMaternalSurname()
            )
            .institutionalEmail(student.getInstitutionalEmail())
            .studentCode(student.getStudentCode())
            .cellphone(String.format("+51 %s", student.getCellphoneNumber()))
            .yearOfStudy(student.getYearOfStudy().toString())
            .gender(student.getGenderCode())
            .dateOfBirth(student.getDateOfBirth().toString())
            .familyGroupInformation(student.getFamilyGroupInformation())
            .personalProblems(personalProblemsMapper.mapToPersonalProblemsResponse(student.getPersonalProblems()))
            .socioeconomicInformation(student.getSocioeconomicInformation())
            .build();
    }

    public StudentResponse mapToStudentResponse(Student student) {
        if (student == null) {
            return null;
        }

        return StudentResponse.builder()
            .studentId(student.getId())
            .studentName(
                student.getName() + " " +
                student.getPaternalSurname() + " " +
                student.getMaternalSurname()
            )
            .studentInstitutionalEmail(student.getInstitutionalEmail())
            .studentCode(student.getStudentCode())
            .studentCellphone(String.format("+51 %s", student.getCellphoneNumber()))
            .yearOfStudy(student.getYearOfStudy().toString())
            .build();
    }
}
