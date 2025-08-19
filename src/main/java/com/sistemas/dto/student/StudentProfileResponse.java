package com.sistemas.dto.student;

import com.sistemas.domain.vo.student.FamilyGroupInformation;
import com.sistemas.domain.vo.student.SocioeconomicInformation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentProfileResponse {
    private String fullName;
    private String studentCode;
    private String institutionalEmail;
    private String cellphone;
    private String yearOfStudy;
    private char gender;
    private String dateOfBirth;
    private SocioeconomicInformation socioeconomicInformation;
    private PersonalProblemsResponse personalProblems;
    private FamilyGroupInformation familyGroupInformation;
}
