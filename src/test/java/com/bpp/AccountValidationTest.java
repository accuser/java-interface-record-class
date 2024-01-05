package com.bpp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AccountValidationTest {
	@Test
	void testValidEmail() {
		assertTrue(AccountValidation.isValidEmail("abrockwell@my.bpp.com"));
	}

	@Test
	void testInvalidEmail() {
		assertFalse(AccountValidation.isValidEmail("invalid_email"));
	}

	@Test
	void testValidUsername() {
		assertTrue(AccountValidation.isValidUsername("abrockwell"));
	}

	@Test
	void testInvalidUsername() {
		assertFalse(AccountValidation.isValidUsername("invalid-username"));
	}
}
