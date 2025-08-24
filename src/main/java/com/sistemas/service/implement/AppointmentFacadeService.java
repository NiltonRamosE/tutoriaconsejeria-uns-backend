package com.sistemas.service.implement;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.domain.Instructor;
import com.sistemas.domain.Student;
import com.sistemas.dto.student.ScheduleGroupAppointmentRequest;
import com.sistemas.dto.student.ScheduleIndividualAppointmentRequest;
import com.sistemas.mapper.AppointmentMapper;
import com.sistemas.mapper.AppointmentScheduleMapper;
import com.sistemas.service.AppointmentScheduleService;
import com.sistemas.service.AppointmentService;
import com.sistemas.service.InstructorService;
import com.sistemas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppointmentFacadeService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentScheduleService appointmentScheduleService;

    @Autowired
    private AppointmentScheduleMapper appointmentScheduleMapper;

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Transactional
    public AppointmentSchedule createIndividualAppointment(
            ScheduleIndividualAppointmentRequest request,
            String sender
    ) {

        Instructor instructorFound = instructorService.search(request.getInstructorId());
        Student studentFound = studentService.search(request.getStudentId());

        Appointment appointmentCreated = appointmentService.create(
                appointmentMapper.mapToAppointmentCreate(request)
        );

        AppointmentSchedule appointmentSchedule = appointmentScheduleMapper.mapToAppointmentScheduleCreate(
                request,
                studentFound,
                instructorFound,
                appointmentCreated,
                sender
        );

        return appointmentScheduleService.create(appointmentSchedule);
    }

    @Transactional
    public List<AppointmentSchedule> createGroupAppointment(
            ScheduleGroupAppointmentRequest request,
            String sender
    ) {
        Instructor instructorFound = instructorService.search(request.getInstructorId());

        List<Student> studentsFound = request.getStudentsId().stream()
                .map(studentService::search)
                .toList();

        Appointment appointmentCreated = appointmentService.create(
                appointmentMapper.mapToAppointmentCreate(request)
        );

        return studentsFound.stream()
                .map(student -> appointmentScheduleMapper.mapToAppointmentScheduleCreate(
                        request,
                        student,
                        instructorFound,
                        appointmentCreated,
                        sender
                ))
                .map(appointmentScheduleService::create)
                .toList();
    }
}

