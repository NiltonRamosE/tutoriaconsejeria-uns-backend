package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum InstructorCondition {

    NOMBRADO('N'), CONTRATADO('C');

    private final char code;

    InstructorCondition(char code) {
        this.code = code;
    }

    public static InstructorCondition fromCode(char code) {
        for (InstructorCondition ic : InstructorCondition.values()) {
            if (ic.code == code) {
                return ic;
            }
        }
        throw new IllegalArgumentException("Código de condicion docente inválido: " + code);
    }
}
