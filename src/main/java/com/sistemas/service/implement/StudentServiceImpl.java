package com.sistemas.service.implement;

import com.sistemas.domain.InstitutionalEmailGenerator;
import com.sistemas.domain.Student;
import com.sistemas.repository.StudentRepository;
import com.sistemas.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Student create(Student student) {
        student.setInstitutionalEmail(student.getStudentCode() + "@uns.edu.pe");

        student.setName(student.getName().toUpperCase());
        student.setPaternalSurname(student.getPaternalSurname().toUpperCase());
        student.setMaternalSurname(student.getMaternalSurname().toUpperCase());

        student.setPassword(passwordEncoder.encode(student.getPassword()));
        return studentRepository.save(student);
    }

    @Override
    public List<Student> listAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student search(Long id) {
        Student student = null;
        Optional<Student> studentWanted = studentRepository.findById(id);
        if (studentWanted.isPresent()) {
            student = studentWanted.get();
        }
        return student;
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentsEarlyStage() {
        return getStudentsByStage(Arrays.asList(1, 2, 3), true);
    }

    @Override
    public List<Student> getStudentsLateStage() {
        return getStudentsByStage(Arrays.asList(4, 5), true);
    }

    @Override
    public List<Student> getIrregularConditionStudentsEarlyStage() {
        return getStudentsByStage(Arrays.asList(1, 2, 3), false);
    }

    @Override
    public List<Student> getIrregularConditionStudentsLateStage() {
        return getStudentsByStage(Arrays.asList(4, 5), false);
    }

    private List<Student> getStudentsByStage(List<Integer> yearOfStudy, boolean onlyActive) {
        // Llamar al repositorio para obtener los estudiantes por su año de estudio
        List<Object[]> studentsData = studentRepository.findStudentsByYearOfStudy(yearOfStudy);

        // Filtrar y obtener los estudiantes
        return studentsData.stream()
                .filter(result -> {
                    if (onlyActive) {
                        return true; // Pasan todos los estudiantes
                    }
                    return Integer.parseInt(result[1].toString()) != 1; // Condición de estudiantes irregulares
                })
                .map(result -> search(Long.parseLong(result[0].toString())))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Student> findByInstitutionalEmail(String institutionalEmail) {
        return studentRepository.findByInstitutionalEmail(institutionalEmail);
    }

}
