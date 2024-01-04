package com.bpp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountUtilitiesTest {
	IdentityLike identity = new IdentityLike() {
		@Override
		public String firstName() {
			return "Alice";
		}

		@Override
		public String lastName() {
			return "Brockwell";
		}

	};

	@Test
	public void testGenerateDefaultEmailWithUsername() {
		String username = "alice";

		String email = AccountUtilities.generateDefaultEmail(username);

		assertEquals("alice@my.bpp.com", email);
	}

	@Test
	public void testGenerateDefaultEmailWithIdentity() {
		String email = AccountUtilities.generateDefaultEmail(identity);

		assertEquals("abrockwell@my.bpp.com", email);
	}

	@Test
	public void testGenerateDefaultUsername() {
		String username = AccountUtilities.generateDefaultUsername(identity);

		assertEquals("abrockwell", username);
	}
}