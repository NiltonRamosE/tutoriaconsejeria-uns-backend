package com.sistemas.service;

import com.sistemas.domain.AcademicAssignment;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;

import java.util.List;

public interface AcademicAssignmentService extends IGenericService<AcademicAssignment, Long> {

    void distributeStudentsAmongInstructors();

    long countStudentsByInstructorAndTypeActivity(Long instructorId, char typeActivityCode);

    List<Instructor> findInstructorsByStudentId(Long studentId);

    List<Student> findStudentsByInstructorId(Long instructorId);

    List<AcademicAssignment> findAcademicAssignmentsByStudentId(Long studentId);

    List<AcademicAssignment> findAcademicAssignmentsByInstructorId(Long instructorId);
}
