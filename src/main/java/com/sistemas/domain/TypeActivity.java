package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum TypeActivity {

    TUTORIA('T'), CONSEJERIA('C');

    private final char code;

    TypeActivity(char code) {
        this.code = code;
    }

    public static TypeActivity fromCode(char code) {
        for (TypeActivity ta : TypeActivity.values()) {
            if (ta.code == code) {
                return ta;
            }
        }
        throw new IllegalArgumentException("Tipo de actividad inválido: " + code);
    }
}
