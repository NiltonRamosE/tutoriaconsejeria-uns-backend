package com.sistemas.service.implement;

import com.sistemas.domain.Student;
import com.sistemas.repository.StudentRepository;
import com.sistemas.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Student create(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        return studentRepository.save(student);
    }

    @Override
    public List<Student> listAll() {
        return List.of();
    }

    @Override
    public Student search(Long id) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Student> findByInstitutionalEmail(String institutionalEmail) {
        return studentRepository.findByInstitutionalEmail(institutionalEmail);
    }
}
