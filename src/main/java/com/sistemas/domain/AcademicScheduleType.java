package com.sistemas.domain;

import lombok.Getter;

@Getter
public enum AcademicScheduleType {

    TEORIA("TEO"), LABORATORIO("LAB");

    private final String code;

    AcademicScheduleType(String code) {
        this.code = code;
    }

    public static AcademicScheduleType fromCode(String code) {
        for (AcademicScheduleType at : AcademicScheduleType.values()) {
            if (at.code.equals(code)) {
                return at;
            }
        }
        throw new IllegalArgumentException("Código de tipo de curso inválido: " + code);
    }
}
