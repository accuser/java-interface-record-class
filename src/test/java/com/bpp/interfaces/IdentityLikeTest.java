package com.bpp.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IdentityLikeTest {
	IdentityLike identityLike = new IdentityLike() {
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
	void testFirstName() {
		assertEquals("Alice", identityLike.firstName());
	}

	@Test
	void testLastName() {
		assertEquals("Brockwell", identityLike.lastName());
	}
}
