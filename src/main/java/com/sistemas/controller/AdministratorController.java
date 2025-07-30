package com.sistemas.controller;

import com.sistemas.domain.Administrator;
import com.sistemas.service.AdministratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/administrator", produces = "application/json")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;


    @PostMapping("/create")
    public ResponseEntity<Administrator> createAdministrator(@Valid @RequestBody Administrator administrator) {
        Administrator savedAdministrator = administratorService.create(administrator);
        return ResponseEntity.ok(savedAdministrator);
    }
}
