package com.sistemas.domain;

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
        String[] names = name.split(" ");
        StringBuilder emailBuilder = new StringBuilder();

        for (String part : names) {
            emailBuilder.append(part.charAt(0));
        }

        emailBuilder.append(paternalSurname);
        emailBuilder.append(maternalSurname.charAt(0));

        return emailBuilder.toString().toLowerCase() + "@uns.edu.pe";
    }
}
