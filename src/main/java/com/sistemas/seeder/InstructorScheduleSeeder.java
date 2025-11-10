package com.sistemas.seeder;

import com.sistemas.domain.InstructorSchedule;
import com.sistemas.service.AcademicScheduleService;
import com.sistemas.service.InstructorScheduleService;
import com.sistemas.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InstructorScheduleSeeder {

    @Autowired
    InstructorService instructorService;
    @Autowired
    AcademicScheduleService academicScheduleService;

    CommandLineRunner initInstructorScheduleTable(InstructorScheduleService instructorScheduleService) {
        return args -> {
            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(1L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(2L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(3L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(4L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(5L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(6L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(7L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(8L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(9L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(10L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(11L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(12L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(13L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(14L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(15L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(16L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(17L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(18L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(19L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(20L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(21L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(22L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(23L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(24L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(25L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(26L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(27L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(28L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(29L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(30L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(31L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(32L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(33L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(34L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(35L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(36L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(37L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(38L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(39L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(40L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(41L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(42L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(43L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(44L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(45L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(46L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(47L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(48L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(49L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(50L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(51L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(52L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(53L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(54L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(55L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(56L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(57L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(58L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(59L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(60L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(61L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(62L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(63L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(64L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(65L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(66L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(67L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(68L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(69L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(70L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(71L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(72L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(73L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(74L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(75L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(76L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(77L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(78L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(79L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(80L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(81L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(82L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(83L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(84L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(85L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(86L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(87L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(88L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(89L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(90L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(91L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(92L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(93L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(94L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(95L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(96L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(97L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(98L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(99L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(100L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(101L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(102L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(103L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(104L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(105L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(106L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(107L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(108L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(109L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(110L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(111L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(112L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(113L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(114L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(115L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(116L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(117L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(118L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(119L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(120L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(121L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(2L))
                    .academicSchedule(academicScheduleService.search(122L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(3L))
                    .academicSchedule(academicScheduleService.search(123L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(4L))
                    .academicSchedule(academicScheduleService.search(124L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(5L))
                    .academicSchedule(academicScheduleService.search(125L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(6L))
                    .academicSchedule(academicScheduleService.search(126L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(7L))
                    .academicSchedule(academicScheduleService.search(127L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(8L))
                    .academicSchedule(academicScheduleService.search(128L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(9L))
                    .academicSchedule(academicScheduleService.search(129L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(10L))
                    .academicSchedule(academicScheduleService.search(130L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(11L))
                    .academicSchedule(academicScheduleService.search(131L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(12L))
                    .academicSchedule(academicScheduleService.search(132L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(13L))
                    .academicSchedule(academicScheduleService.search(133L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(14L))
                    .academicSchedule(academicScheduleService.search(134L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(15L))
                    .academicSchedule(academicScheduleService.search(135L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(16L))
                    .academicSchedule(academicScheduleService.search(136L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(17L))
                    .academicSchedule(academicScheduleService.search(137L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(18L))
                    .academicSchedule(academicScheduleService.search(138L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(19L))
                    .academicSchedule(academicScheduleService.search(139L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(20L))
                    .academicSchedule(academicScheduleService.search(140L))
                    .build());

            instructorScheduleService.create(InstructorSchedule.builder()
                    .instructor(instructorService.search(1L))
                    .academicSchedule(academicScheduleService.search(141L))
                    .build());

        };
    }
}
