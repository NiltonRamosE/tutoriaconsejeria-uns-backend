package com.sistemas.service;

import com.sistemas.domain.Administrator;

import java.util.Optional;

public interface AdministratorService extends IGenericService<Administrator, Long> {

    Optional<Administrator> findByInstitutionalEmail(String institutionalEmail);
}
