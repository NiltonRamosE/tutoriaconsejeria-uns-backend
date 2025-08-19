package com.sistemas.service.implement;

import com.sistemas.domain.InstitutionalEmailGenerator;
import com.sistemas.domain.Instructor;
import com.sistemas.repository.InstructorRepository;
import com.sistemas.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Instructor create(Instructor instructor) {
        String institutionalEmail = InstitutionalEmailGenerator.generateInstitutionalEmail(instructor.getName(), instructor.getPaternalSurname(), instructor.getMaternalSurname());
        instructor.setInstitutionalEmail(institutionalEmail);

        instructor.setName(instructor.getName().toUpperCase());
        instructor.setPaternalSurname(instructor.getPaternalSurname().toUpperCase());
        instructor.setMaternalSurname(instructor.getMaternalSurname().toUpperCase());

        instructor.setPassword(passwordEncoder.encode(instructor.getPassword()));

        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> listAll() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor search(Long id) {
        Instructor instructor = null;
        Optional<Instructor> instructorWanted = instructorRepository.findById(id);
        if (instructorWanted.isPresent()) {
            instructor = instructorWanted.get();
        }
        return instructor;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void delete(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public Optional<Instructor> findByInstitutionalEmail(String institutionalEmail) {
        return instructorRepository.findByInstitutionalEmail(institutionalEmail);
    }
}
