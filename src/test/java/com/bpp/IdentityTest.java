package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class IdentityTest {
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
	public void testFromIdentityLike() {
		Identity identity = Identity.from(identityLike);

		assertNotNull(identity);
		assertEquals(identityLike.firstName(), identity.firstName());
		assertEquals(identityLike.lastName(), identity.lastName());
	}

	@Test
	public void testGetFirstName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(identityLike.firstName(), identity.firstName());
	}

	@Test
	public void testGetLastName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(identityLike.lastName(), identity.lastName());
	}
}