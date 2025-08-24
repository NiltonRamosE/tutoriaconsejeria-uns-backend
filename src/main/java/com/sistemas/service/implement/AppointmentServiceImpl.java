package com.sistemas.service.implement;

import com.sistemas.domain.Appointment;
import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.repository.AppointmentRepository;
import com.sistemas.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public Appointment create(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> listAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment search(Long id) {
        Appointment appointment = null;
        Optional<Appointment> appointmentWanted = appointmentRepository.findById(id);
        if (appointmentWanted.isPresent()) {
            appointment = appointmentWanted.get();
        }
        return appointment;
    }

    @Override
    public Appointment update(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<Appointment> findByStudentSenderIdAndSender(Long studentSenderId, String sender) {
        return appointmentRepository.findByStudentSenderIdAndSender(studentSenderId, sender);
    }
}
