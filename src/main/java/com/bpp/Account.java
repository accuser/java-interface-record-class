package com.bpp;

import com.bpp.interfaces.AccountLike;
import com.bpp.validation.AccountValidation;

/**
 * Represents an account in the system. An account has an email and a username.
 */
public class Account implements AccountLike {
	/**
	 * The email address associated with the account.
	 */
	private String email;

	/**
	 * The username associate with the account.
	 */
	private String username;

	/**
	 * Constructs an {@link Account} object with the given email and username.
	 *
	 * @param email the email of the account
	 * @param username the username of the account
	 */
	private Account(String email, String username) {
		if (!AccountValidation.isValidEmail(email)) {
			throw new IllegalArgumentException("Invalid email format");
		}

		if (!AccountValidation.isValidUsername(username)) {
			throw new IllegalArgumentException("Invalid username format");
		}

		this.email = email;
		this.username = username;
	}

	/**
	 * Creates an {@link Account} object from the given {@link AccountLike} object.
	 *
	 * @param accountLike the AccountLike to create the Account from
	 * @return the created Account object
	 */
	public static Account from(AccountLike account) {
		String email = account.email();
		String username = account.username();

		return new Account(email, username);
	}


	/**
	 * Returns the optional email of the account.
	 *
	 * @return the optional email of the account
	 */
	public String email() {
		return email;
	}

	/**
	 * Returns the username of the account.
	 *
	 * @return the username of the account
	 */
	public String username() {
		return username;
	}
}
