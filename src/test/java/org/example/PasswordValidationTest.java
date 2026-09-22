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
    @ValueSource(strings = {"", "dd", "%%dsdsd", ";;;;"})
    void hasMinLength_ShouldReturnFalseByGivenInvalidLength(String password) {
        assertFalse(PasswordValidation.hasMinLength(password));
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
        assertTrue(PasswordValidation.containsSpecialChar("asdf§§vsll", ""));
    }

    @Test
    void containsSpecialChar_ShouldReturnFalseByGivenNoSpecialChar() {
        assertFalse(PasswordValidation.containsSpecialChar("asdfDFRvsll15", ""));

    }

    //TDD Testcase
    @Test
    void isValid() {
        assertTrue(PasswordValidation.isValid(""));
    }
}