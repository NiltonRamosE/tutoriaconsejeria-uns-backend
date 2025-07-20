package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum AppointmentReason {

    A("Rendimiento académico"),
    B("Mejorar técnicas de estudio"),
    C("Problemas de aprendizaje"),
    D("Problemas interpersonales con estudiantes"),
    E("Problemas de salud"),
    F("Problemas interpersonales con docentes"),
    G("Problemas interpersonales con otras personas"),
    H("Problemas económicos"),
    I("Problemas afectivos"),
    J("Problemas familiares");

    private final String code;

    AppointmentReason(String code) {
        this.code = code;
    }

}
