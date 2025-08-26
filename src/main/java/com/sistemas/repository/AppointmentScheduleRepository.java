package com.sistemas.repository;

import com.sistemas.domain.AppointmentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {
    List<AppointmentSchedule> findByAppointmentIdIn(List<Long> appointmentIds);

    @Query("""
        SELECT ac
        FROM AppointmentSchedule ac
        JOIN ac.appointment a
        WHERE ac.instructor.id = :instructorId AND a.sender = :sender
    """)
    List<AppointmentSchedule> findByInstructorIdAndSender(Long instructorId, String sender);

    @Query("""
        SELECT ach
        FROM AppointmentSchedule ach
        WHERE ach.appointment.id IN (
            SELECT ac.appointment.id
            FROM AppointmentSchedule ac
            WHERE (ac.appointment.studentSender.id != :studentId OR ac.appointment.studentSender.id IS NULL)
            AND ac.student.id = :studentId
        )
    """)
    List<AppointmentSchedule> findAppointmentsForStudentWhereNotSender(Long studentId);

}
