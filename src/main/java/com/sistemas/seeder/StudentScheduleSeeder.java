package com.sistemas.seeder;

import com.sistemas.domain.StudentSchedule;
import com.sistemas.service.AcademicScheduleService;
import com.sistemas.service.StudentScheduleService;
import com.sistemas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentScheduleSeeder {

    @Autowired
    StudentService studentService;
    @Autowired
    AcademicScheduleService academicScheduleService;

    CommandLineRunner initStudentScheduleTable(StudentScheduleService studentScheduleService) {
        return args -> {

            this.studentSeederMethodOne(studentScheduleService);

            this.studentSeederMethodTwo(studentScheduleService);

            this.studentSeederMethodThree(studentScheduleService);

            this.studentSeederMethodFour(studentScheduleService);

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(55L))
                    .academicSchedule(academicScheduleService.search(62L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(55L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(55L))
                    .academicSchedule(academicScheduleService.search(67L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(48L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(49L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(51L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(52L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(54L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(55L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(57L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(58L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(60L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(63L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(56L))
                    .academicSchedule(academicScheduleService.search(68L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(48L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(50L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(51L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(53L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(54L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(56L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(57L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(59L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(60L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(64L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(57L))
                    .academicSchedule(academicScheduleService.search(69L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(48L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(49L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(51L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(52L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(54L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(55L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(57L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(58L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(60L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(61L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(58L))
                    .academicSchedule(academicScheduleService.search(66L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(59L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(60L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(61L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(62L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(63L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(64L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(65L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(66L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(67L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(68L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(69L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(70L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(71L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(72L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(73L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(74L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(75L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(76L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(77L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(78L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(79L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(80L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(81L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(82L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(83L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(84L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(85L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(86L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(87L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(88L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(89L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(90L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(91L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(92L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(93L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(94L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(95L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(96L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(2)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(97L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(98L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(3)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(99L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .registrationCondition(1)
                    .build());

            studentScheduleService.create(StudentSchedule.builder()
                    .student(studentService.search(100L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .registrationCondition(1)
                    .build());

        };
    }

    public void studentSeederMethodOne(StudentScheduleService studentScheduleService){
        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(1L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(2L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(3L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(4L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(5L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(6L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(7L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(8L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(9L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(10L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(11L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(12L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(13L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());
    }

    public void studentSeederMethodTwo(StudentScheduleService studentScheduleService){
        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(14L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(15L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(16L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(17L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(18L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());
        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(19L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(20L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(21L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(22L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(23L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(13L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(21L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(24L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(2L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(6L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(10L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(18L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(25L))
                .academicSchedule(academicScheduleService.search(23L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(3L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(7L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(11L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(16L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(19L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(26L))
                .academicSchedule(academicScheduleService.search(24L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(1L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(4L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(5L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(8L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(9L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(12L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(14L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(15L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(17L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(20L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(22L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(27L))
                .academicSchedule(academicScheduleService.search(25L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());
    }

    public void studentSeederMethodThree(StudentScheduleService studentScheduleService){
        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(31L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(28L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(32L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(29L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(33L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(30L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(34L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(31L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(31L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(32L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(32L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(33L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(33L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(34L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(34L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(35L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(31L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(36L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(32L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(37L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(33L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(38L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(34L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(39L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(31L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(40L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(32L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

    }

    public void studentSeederMethodFour(StudentScheduleService studentScheduleService){
        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(41L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(33L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(42L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(27L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(34L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(39L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(43L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(43L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(28L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(31L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(36L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(40L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(44L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(44L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(26L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(29L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(30L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(32L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(35L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(37L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(38L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(41L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(42L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(45L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(46L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(45L))
                .academicSchedule(academicScheduleService.search(47L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(49L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(52L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(55L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(58L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(61L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(46L))
                .academicSchedule(academicScheduleService.search(66L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(50L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(53L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(56L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(59L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(62L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(47L))
                .academicSchedule(academicScheduleService.search(67L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(49L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(52L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(55L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(58L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(63L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(48L))
                .academicSchedule(academicScheduleService.search(68L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(50L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(53L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(56L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(59L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(64L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(49L))
                .academicSchedule(academicScheduleService.search(69L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(49L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(52L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(55L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(58L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(61L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(50L))
                .academicSchedule(academicScheduleService.search(66L))
                .registrationCondition(2)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(50L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(53L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(56L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(59L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(62L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(51L))
                .academicSchedule(academicScheduleService.search(67L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(49L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(52L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(55L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(58L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(63L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(52L))
                .academicSchedule(academicScheduleService.search(68L))
                .registrationCondition(3)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(50L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(53L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(56L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(59L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(64L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(53L))
                .academicSchedule(academicScheduleService.search(69L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(49L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(52L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(55L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(58L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(61L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(65L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(54L))
                .academicSchedule(academicScheduleService.search(66L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(48L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(50L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(51L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(53L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(54L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(56L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(57L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(59L))
                .registrationCondition(1)
                .build());

        studentScheduleService.create(StudentSchedule.builder()
                .student(studentService.search(55L))
                .academicSchedule(academicScheduleService.search(60L))
                .registrationCondition(1)
                .build());
    }
}
