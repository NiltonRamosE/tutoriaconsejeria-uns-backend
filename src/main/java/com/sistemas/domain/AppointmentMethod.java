package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum AppointmentMethod {
    A("Personal"),
    B("Telefónica"),
    C("Correo electrónico"),
    D("Chat");

    private final String code;

    AppointmentMethod(String code) {
        this.code = code;
    }
}
