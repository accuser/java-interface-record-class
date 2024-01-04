package com.bpp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountValidationTest {

    @Test
    public void testValidEmail() {
        assertTrue(AccountValidation.isValidEmail("abrockwell@my.bpp.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(AccountValidation.isValidEmail("invalid_email"));
    }

    @Test
    public void testValidUsername() {
        assertTrue(AccountValidation.isValidUsername("abrockwell"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(AccountValidation.isValidUsername("invalid-username"));
    }
}