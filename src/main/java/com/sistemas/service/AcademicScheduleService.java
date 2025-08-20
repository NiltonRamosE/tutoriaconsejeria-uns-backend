package com.sistemas.service;

import com.sistemas.domain.AcademicSchedule;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AcademicScheduleService extends IGenericService<AcademicSchedule, Long>{

    List<AcademicSchedule> findByCycle(Integer cycle);

    List<Object[]> findAcademicScheduleByStudentAndInstructor(Long studentId, Long instructorId);
}
