package com.sistemas.dto.administrator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdministratorRequest {
    private Long id;
    private String administratorName;
    private String administratorPaternalSurname;
    private String administratorMaternalSurname;
    private String password;
    private char gender;
}
