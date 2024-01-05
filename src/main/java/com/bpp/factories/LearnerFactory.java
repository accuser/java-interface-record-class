package com.bpp.factories;

import com.bpp.Account;
import com.bpp.Identity;
import com.bpp.Learner;
import com.bpp.interfaces.IdentityLike;

public class LearnerFactory {
	private LearnerFactory() {}

	public static Learner createLearner(String firstName, String lastName) {
		Identity identity = IdentityFactory.createIdentity(firstName, lastName);

		return createLearner(identity);
	}

	public static Learner createLearner(IdentityLike identityLike) {
		Account account = AccountFactory.createAccount(identityLike);
		Identity identity = IdentityFactory.createIdentity(identityLike);

		return new Learner(account, identity);
	}
}
