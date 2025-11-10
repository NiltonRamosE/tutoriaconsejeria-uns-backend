package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum AppointmentState {

    PENDIENTE('P'), ACEPTADA('A'), EN_PROCESO('E'), FINALIZADA('F'), CANCELADA('C');

    private final char code;

    AppointmentState(char code) {
        this.code = code;
    }

    public static AppointmentState fromCode(char code) {
        for (AppointmentState as : AppointmentState.values()) {
            if (as.code == code) {
                return as;
            }
        }
        throw new IllegalArgumentException("Código de estado de la cita inválido: " + code);
    }
}
