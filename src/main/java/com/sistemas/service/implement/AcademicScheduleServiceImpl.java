package com.sistemas.service.implement;

import com.sistemas.domain.AcademicSchedule;
import com.sistemas.repository.AcademicScheduleRepository;
import com.sistemas.service.AcademicScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AcademicScheduleServiceImpl implements AcademicScheduleService {

    private final AcademicScheduleRepository academicScheduleRepository;

    @Override
    public AcademicSchedule create(AcademicSchedule academicSchedule) {
        return academicScheduleRepository.save(academicSchedule);
    }

    @Override
    public List<AcademicSchedule> listAll() {
        return academicScheduleRepository.findAll();
    }

    @Override
    public AcademicSchedule search(Long id) {
        AcademicSchedule academicSchedule = null;
        Optional<AcademicSchedule> academicScheduleWanted = academicScheduleRepository.findById(id);
        if (academicScheduleWanted.isPresent()) {
            academicSchedule = academicScheduleWanted.get();
        }
        return academicSchedule;
    }

    @Override
    public AcademicSchedule update(AcademicSchedule academicSchedule) {
        return academicScheduleRepository.save(academicSchedule);
    }

    @Override
    public void delete(Long id) {
        academicScheduleRepository.deleteById(id);
    }

    @Override
    public List<AcademicSchedule> findByCycle(Integer cycle) {
        return academicScheduleRepository.findByCycle(cycle);
    }

    @Override
    public List<Object[]> findAcademicScheduleByStudentAndInstructor(Long studentId, Long instructorId) {
        return academicScheduleRepository.findAcademicScheduleByStudentAndInstructor(studentId, instructorId);
    }
}
