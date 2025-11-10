package com.sistemas.seeder;

import com.sistemas.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AdministratorSeeder.class,
        StudentSeeder.class,
        InstructorSeeder.class,
        AcademicScheduleSeeder.class,
        InstructorScheduleSeeder.class,
        StudentScheduleSeeder.class
})
public class DatabaseSeeder {

    @Autowired
    AdministratorService administratorService;

    @Autowired
    StudentService studentService;

    @Autowired
    InstructorService instructorService;

    @Autowired
    AcademicScheduleService academicScheduleService;

    @Autowired
    InstructorScheduleService instructorScheduleService;

    @Autowired
    StudentScheduleService studentScheduleService;

    @Bean
    public CommandLineRunner initDatabase(
            AdministratorSeeder administratorSeeder,
            StudentSeeder studentSeeder,
            InstructorSeeder instructorSeeder,
            AcademicScheduleSeeder academicScheduleSeeder,
            InstructorScheduleSeeder instructorScheduleSeeder,
            StudentScheduleSeeder studentScheduleSeeder) {
        return args -> {
            /*administratorSeeder.initAdministratorTable(administratorService).run(args);
            studentSeeder.initStudentTable(studentService).run(args);
            instructorSeeder.initInstructorTable(instructorService).run(args);
            academicScheduleSeeder.initAcademicScheduleTable(academicScheduleService).run(args);
            instructorScheduleSeeder.initInstructorScheduleTable(instructorScheduleService).run(args);
            studentScheduleSeeder.initStudentScheduleTable(studentScheduleService).run(args);*/

        };
    }
}
