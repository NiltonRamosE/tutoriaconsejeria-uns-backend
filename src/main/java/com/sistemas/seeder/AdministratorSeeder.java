package com.sistemas.seeder;

import com.sistemas.domain.Administrator;
import com.sistemas.service.AdministratorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdministratorSeeder {
    @Bean
    CommandLineRunner initDatabase(AdministratorService administratorService) {
        return args -> {
            administratorService.create(Administrator.builder()
                    .name("NILTON")
                    .paternalSurname("RAMOS")
                    .maternalSurname("ENCARNACION")
                    .genderCode('M')
                    .institutionalEmail("admin@uns.edu.pe")
                    .password("123456")
                    .build());
        };
    }
}
