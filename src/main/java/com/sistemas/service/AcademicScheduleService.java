package com.sistemas.service;

import com.sistemas.domain.AcademicSchedule;

import java.util.List;

public interface AcademicScheduleService extends IGenericService<AcademicSchedule, Long>{

    List<AcademicSchedule> findByCycle(Integer cycle);
}
