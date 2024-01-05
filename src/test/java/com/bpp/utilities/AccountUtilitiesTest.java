package com.bpp.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.bpp.interfaces.IdentityLike;

class AccountUtilitiesTest {
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
	void testGenerateDefaultEmailWithUsername() {
		String username = "alice";

		String email = AccountUtilities.generateDefaultEmail(username);

		assertEquals("alice@my.bpp.com", email);
	}

	@Test
	void testGenerateDefaultEmailWithIdentity() {
		String email = AccountUtilities.generateDefaultEmail(identity);

		assertEquals("abrockwell@my.bpp.com", email);
	}

	@Test
	void testGenerateDefaultUsername() {
		String username = AccountUtilities.generateDefaultUsername(identity);

		assertEquals("abrockwell", username);
	}
}
