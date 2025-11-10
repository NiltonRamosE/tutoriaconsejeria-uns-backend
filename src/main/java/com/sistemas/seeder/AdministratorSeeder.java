package com.sistemas.seeder;

import com.sistemas.domain.Administrator;
import com.sistemas.service.AdministratorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdministratorSeeder {
    CommandLineRunner initAdministratorTable(AdministratorService administratorService) {
        return args -> {
            administratorService.create(Administrator.builder()
                    .name("NILTON")
                    .paternalSurname("RAMOS")
                    .maternalSurname("ENCARNACION")
                    .genderCode('M')
                    .password("123456")
                    .build());
        };
    }
}
