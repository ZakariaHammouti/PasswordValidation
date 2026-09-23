package org.example;

import java.util.Scanner;

public class Main {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        //Min ein SonderZeichen, Max 3 SonderZeichen
        //Min ein Ziffer, Max 4 Ziffer
        //Min eine KleinBuchstabe, Max 3
        //Min eine GroBuchstabe, Max 4
        //Passwort-Gesamtlänge 100 Zeichen
        //Besondheiten:

        //Nochc offen: Vorschläge eines passworts
        
        System.out.println("Gib einen gültigen Passwort ein: ");
        String userPassword = sc.nextLine();

        if (PasswordValidation.isValid(userPassword))
            System.out.println("Password is valid");
        else
            System.out.println("Password ist invalid");
    }
}
