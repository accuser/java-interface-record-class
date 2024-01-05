package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class IdentityFactoryTest {
	String firstName = "Alice";
	String lastName = "Brockwell";

	IdentityLike identityLike = new IdentityLike() {
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
	void testCreateIdentityWithValidNames() {
		Identity identity = IdentityFactory.createIdentity(firstName, lastName);

		assertNotNull(identity);
		assertEquals(firstName, identity.firstName());
		assertEquals(lastName, identity.lastName());
	}

	@Test
	void testCreateIdentityWithInvalidFirstName() {
		String firstName = "123";

		assertThrows(IllegalArgumentException.class, () -> {
			IdentityFactory.createIdentity(firstName, lastName);
		});
	}

	@Test
	void testCreateIdentityWithInvalidLastName() {
		String lastName = "123";

		assertThrows(IllegalArgumentException.class, () -> {
			IdentityFactory.createIdentity(firstName, lastName);
		});
	}

	@Test
	void testCreateAccountWithValidIdentityLike() {
		Identity identity = IdentityFactory.createAccount(identityLike);

		assertNotNull(identity);
		assertEquals(firstName, identity.firstName());
		assertEquals(lastName, identity.lastName());
	}
}
