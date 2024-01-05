package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LearnerTest {
	String email = "abrockwell@my.bpp.com";
	String firstName = "Alice";
	String lastName = "Brockwell";
	String username = "abrockwell";

	Account account = new Account(email, username);
	Identity identity = new Identity(firstName, lastName);

	@Test
	void testEmail() {
		Learner learner = new Learner(account, identity);

		assertEquals(email, learner.email());
	}

	@Test
	void testFirstName() {
		Learner learner = new Learner(account, identity);

		assertEquals(firstName, learner.firstName());
	}

	@Test
	void testLastName() {
		Learner learner = new Learner(account, identity);

		assertEquals(lastName, learner.lastName());
	}

	@Test
	void testUsername() {
		Learner learner = new Learner(account, identity);

		assertEquals(username, learner.username());
	}
}
