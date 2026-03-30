package com.sistemas.repository;

import com.sistemas.domain.AcademicSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AcademicScheduleRepository extends JpaRepository<AcademicSchedule, Long> {
    List<AcademicSchedule> findByCycle(Integer cycle);

    List<AcademicSchedule> findByStudentSchedulesStudentIdAndStudentSchedulesSemester(Long studentId, String semester);

    @Query(value = """
            WITH StudentAcademicSchedule AS (
                SELECT acs.start_time, acs.end_time, acs.day
                FROM student_schedules ss
                INNER JOIN academic_schedules acs ON ss.schedule_id = acs.schedule_id
                WHERE ss.student_id = :studentId
                AND ss.semester = :semester
            ),
            InstructorAcademicSchedule AS (
                SELECT acs.start_time, acs.end_time, acs.day
                FROM instructor_schedules ins
                INNER JOIN academic_schedules acs ON ins.schedule_id = acs.schedule_id
                WHERE ins.instructor_id = :instructorId
                AND ins.semester = :semester
            )
            SELECT *
            FROM StudentAcademicSchedule
            UNION
            SELECT *
            FROM InstructorAcademicSchedule
            """, nativeQuery = true)
    List<Object[]> findAcademicScheduleByStudentAndInstructor(@Param("studentId") Long studentId, @Param("instructorId") Long instructorId, String semester);
}
