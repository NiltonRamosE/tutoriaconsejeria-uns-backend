package com.sistemas.service.implement;

import com.sistemas.domain.InstructorSchedule;
import com.sistemas.repository.InstructorScheduleRepository;
import com.sistemas.service.InstructorScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorScheduleServiceImpl implements InstructorScheduleService {

    private final InstructorScheduleRepository instructorScheduleRepository;

    @Override
    public InstructorSchedule create(InstructorSchedule instructorSchedule) {
        return instructorScheduleRepository.save(instructorSchedule);
    }

    @Override
    public List<InstructorSchedule> listAll() {
        return instructorScheduleRepository.findAll();
    }

    @Override
    public InstructorSchedule search(Long id) {
        InstructorSchedule instructorSchedule = null;
        Optional<InstructorSchedule> instructorScheduleWanted = instructorScheduleRepository.findById(id);
        if (instructorScheduleWanted.isPresent()) {
            instructorSchedule = instructorScheduleWanted.get();
        }
        return instructorSchedule;
    }

    @Override
    public InstructorSchedule update(InstructorSchedule instructorSchedule) {
        return instructorScheduleRepository.save(instructorSchedule);
    }

    @Override
    public void delete(Long id) {
        instructorScheduleRepository.deleteById(id);
    }

    @Override
    public List<InstructorSchedule> findByAcademicScheduleId(Long academicScheduleId) {
        return instructorScheduleRepository.findByAcademicScheduleId(academicScheduleId);
    }
}
