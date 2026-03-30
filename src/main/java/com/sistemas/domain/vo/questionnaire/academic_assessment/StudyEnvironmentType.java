package com.sistemas.domain.vo.questionnaire.academic_assessment;

public enum StudyEnvironmentType {
    EI("Estado de la infraestructura"),
    EE("Esmero y empatía en su atención");

    private final String code;

    StudyEnvironmentType(String code) {
        this.code = code;
    }

    public static StudyEnvironmentType fromCode(String code) {
        for (StudyEnvironmentType id : StudyEnvironmentType.values()) {
            if (id.code.equals(code)) {
                return id;
            }
        }
        throw new IllegalArgumentException("Código de tipo de ambiente de estudio inválido: " + code);
    }
}
