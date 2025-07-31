package com.sistemas.seeder;

import com.sistemas.domain.Administrator;
import com.sistemas.service.AdministratorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdministratorSeeder {
    @Bean
    CommandLineRunner initAdministratorDatabase(AdministratorService administratorService) {
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
