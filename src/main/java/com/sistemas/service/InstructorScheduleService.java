package com.sistemas.service;

import com.sistemas.domain.InstructorSchedule;

import java.util.List;

public interface InstructorScheduleService extends IGenericService<InstructorSchedule, Long>{
    List<InstructorSchedule> findByAcademicScheduleId(Long academicScheduleId);
    List<InstructorSchedule> findByInstructorId(Long instructorId);
}
