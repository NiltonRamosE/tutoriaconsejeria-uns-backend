package com.sistemas.service.implement;

import com.sistemas.domain.*;
import com.sistemas.repository.AcademicAssignmentRepository;
import com.sistemas.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AcademicAssignmentServiceImpl implements AcademicAssignmentService {

    private final AcademicAssignmentRepository academicAssignmentRepository;

    private final InstructorService instructorService;

    private final StudentService studentService;

    private final StudentScheduleService studentScheduleService;

    private final InstructorScheduleService instructorScheduleService;

    @Override
    public AcademicAssignment create(AcademicAssignment academicAssignment) {
        return academicAssignmentRepository.save(academicAssignment);
    }

    @Override
    public List<AcademicAssignment> listAll() {
        return academicAssignmentRepository.findAll();
    }

    @Override
    public AcademicAssignment search(Long id) {
        AcademicAssignment found = null;
        Optional<AcademicAssignment> searched = academicAssignmentRepository.findById(id);
        if (searched.isPresent()) {
            found = searched.get();
        }
        return found;
    }

    @Override
    public AcademicAssignment update(AcademicAssignment academicAssignment) {
        return academicAssignmentRepository.save(academicAssignment);
    }

    @Override
    public void delete(Long id) {
        academicAssignmentRepository.deleteById(id);
    }

    @Override
    public long countStudentsByInstructorAndTypeActivity(Long instructorId, char typeActivityCode) {
        return academicAssignmentRepository.countStudentsByInstructorAndTypeActivity(instructorId, typeActivityCode);
    }

    @Override
    public Instructor findInstructorsByStudentId(Long studentId, char typeActivityCode) {
        return academicAssignmentRepository.findInstructorsByStudentId(studentId, typeActivityCode);
    }

    @Override
    public List<Student> findStudentsByInstructorId(Long instructorId, char typeActivityCode) {
        return academicAssignmentRepository.findStudentsByInstructorId(instructorId, typeActivityCode);
    }

    @Override
    public void distributeStudentsAmongTeachers() {
        List<Student> earlyStageTutored = studentService.getIrregularConditionStudentsEarlyStage();
        List<Student> lateStageTutored = studentService.getIrregularConditionStudentsLateStage();
        List<Student> earlyStageAdvised = studentService.getStudentsEarlyStage();
        List<Student> lateStageAdvised = studentService.getStudentsLateStage();

        List<Instructor> instructors = instructorService.listAll();

        int totalTutored = earlyStageTutored.size() + lateStageTutored.size();
        int totalAdvised = earlyStageAdvised.size() + lateStageAdvised.size();
        int totalInstructors = instructors.size();

        int quantityTutoredPerInstructor = this.calculateNumberOfStudentsPerTutor(totalTutored, totalInstructors);
        int quantityAdvisedPerInstructor = this.calculateNumberOfStudentsPerAdviser(totalAdvised, totalInstructors);

        this.assignStudentToInstructor(earlyStageTutored, quantityTutoredPerInstructor, instructors, TypeActivity.TUTORIA);
        this.assignStudentToInstructor(lateStageTutored, quantityTutoredPerInstructor, instructors, TypeActivity.TUTORIA);

        this.assignStudentToInstructor(earlyStageAdvised, quantityAdvisedPerInstructor, instructors, TypeActivity.CONSEJERIA);
        this.assignStudentToInstructor(lateStageAdvised, quantityAdvisedPerInstructor, instructors, TypeActivity.CONSEJERIA);
    }

    private void assignStudentToInstructor(List<Student> students, int quantityPerInstructor, List<Instructor> instructors, TypeActivity typeActivity) {
        List<Instructor> instructorsTeachStudent;
        List<StudentSchedule> listStudentSchedule;
        List<InstructorSchedule> listInstructorSchedule;

        for (Student student : students) {
            instructorsTeachStudent = new ArrayList<>();
            listStudentSchedule = studentScheduleService.findByStudentId(student.getId());

            for (StudentSchedule he : listStudentSchedule) {
                listInstructorSchedule = instructorScheduleService.findByAcademicScheduleId(he.getAcademicSchedule().getId());

                for (InstructorSchedule hd : listInstructorSchedule) {
                    Instructor d = instructorService.search(hd.getInstructor().getId());
                    if (!instructorsTeachStudent.contains(d)) {
                        instructorsTeachStudent.add(d);
                    }
                }

            }

            Instructor instructorMaxAcademicExperience;
            List<Instructor> instructorsTemporal = new ArrayList<>(instructors);
            instructorMaxAcademicExperience = this.getInstructorMaxAcademicExperience(instructorsTeachStudent, quantityPerInstructor, typeActivity.getCode());

            if (instructorMaxAcademicExperience == null) {
                instructorsTemporal.removeAll(instructorsTeachStudent);
                List<Instructor> instructorsDoNotTeachStudent = new ArrayList<>(instructorsTemporal);
                instructorMaxAcademicExperience = this.getInstructorMaxAcademicExperience(instructorsDoNotTeachStudent, quantityPerInstructor, typeActivity.getCode());
            }

            AcademicAssignment academicAssignment = new AcademicAssignment();
            academicAssignment.setInstructor(instructorMaxAcademicExperience);
            academicAssignment.setStudent(student);
            academicAssignment.setTypeActivity(typeActivity);
            this.create(academicAssignment);
        }
    }

    private int calculateNumberOfStudentsPerTutor(int  totalTutored, int totalInstructors){

        if (totalInstructors == 0) {
            throw new IllegalArgumentException("La cantidad de tutores no puede ser cero.");
        }

        double quantityPerTutor = (double) totalTutored / totalInstructors;

        return (int) Math.ceil(quantityPerTutor);
    }

    private int calculateNumberOfStudentsPerAdviser(int  totalAdvised, int totalInstructors){

        if (totalInstructors == 0) {
            throw new IllegalArgumentException("La cantidad de consejeros no puede ser cero.");
        }

        /*
        double quantityPerAdviser = (double) totalAdvised / totalInstructors;

        return (int) Math.ceil(quantityPerAdviser);
        */
        return 20;
    }

    private Instructor getInstructorMaxAcademicExperience(List<Instructor> instructors, int quantityPerInstructor, char typeActivityCode) {
        Instructor instructorWithMaxAcademicExperience = null;
        int maxAcademicExperience = -1;

        for(Instructor d : instructors){
            if(d.getYearsOfTeaching() > maxAcademicExperience){
                if(this.countStudentsByInstructorAndTypeActivity(d.getId(), typeActivityCode) < quantityPerInstructor){
                    maxAcademicExperience = d.getYearsOfTeaching();
                    instructorWithMaxAcademicExperience = d;
                }
            }
        }
        return instructorWithMaxAcademicExperience;
    }
}
