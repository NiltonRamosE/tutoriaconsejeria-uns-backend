package com.sistemas.domain;

import java.text.Normalizer;

public class InstitutionalEmailGenerator {
    /**
     * Generates an institutional email address based on the provided name and surnames.
     *
     * @param name            The first letter of names of the person.
     * @param paternalSurname The paternal surname of the person.
     * @param maternalSurname  The maternal surname of the person.
     * @return A string representing the institutional email address.
     */

    public static String generateInstitutionalEmail(String name, String paternalSurname, String maternalSurname) {
        name = removeAccents(name);
        paternalSurname = removeAccents(paternalSurname);
        maternalSurname = removeAccents(maternalSurname);

        String[] names = name.split(" ");
        StringBuilder emailBuilder = new StringBuilder();

        for (String part : names) {
            if (!part.isEmpty()) {
                emailBuilder.append(part.charAt(0));
            }
        }

        emailBuilder.append(paternalSurname);
        if (!maternalSurname.isEmpty()) {
            emailBuilder.append(maternalSurname.charAt(0));
        }

        return emailBuilder.toString().toLowerCase() + "@uns.edu.pe";
    }

    private static String removeAccents(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", ""); // \p{M} es marca de acento en Unicode
    }
}
