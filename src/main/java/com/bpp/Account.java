package com.bpp;

import com.bpp.interfaces.AccountLike;
import com.bpp.interfaces.IdentityLike;
import com.bpp.utilities.AccountUtilities;
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
	 * Constructs an {@link Account} object with the specified email and username fields.
	 * 
	 * @param email the email address of the account
	 * @param username the username of the account
	 * @return the constructed {@link Account} object
	 * @throws IllegalArgumentException if the email or username fields are invalid
	 */
	public Account(String email, String username) {
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
	 * Constructs an {@link Account} object with the specified username field, generating the email
	 * fields based on the username.
	 * 
	 * @param username the username of the account
	 * @return the created {@link Account} object
	 * @throws IllegalArgumentException if the username is invalid
	 */
	public Account(String username) {
		this(AccountUtilities.generateDefaultEmail(username), username);
	}

	/**
	 * Creates an {@link Account} object based on the source {@link AccountLike} object.
	 * 
	 * @param source the source {@link AccountLike} object
	 * @return the created {@link Account} object
	 */
	public static Account from(AccountLike source) {
		String email = source.email();
		String username = source.username();

		return new Account(email, username);
	}

	/**
	 * Creates an {@link Account} object with a username generated from source {@link IdentityLike}
	 * object.
	 * 
	 * @param source the source {@link IdentityLike} object
	 * @return the created {@link Account} object
	 */
	public static Account from(IdentityLike source) {
		String username = AccountUtilities.generateDefaultUsername(source);

		return new Account(username);
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
