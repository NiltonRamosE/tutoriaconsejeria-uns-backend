package com.sistemas.seeder;

import com.sistemas.domain.InstructorSchedule;
import com.sistemas.service.AcademicScheduleService;
import com.sistemas.service.InstructorScheduleService;
import com.sistemas.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InstructorScheduleTwoSeeder {

    @Autowired
    InstructorService instructorService;
    @Autowired
    AcademicScheduleService academicScheduleService;

    CommandLineRunner initInstructorTwoScheduleTable(InstructorScheduleService instructorScheduleService) {
        return args -> {
            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(1L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(2L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(3L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(4L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(5L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(6L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(7L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(8L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(9L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(10L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(11L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(12L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(13L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(14L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(15L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(16L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(17L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(18L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(19L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(20L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(21L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(22L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(23L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(24L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(25L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(26L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(27L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(28L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(29L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(30L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(31L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(32L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(33L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(34L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(35L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(36L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(37L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(38L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(39L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(40L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(41L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(42L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(43L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(44L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(45L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(46L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(47L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(48L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(49L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(50L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(51L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(52L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(53L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(54L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(55L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(56L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(57L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(58L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(59L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(60L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(61L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(62L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(63L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(64L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(66L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(67L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(68L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(69L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(121L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(122L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(123L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(124L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(125L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(126L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(127L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(128L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(129L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(130L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(131L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(132L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(133L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(134L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(135L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(136L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(137L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(138L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(139L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(140L))
                    .semester("2025-2")
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(141L))
                    .semester("2025-2")
                    .build());

        };
    }
}
