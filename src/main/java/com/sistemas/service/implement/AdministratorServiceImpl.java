package com.sistemas.service.implement;

import com.sistemas.domain.Administrator;
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
        administrator.setPassword(passwordEncoder.encode(administrator.getPassword()));
        return administratorRepository.save(administrator);
    }

    @Override
    public List<Administrator> listAll() {
        return List.of();
    }

    @Override
    public Administrator search(Long id) {
        return null;
    }

    @Override
    public Administrator update(Administrator administrator) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Administrator> findByInstitutionalEmail(String institutionalEmail) {
        return administratorRepository.findByInstitutionalEmail(institutionalEmail);
    }
}
