package com.sistemas.mapper;

import com.sistemas.domain.Administrator;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.auth.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponse getUserInfo(String userType, Student student, Instructor instructor, Administrator administrator) {
        return switch (userType) {
            case "student" -> (student != null)
                    ? new UserResponse(student.getId(),
                    student.getName() + " " + student.getPaternalSurname() + " " + student.getMaternalSurname(),
                    student.getInstitutionalEmail(),
                    student.getGenderCode())
                    : null;
            case "instructor" -> (instructor != null)
                    ? new UserResponse(instructor.getId(),
                    instructor.getName() + " " + instructor.getPaternalSurname() + " " + instructor.getMaternalSurname(),
                    instructor.getInstitutionalEmail(),
                    instructor.getGenderCode())
                    : null;
            case "administrator" -> (administrator != null)
                    ? new UserResponse(administrator.getId(),
                    administrator.getName() + " " + administrator.getPaternalSurname() + " " + administrator.getMaternalSurname(),
                    administrator.getInstitutionalEmail(),
                    administrator.getGenderCode())
                    : null;
            default -> null;
        };
    }

}
