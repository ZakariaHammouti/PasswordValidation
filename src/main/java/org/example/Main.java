package org.example;

import java.util.Scanner;

public class Main {

    public static void main() {
        //System.out.println("Hello Welt! Initial Version");
        //System.out.println("Testen, ob beim Pushen CI GitHub ausgeführt wird");
        //System.out.println(PasswordValidation.containsDigit("passasda!§C$%&/()="));
        //System.out.println(PasswordValidation.containsUpperAndLower("!§C$%&/()=dgdgdrgA"));
        //System.out.println("isCommonPassword(String password)" + PasswordValidation.isCommonPassword("!§C$%&/()=dgdgdrgA"));

        //System.out.println("containsSpecialChar: " + PasswordValidation.containsSpecialChar("assword", "String allowed"));

        Scanner sc = new Scanner(System.in);

        //Min ein SonderZeichen, Max 3 SonderZeichen
        //Min ein Ziffer, Max 4 Ziffer
        //Min eine KleinBuchstabe, Max 3
        //Min eine GroBuchstabe, Max 4
        //Passwort-Gesamtlänge 100 Zeichen

        //Besondheiten: Passwort darf

        /*System.out.println("Mindestens ein Ziffer");
        System.out.println("Mindestens eine Großbuchstabe");
        System.out.println("Mindestens eine Kleinbuchstabe");
        System.out.println("Mindestens einen Sonderzeichen");
        System.out.println("Mindestens acht Zeichen");
        System.out.println("########## PASSWORT ############");*/
        System.out.println("Gib einen gültigen Passwort ein: ");

        String userPassword = sc.nextLine();
        //Passwords created in chatGPT and updated manually
       /* String[] passWordsvalid = {"Pass'''word1!", "Hallo1234!", "JavaTest1!", "Maven2026!", "GitHub123!",
                "TestPass1!", "Abcdefg1!", "Zakaria12!", "Computer9!", "Programm1!",
                "Developer7!", "CodeTest9!", "JUnitTest1!", "IntelliJ8!", "Terminal5!",
                "Learning2!", "Bootcamp3!", "Example9!", "Testing42!", "Password99!",
                "JavaCode1@", "MavenTest2#", "GitBranch3$", "GitCommit4%", "GitPush5&",
                "GitPull6*", "JavaClass7@", "JavaMethod8#", "JavaArray9$", "JavaString1%",
                "Scanner123!", "Testing123!", "TestJava1@", "CodeJava2#", "HelloJava3$",
                "HalloJava4%", "MyPassword5!", "MySecret6@", "TestUser7#", "TestAdmin8$",
                "AdminTest9%", "UserTest1&", "LoginTest2*", "SecureTest3!", "ValidTest4@",
                "Correct5#", "Example6$", "SampleTest7%", "DemoTest8&", "Password10!",
                "Password11@", "Password12#", "Password13$", "Password14%", "Password15&",
                "Password16*", "Password17!", "Password18@", "Password19#", "Password20$",
                "TestPass10%", "TestPass11&", "TestPass12*", "TestPass13!", "TestPass14@",
                "TestPass15#", "TestPass16$", "TestPass17%", "TestPass18&", "TestPass19*",
                "TestPass20!", "Abcdefg2@", "Abcdefg3#", "Abcdefg4$", "Abcdefg5%",
                "Abcdefg6&", "Abcdefg7*", "Abcdefg8!", "Abcdefg9@", "Hello123#",
                "Hello124$", "Hello125%", "Hello126&", "Hello127*", "Hello128!",
                "Hello129@", "Hello130#", "Welcome1$", "Welcome2%", "Welcome3&",
                "Welcome4*", "Welcome5!", "Welcome6@", "Welcome7#", "Welcome8$",
                "Welcome9%", "Welcome10&"
        };

        //Passwords created in chatGPT and updated manually
        String[] passWordsInvalid = {"ps\nwd1A", "password1", "PASSWORD1", "Passwort", "12345678",
                "abcdefg", "ABCDEFG", "1234567!", "abcdefg!", "ABCDEFG!",
                "password!", "PASSWORD!", "12345678!", "Passwort!", "abcdefgh",
                "ABCDEFGH", "123456789", "!!!!!!!!", "--------", "........",
                "pass1234", "PASS1234", "1234abcd", "1234ABCD", "Password",
                "Password!", "Password@", "Password#", "Passw\nord$", "Password%",
                "Password&", "Password*", "Pass1!", "Pass12!", "PASSWORT1!",
                "passwort1!", "123456789!", "abcdefgh1!", "ABCDEFGH1!", "!!!!!!!!1",
                "--------1", "........1", "12345678@", "12345678#", "12345678$",
                "12345678%", "12345678&", "12345678*", "abcdefgh!", "abcdefg1!",
                "abcdef1!", "abcde1!", "abcd1!", "abc1!", "ABCDEFG!",
                "ABCDEFG1!", "ABCDEF1!", "ABCDE1!", "ABCD1!", "A1!",
                "Ab1!", "Abc1!", "Abcd1!", "Abcde1!", "1234567a!",
                "1234567A!", "123456a!", "123456A!", "12345a!", "12345A!",
                "1234a!", "1234A!", "123a!", "123A!", "12a!",
                "12A!", "1a!", "1A!", "abcdefgh", "ABCDEFGH",
                "password123", "PASSWORD123", "Passwort123", "passwort123", "1234567890",
                "1234567", "abcdefg", "ABCDEFG", "!!!!!!!!", "--------"
        };/*
        /*System.out.println("hasMinLength: " + PasswordValidation.hasMinLength(userPassword));
        System.out.println("containsDigit: " + PasswordValidation.containsDigit(userPassword));
        System.out.println("containsUpperAndLower: " + PasswordValidation.containsUpperAndLower(userPassword));
        System.out.println("isCommonPassword: " + PasswordValidation.isCommonPassword(userPassword));
        System.out.println("containsSpecialChar: " + PasswordValidation.containsSpecialChar(userPassword, ""));*/
        System.out.println("##########");

        /*for (int i = 0; i < passWordsInvalid.length; i++) {

            //System.out.println("isValid: " + PasswordValidation.isValid(passWordsInvalid[i]));
            if (PasswordValidation.isValid(passWordsInvalid[i])) {

                System.out.println("##########" + i + "passWordsInvalid[i]: " + passWordsInvalid[i].length());
                System.out.println("isValid: " + PasswordValidation.isValid(passWordsInvalid[i]));
                System.out.println(passWordsInvalid[i]);
            }
        }*/
        System.out.println("isValid: " + PasswordValidation.isValid(userPassword));

    }
}
