package com.sistemas.service.implement;

import com.sistemas.domain.Administrator;
import com.sistemas.domain.InstitutionalEmailGenerator;
import com.sistemas.repository.AdministratorRepository;
import com.sistemas.service.AdministratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdministratorServiceImpl implements AdministratorService {

    private final AdministratorRepository administratorRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Administrator create(Administrator administrator) {
        String institutionalEmail = InstitutionalEmailGenerator.generateInstitutionalEmail(administrator.getName(), administrator.getPaternalSurname(), administrator.getMaternalSurname());
        administrator.setInstitutionalEmail(institutionalEmail);
        administrator.setPassword(passwordEncoder.encode(administrator.getPassword()));

        return administratorRepository.save(administrator);
    }

    @Override
    public List<Administrator> listAll() {
        return administratorRepository.findAll();
    }

    @Override
    public Administrator search(Long id) {
        Administrator administrator = null;
        Optional<Administrator> administratorWanted = administratorRepository.findById(id);
        if (administratorWanted.isPresent()) {
            administrator = administratorWanted.get();
        }
        return administrator;
    }

    @Override
    public Administrator update(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void delete(Long id) {
        administratorRepository.deleteById(id);
    }

    @Override
    public Optional<Administrator> findByInstitutionalEmail(String institutionalEmail) {
        return administratorRepository.findByInstitutionalEmail(institutionalEmail);
    }
}
