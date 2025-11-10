package com.sistemas.domain.vo.student;

import lombok.Getter;

@Getter
public enum PersonalProblemType {

    A("Problemas de aprendizaje"),
    B("Problemas económicos"),
    C("Problemas de salud"),
    D("Problemas familiares"),
    E("Problemas afectivos personales"),
    F("Problemas personales");

    private final String code;

    PersonalProblemType(String code) {
        this.code = code;
    }
}
