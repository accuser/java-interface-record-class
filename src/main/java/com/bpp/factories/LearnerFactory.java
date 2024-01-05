package com.bpp.factories;

import com.bpp.Account;
import com.bpp.Identity;
import com.bpp.Learner;
import com.bpp.interfaces.IdentityLike;

/**
 * The {@link LearnerFactory} class provides methods for creating instances of the {@link Learner}
 * class.
 */
public class LearnerFactory {
	private LearnerFactory() {}

	/**
	 * Creates a {@link Learner} object using the provided first name and last name.
	 *
	 * @param firstName the first name of the learner
	 * @param lastName the last name of the learner
	 * @return a new {@link Learner} object
	 */
	public static Learner createLearner(String firstName, String lastName) {
		Identity identity = IdentityFactory.createIdentity(firstName, lastName);

		return createLearner(identity);
	}

	/**
	 * Creates a {@link Learner} object using the source {@link IdentityLike} object.
	 *
	 * @param source the source {@link IdentityLike} object
	 * @return a new {@link Learner} object
	 */
	public static Learner createLearner(IdentityLike source) {
		Account account = AccountFactory.createAccount(source);
		Identity identity = IdentityFactory.createIdentity(source);

		return new Learner(account, identity);
	}
}
