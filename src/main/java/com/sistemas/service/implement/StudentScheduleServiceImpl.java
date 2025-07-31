package com.sistemas.service.implement;

import com.sistemas.domain.StudentSchedule;
import com.sistemas.repository.InstructorScheduleRepository;
import com.sistemas.repository.StudentScheduleRepository;
import com.sistemas.service.StudentScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentScheduleServiceImpl implements StudentScheduleService {

    private final StudentScheduleRepository studentScheduleRepository;

    @Override
    public StudentSchedule create(StudentSchedule studentSchedule) {
        return studentScheduleRepository.save(studentSchedule);
    }

    @Override
    public List<StudentSchedule> listAll() {
        return studentScheduleRepository.findAll();
    }

    @Override
    public StudentSchedule search(Long id) {
        StudentSchedule studentSchedule = null;
        Optional<StudentSchedule> studentScheduleWanted = studentScheduleRepository.findById(id);
        if (studentScheduleWanted.isPresent()) {
            studentSchedule = studentScheduleWanted.get();
        }
        return studentSchedule;
    }

    @Override
    public StudentSchedule update(StudentSchedule studentSchedule) {
        return studentScheduleRepository.save(studentSchedule);
    }

    @Override
    public void delete(Long id) {
        studentScheduleRepository.deleteById(id);
    }

    @Override
    public List<StudentSchedule> findByStudentId(Long studentId) {
        return studentScheduleRepository.findByStudentId(studentId);
    }
}
