package com.sistemas.service.implement;

import com.sistemas.domain.AppointmentSchedule;
import com.sistemas.repository.AppointmentScheduleRepository;
import com.sistemas.service.AppointmentScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppointmentScheduleServiceImpl implements AppointmentScheduleService {

    private final AppointmentScheduleRepository appointmentScheduleRepository;

    @Override
    public AppointmentSchedule create(AppointmentSchedule appointmentSchedule) {
        return appointmentScheduleRepository.save(appointmentSchedule);
    }

    @Override
    public List<AppointmentSchedule> listAll() {
        return appointmentScheduleRepository.findAll();
    }

    @Override
    public AppointmentSchedule search(Long id) {
        AppointmentSchedule appointmentSchedule = null;
        Optional<AppointmentSchedule> appointmentScheduleWanted = appointmentScheduleRepository.findById(id);
        if (appointmentScheduleWanted.isPresent()) {
            appointmentSchedule = appointmentScheduleWanted.get();
        }
        return appointmentSchedule;
    }

    @Override
    public AppointmentSchedule update(AppointmentSchedule appointmentSchedule) {
        return appointmentScheduleRepository.save(appointmentSchedule);
    }

    @Override
    public void delete(Long id) {
        appointmentScheduleRepository.deleteById(id);
    }

    @Override
    public List<AppointmentSchedule> findByAppointmentIdIn(List<Long> appointmentIds) {
        return appointmentScheduleRepository.findByAppointmentIdIn(appointmentIds);
    }
}
