package org.example;

public class PasswordValidation {

    //Min ein SonderZeichen, Max 3 SonderZeichen
    //Min ein Ziffer, Max 4 Ziffer
    //Min eine KleinBuchstabe, Max 3
    //Min eine GroBuchstabe, Max 4
    //Passwort-Gesamtlänge 100 Zeichen

    public static boolean hasMinLength(String password) {
        //returns true bei length > 8
        return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        char element;
        int indexOfChar;
        for (int i = 0; i < password.length(); i++) {
            element = password.charAt(i);
            indexOfChar = (int) element;
            if ((int) element >= 48 && (int) element <= 57) {
                // Zahl gefunden
                return true;
            }
        }
        // Zahl nicht gefunden
        return false;
    }

    public static boolean containsUpperAndLower(String password) {

        boolean containsUpper = false;
        boolean containsLower = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                //System.out.println("Gross gefunden");
                containsUpper = true;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                //System.out.println("Klein gefunden");
                containsLower = true;
                break;
            }
        }
        //System.out.println("Upper:  " + containsUpper + " Lower: " + containsLower);
        return containsUpper && containsLower;

    }

    public static boolean isCommonPassword(String password) {
        // kleine interne Liste
        String[] communPaswwords = {"password", "Passwort1", "12345678", "Aa345678"};

        for (int i = 0; i < communPaswwords.length; i++) {
            if (communPaswwords[i].equals(password)) {
                // Password häufig
                return true;
            }
        }

        return false;
    }

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        char passwordItem;

        for (int i = 0; i < password.length(); i++) {
            passwordItem = password.charAt(i);
            //System.out.println(Character.isLetterOrDigit(passwordItem));
            if (!Character.isLetterOrDigit(passwordItem)) {
                //found
                return true;
            }
        }
        //not found
        return false;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password) {
        //Check if all Conditions are true
        return hasMinLength(password) &&
                containsDigit(password) &&
                containsUpperAndLower(password) &&
                !isCommonPassword(password) &&
                containsSpecialChar(password, "");
    }
}
