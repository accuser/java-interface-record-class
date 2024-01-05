package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import com.bpp.interfaces.IdentityLike;

class IdentityTest {
	String firstName = "Alice";
	String lastName = "Brockwell";

	private IdentityLike identityLike = new IdentityLike() {
		@Override
		public String firstName() {
			return firstName;
		}

		@Override
		public String lastName() {
			return lastName;
		}
	};

	@Test
	void testConstructWithFirstNameAndLastName() {
		Identity identity = new Identity(firstName, lastName);

		assertNotNull(identity);
		assertEquals(firstName, identity.firstName());
		assertEquals(lastName, identity.lastName());
	}

	@Test
	void testFromIdentityLike() {
		Identity identity = Identity.from(identityLike);

		assertNotNull(identity);
		assertEquals(firstName, identity.firstName());
		assertEquals(lastName, identity.lastName());
	}

	@Test
	void testFirstName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(firstName, identity.firstName());
	}

	@Test
	void testLastName() {
		Identity identity = Identity.from(identityLike);

		assertEquals(lastName, identity.lastName());
	}
}
