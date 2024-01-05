package com.bpp.factories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.bpp.Learner;
import com.bpp.interfaces.IdentityLike;
import org.junit.jupiter.api.Test;

class LearnerFactoryTest {
	String email = "abrockwell@my.bpp.com";
	String firstName = "Alice";
	String lastName = "Brockwell";
	String username = "abrockwell";

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
	void testCreateLearnerWithFirstNameAndLastName() {
		Learner learner = LearnerFactory.createLearner(firstName, lastName);

		assertEquals(email, learner.email());
		assertEquals(firstName, learner.firstName());
		assertEquals(lastName, learner.lastName());
		assertEquals(username, learner.username());
	}

	@Test
	void testCreateLearnerWithIdentityLike() {
		Learner learner = LearnerFactory.createLearner(identityLike);

		assertEquals(email, learner.email());
		assertEquals(firstName, learner.firstName());
		assertEquals(lastName, learner.lastName());
		assertEquals(username, learner.username());
	}
}
