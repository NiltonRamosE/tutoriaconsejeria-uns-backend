package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum AppointmentModality {

    INDIVIDUAL('I'), GRUPAL('G');

    private final char code;

    AppointmentModality(char code) {
        this.code = code;
    }

    public static AppointmentModality fromCode(char code) {
        for (AppointmentModality am : AppointmentModality.values()) {
            if (am.code == code) {
                return am;
            }
        }
        throw new IllegalArgumentException("Código de modalidad de la cita inválido: " + code);
    }
}
