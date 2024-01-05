package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class IdentityTest {
	private IdentityLike identityLike = new IdentityLike() {
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
	void testFromIdentityLike() {
		Identity identity = Identity.from(identityLike);

		assertNotNull(identity);
		assertEquals(identityLike.firstName(), identity.firstName());
		assertEquals(identityLike.lastName(), identity.lastName());
	}

	@Test
	void testGetFirstName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(identityLike.firstName(), identity.firstName());
	}

	@Test
	void testGetLastName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(identityLike.lastName(), identity.lastName());
	}
}
