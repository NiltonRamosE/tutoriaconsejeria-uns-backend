package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum Gender {

    MASCULINO('M'), FEMENINO('F'), OTROS('O');

    private final char code;

    Gender(char code) {
        this.code = code;
    }

    public static Gender fromCode(char code) {
        for (Gender g : Gender.values()) {
            if (g.code == code) {
                return g;
            }
        }
        throw new IllegalArgumentException("Código de género inválido: " + code);
    }
}
