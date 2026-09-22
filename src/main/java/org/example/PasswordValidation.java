package org.example;

public class PasswordValidation {

    //Min ein SonderZeichen, Max 3 SonderZeichen
    //Min ein Ziffer, Max 4 Ziffer
    //Min eine KleinBuchstabe, Max 3
    //Min eine GroBuchstabe, Max 4
    //Passwort-Gesamtlänge 100 Zeichen

    static String[] listReason;

    public static boolean hasMinLength(String password) {
        //returns true bei length > 8
        if (password == null)
            return false;
        if (password.isBlank())
            return false;
        return password.length() >= 8;
    }

    public static boolean containsInvalidChar(String password) {
        return password.contains(" ");
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
                containsUpper = true;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                containsLower = true;
                break;
            }
        }
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
    public static boolean containsSpecialChar(String password) {
        char passwordItem;

        for (int i = 0; i < password.length(); i++) {
            passwordItem = password.charAt(i);
            if (!Character.isLetterOrDigit(passwordItem)) {
                //found
                return true;
            }
        }
        //not found
        return false;
    }

    public static boolean containsMaxThreeSpecialChar(String password) {
        char passwordItem;
        int countSpecialChar = 0;
        for (int i = 0; i < password.length(); i++) {
            passwordItem = password.charAt(i);
            if (!Character.isLetterOrDigit(passwordItem)) {
                //found
                countSpecialChar++;
                if (countSpecialChar > 3)
                    return false;
            }
        }
        //not found
        return true;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password) {
        //Check if all Conditions are true

        if (!hasMinLength(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (containsInvalidChar(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (!containsDigit(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (!containsUpperAndLower(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (isCommonPassword(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (!containsSpecialChar(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        if (!containsMaxThreeSpecialChar(password)) {
            analyseReason(password);
            showReason();
            return false;
        }

        return true;
    }

    public static void showReason() {

        for (String reason : listReason) {
            if (reason != null) {
                System.out.println("Reason: " + reason);
            }
        }
    }

    public static String[] analyseReason(String password) {
        listReason = new String[7];

        if (!hasMinLength(password)) {
            listReason[0] = "Has not minimal length";
        }

        if (containsInvalidChar(password)) {
            listReason[1] = "contains invalid char";
        }

        if (!containsDigit(password)) {
            listReason[2] = "should contain a number";
        }

        if (!containsUpperAndLower(password)) {
            listReason[3] = "should contain upper and lower letter";
        }

        if (isCommonPassword(password)) {
            listReason[4] = "is common";
        }

        if (!containsSpecialChar(password)) {
            listReason[5] = "should contain a special char";
        }

        if (!containsMaxThreeSpecialChar(password)) {
            listReason[6] = "should contain max. three special characters";
        }

        return listReason;
    }
}
