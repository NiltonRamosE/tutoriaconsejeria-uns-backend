package com.sistemas.service.implement;

import com.sistemas.domain.Instructor;
import com.sistemas.repository.InstructorRepository;
import com.sistemas.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Override
    public Instructor create(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> listAll() {
        return List.of();
    }

    @Override
    public Instructor search(Long id) {
        return null;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Instructor> findByInstitutionalEmail(String institutionalEmail) {
        return instructorRepository.findByInstitutionalEmail(institutionalEmail);
    }
}
