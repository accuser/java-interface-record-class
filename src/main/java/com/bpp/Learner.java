package com.bpp;

import com.bpp.interfaces.LearnerLike;

/**
 * This class represents a learner.
 */
public class Learner implements LearnerLike {
	/**
	 * The account associated with this learner.
	 */
	private Account account;

	/**
	 * The identity associated with this learner.
	 */
	private Identity identity;

	/**
	 * Creates a learner with the given identity.
	 *
	 * @param account the account of the learner
	 * @param identity the identity of the learner
	 */
	public Learner(Account account, Identity identity) {
		this.account = account;
		this.identity = identity;
	}


	/**
	 * The first name associated with this learner.
	 */
	@Override
	public String firstName() {
		return identity.firstName();
	}

	/**
	 * The last name associated with this learner.
	 */
	@Override
	public String lastName() {
		return identity.lastName();
	}

	/**
	 * The email associated with this learner.
	 */
	@Override
	public String email() {
		return account.email();
	}

	/**
	 * The username associated with this learner.
	 */
	@Override
	public String username() {
		return account.username();
	}
}
