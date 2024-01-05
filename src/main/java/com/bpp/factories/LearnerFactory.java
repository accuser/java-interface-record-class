package com.bpp.factories;

import com.bpp.Account;
import com.bpp.Identity;
import com.bpp.Learner;
import com.bpp.interfaces.IdentityLike;

/**
 * The LearnerFactory class provides methods for creating instances of the Learner class.
 */
public class LearnerFactory {
	private LearnerFactory() {}

	/**
	 * Creates a Learner object using the provided first name and last name.
	 *
	 * @param firstName the first name of the learner
	 * @param lastName the last name of the learner
	 * @return a new Learner object
	 */
	public static Learner createLearner(String firstName, String lastName) {
		Identity identity = IdentityFactory.createIdentity(firstName, lastName);

		return createLearner(identity);
	}

	/**
	 * Creates a Learner object using the provided IdentityLike object.
	 *
	 * @param identityLike an object that represents the identity of the learner
	 * @return a new Learner object
	 */
	public static Learner createLearner(IdentityLike identityLike) {
		Account account = AccountFactory.createAccount(identityLike);
		Identity identity = IdentityFactory.createIdentity(identityLike);

		return new Learner(account, identity);
	}
}
