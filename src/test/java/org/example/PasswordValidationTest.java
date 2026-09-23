package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @ParameterizedTest
    @ValueSource(strings = {"dfffgffff", "asggbdfsddddddd", "asggbdfsddDSddA§()=ddd", "FVKC;cmd"})
    void hasMinLength_ShouldReturnTrueByGivenValidLength(String password) {
        assertTrue(PasswordValidation.hasMinLength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "dd", "%%dsdsd", ";;;;,", "zedf"})
    void hasMinLength_ShouldReturnFalseByGivenInvalidLength(String password) {
        assertFalse(PasswordValidation.hasMinLength(password));
    }

    @Test
    void hasMinLength_ShouldReturnFalseByGivenBlankPassword() {
        assertFalse(PasswordValidation.hasMinLength(""));
    }

    @Test
    void hasMinLength_ShouldReturnFalseByGivenEmptyPassword() {
        assertFalse(PasswordValidation.hasMinLength("        "));
    }

    @Test
    void hasMinLength_ShouldReturnTrueByGivenValidPasswordLength8() {
        assertTrue(PasswordValidation.hasMinLength("asde1234"));
    }

    @Test
    void containsInvalidChar_ShouldReturnTrueByGivenPasswortWithoutEmpty() {
        assertFalse(PasswordValidation.containsInvalidChar("asde1234"));
    }

    @Test
    void containsInvalidChar_ShouldReturnTrueByGGivenPasswortStartsWithEmpty() {
        assertTrue(PasswordValidation.containsInvalidChar(" sdfe"));
    }

    @Test
    void containsInvalidChar_ShouldReturnTrueByGGivenPasswortEndsWithEmpty() {
        assertTrue(PasswordValidation.containsInvalidChar("sdfe "));
    }

    @Test
    void containsInvalidChar_ShouldReturnTrueByGGivenPasswortWithhEmpty() {
        assertTrue(PasswordValidation.containsInvalidChar("sd fe(77adAA"));
    }

    @Test
    void hasMinLength_ShouldReturnFalseByGivenNull() {
        assertFalse(PasswordValidation.hasMinLength(null));
    }

    @Test
    void containsDigit_ShouldReturnTrueByGivenOneDigit() {
        assertTrue(PasswordValidation.containsDigit("Ruabnnsf1"));
    }

    @Test
    void containsDigit_ShouldReturnFalseByGivenStringWithoutDigit() {
        assertFalse(PasswordValidation.containsDigit("Ruabnnsf"));
    }

    @Test
    void containsUpperAndLower_ShouldReturnTrueByGivenUpperAndLower() {
        assertTrue(PasswordValidation.containsUpperAndLower("bnsdTsf1"));
    }

    @Test
    void containsUpperAndLowerShouldReturnFalseByGivenUpperOnly() {
        assertFalse(PasswordValidation.containsUpperAndLower("AMMSLLÖSÖ%$"));
    }

    @Test
    void containsUpperAndLowerShouldReturnFalseByGivenLowerOnly() {
        assertFalse(PasswordValidation.containsUpperAndLower("asdf§§vsll"));
    }

    //communPaswwords = {"password", "Passwort1", "12345678", "Aa345678"};
    @Test
    void isCommonPassword_ShouldReturnTrueByGivenCommunPassword() {
        assertTrue(PasswordValidation.isCommonPassword("password"));
    }

    //communPaswwords = {"password", "Passwort1", "12345678", "Aa345678"};
    @Test
    void isCommonPassword_ShouldReturnFalseByGivenNoCommunPassword() {
        assertFalse(PasswordValidation.isCommonPassword("asdf§§vsll"));
    }

    @Test
    void containsSpecialChar_ShouldReturnTrueByGivenSpecialChar() {
        assertTrue(PasswordValidation.containsSpecialChar("asdf§§vsll"));
    }

    @Test
    void containsSpecialChar_ShouldReturnFalseByGivenNoSpecialChar() {
        assertFalse(PasswordValidation.containsSpecialChar("asdfDFRvsll15"));

    }

    @ParameterizedTest
    @ValueSource(strings = {"Pass''word1!", "Hallo1234!", "JavaTest1!", "Maven2026!", "GitHub123!",
            "TestPass1!", "Abcdefg1!", "Zakaria12!", "Computer9!", "Programm1!",
            "Developer7!", "CodeTest9!", "JUnitTest1!", "IntelliJ8!", "Terminal5!",
            "Learning2!", "Bootcamp3!", "Example9!", "Testing42!", "Password99!",
            "JavaCode1@", "MavenTest2#", "GitBranch3$", "GitCommit4%", "GitPush5&",
            "GitPull6*", "JavaClass7@", "JavaMethod8#", "JavaArray9$", "JavaString1%",
            "Scanner123!", "Testing123!", "TestJava1@", "CodeJava2#", "HelloJava3$",
            "HalloJava4%", "MyPassword5!", "MySecret6@", "TestUser7#", "TestAdmin8$",
            "AdminTest9%", "UserTest1&", "LoginTest2*"})
    void isValid_ShouldReturnTrueByGivenNotValidPassWords(String password) {
        assertTrue(PasswordValidation.isValid(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ps\nwd1A", "password1", "PASSWORD1", "Passwort", "12345678",
            "abcdefg", "ABCDEFG", "1234567!", "abcdefg!", "ABCDEFG!",
            "password!", "PASSWORD!", "12345678!", "Passwort!", "abcdefgh",
            "ABCDEFGH", "123456789", "!!!!!!!!", "--------", "........",
            "pass1234", "PASS1234", "1234abcd", "1234ABCD", "Password",
            "Password!", "Password@", "Password#", "Passw\nord$"})
    void isValid_ShouldReturnFalseByGivenNotValidPassWords(String pasword) {
        assertFalse(PasswordValidation.isValid(pasword));
    }

    // 5 special char
    @Test
    void containsMaxThreeSpecialChar_ShouldReturnFalseByGivenFiveSpecialChar() {
        assertFalse(PasswordValidation.containsMaxThreeSpecialChar("-----"));
    }

    // 4 special char
    @Test
    void containsMaxThreeSpecialChar_ShouldReturnTwoByGivenFourSpecialChar() {
        assertFalse(PasswordValidation.containsMaxThreeSpecialChar("!a§aaa-%"));
    }

    // 3 special char
    @Test
    void containsMaxThreeSpecialChar_ShouldReturnFalseByGivenThreeSpecialChar() {
        assertTrue(PasswordValidation.containsMaxThreeSpecialChar("_ee-)"));
    }

    // 2 special char
    @Test
    void containsMaxThreeSpecialChar_ShouldReturnTwoByGivenTwoSpecialChar() {
        assertTrue(PasswordValidation.containsMaxThreeSpecialChar("!aaaa%"));
    }


    @Test
    void analyseReason_ShouldReturnTwoReasons() {
        String[] expectedList = new String[]{"Has not minimal length", null, "contains invalid char",
                null, null, null, null, null};
        assertArrayEquals(expectedList, PasswordValidation.analyseReason("sd A/1"));
    }

    @Test
    void analyseReason_ShouldReturnOneReason() {
        String[] expectedList = new String[]{"Has not minimal length", null, null, null,
                null, null, null, null};
        assertArrayEquals(expectedList, PasswordValidation.analyseReason("asdf1§A"));
    }

    //Generated by KI
    @Test
    void showReason_ShouldNotThrowException() {
        PasswordValidation.listReason = new String[]{null, null, "Has not minimal length", null};
        assertDoesNotThrow(PasswordValidation::showReason);
    }

    @Test
    void hasTooMuchCharacters_ShouldReturnTrueByGivenLenghthGreaterThan100() {
        assertTrue(PasswordValidation.hasTooMuchCharacters("sokjdfsoidvcsdiovns@@1" +
                "DKKDKDKDKDKDKKDKDK" +
                "DIIDKDKDKDKDKKDKMMCMCMCMCMMCMCM" +
                "DODKDOKDKOKDKODODOKDKOD" +
                "wpofkweorfkwerpofkwerf"));
    }

    @Test
    void hasTooMuchCharacters_ShouldReturnTrueByGivenLenghthLowerThan100() {
        assertFalse(PasswordValidation.hasTooMuchCharacters("adad@11S"));
    }
}
