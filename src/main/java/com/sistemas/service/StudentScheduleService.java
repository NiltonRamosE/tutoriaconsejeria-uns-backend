package com.sistemas.service;

import com.sistemas.domain.StudentSchedule;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentScheduleService extends IGenericService<StudentSchedule, Long>{
    List<StudentSchedule> findByStudentId(@Param("studentId") Long studentId);
}
