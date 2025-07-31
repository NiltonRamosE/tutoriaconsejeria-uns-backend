package com.sistemas.service;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;

import java.util.List;

public interface AcademicAssignmentService extends IGenericService<AcademicAssignment, Long> {

    void distributeStudentsAmongTeachers();

    long countStudentsByInstructorAndTypeActivity(Long instructorId, char typeActivityCode);

    Instructor findInstructorsByStudentId(Long studentId, char typeActivityCode);

    List<Student> findStudentsByInstructorId(Long instructorId, char typeActivityCode);
}
