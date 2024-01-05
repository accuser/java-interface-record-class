package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class IdentityLikeTest {
	@Test
	void testConstructorWithNonNullValues() {
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

		assertNotNull(identityLike);
		assertEquals(firstName, identityLike.firstName());
		assertEquals(lastName, identityLike.lastName());
	}

	@Test
	void testFirstName() {
		String firstName = "Alice";

		IdentityLike identityLike = new IdentityLike() {
			@Override
			public String firstName() {
				return firstName;
			}

			@Override
			public String lastName() {
				return "Brockwell";
			}

		};

		assertEquals(firstName, identityLike.firstName());
	}

	@Test
	void testLastName() {
		String lastName = "Brockwell";

		IdentityLike identityLike = new IdentityLike() {
			@Override
			public String firstName() {
				return "Alice";
			}

			@Override
			public String lastName() {
				return lastName;
			}

		};

		assertEquals(lastName, identityLike.lastName());
	}
}
