package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum InstructorDedication {

    DOCENTE_ORDINARIO("D.E"), TIEMPO_COMPLETO("T.C"), TIEMPO_PARCIAL("T.P");

    private final String code;

    InstructorDedication(String code) {
        this.code = code;
    }

    public static InstructorDedication fromCode(String code) {
        for (InstructorDedication id : InstructorDedication.values()) {
            if (id.code.equals(code)) {
                return id;
            }
        }
        throw new IllegalArgumentException("Código de dedicación docente inválido: " + code);
    }
}
