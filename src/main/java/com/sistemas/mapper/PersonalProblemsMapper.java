package com.sistemas.mapper;

import com.sistemas.domain.vo.student.PersonalProblems;
import com.sistemas.dto.student.PersonalProblemsResponse;
import org.springframework.stereotype.Component;

@Component
public class PersonalProblemsMapper {
    public PersonalProblemsResponse mapToPersonalProblemsResponse(PersonalProblems personalProblems) {
        if (personalProblems == null) {
            return null;
        }

        String description = null;
        if (personalProblems.getPersonalProblemType() != null) {
            description = personalProblems.getPersonalProblemType().getCode();
        } else if (personalProblems.getOtherProblems() != null && !personalProblems.getOtherProblems().isEmpty()) {
            description = personalProblems.getOtherProblems();
        }

        return new PersonalProblemsResponse(
            description,
            personalProblems.getNameOfTheRepresentative()
        );
    }
}
