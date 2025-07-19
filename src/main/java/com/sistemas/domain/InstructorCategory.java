package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum InstructorCategory {

    PRINCIPAL('P'), ASOCIADO('A'), AUXILIAR('X');

    private final char code;

    InstructorCategory(char code) {
        this.code = code;
    }

    public static InstructorCategory fromCode(char code) {
        for (InstructorCategory ic : InstructorCategory.values()) {
            if (ic.code == code) {
                return ic;
            }
        }
        throw new IllegalArgumentException("Código de categoría docente inválido: " + code);
    }
}
