package com.bpp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class IdentityValidationTest {
	@Test
	void testIsValidFirstName_ValidFirstName_ReturnsTrue() {
		boolean isValid = IdentityValidation.isValidFirstName("Alice");
		assertTrue(isValid);
	}

	@Test
	void testIsValidFirstName_InvalidFirstName_ReturnsFalse() {
		boolean isValid = IdentityValidation.isValidFirstName("123");
		assertFalse(isValid);
	}

	@Test
	void testIsValidLastName_ValidLastName_ReturnsTrue() {
		boolean isValid = IdentityValidation.isValidLastName("Brockwell");
		assertTrue(isValid);
	}

	@Test
	void testIsValidLastName_InvalidLastName_ReturnsFalse() {
		boolean isValid = IdentityValidation.isValidLastName("123");
		assertFalse(isValid);
	}
}
