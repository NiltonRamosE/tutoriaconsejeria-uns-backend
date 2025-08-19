package com.sistemas.mapper;

import com.sistemas.domain.Administrator;
import com.sistemas.dto.administrator.AdministratorResponse;
import org.springframework.stereotype.Component;

@Component
public class AdministratorMapper {
    public AdministratorResponse mapToAdministratorResponse(Administrator administrator) {
        if (administrator == null) {
            return null;
        }

        return AdministratorResponse.builder()
            .id(administrator.getId())
            .administratorName(administrator.getName())
            .administratorPaternalSurname(administrator.getPaternalSurname())
            .administratorMaternalSurname(administrator.getMaternalSurname())
            .administratorInstitutionalEmail(administrator.getInstitutionalEmail())
            .gender(administrator.getGender().toString())
            .build();
    }
}
