package com.bpp.factories;

import com.bpp.Account;
import com.bpp.interfaces.AccountLike;
import com.bpp.interfaces.IdentityLike;
import com.bpp.utilities.AccountUtilities;
import com.bpp.validation.AccountValidation;

/**
 * The {@link AccountFactory} class provides static methods for creating {@link Account} objects.
 */
public class AccountFactory {
	private AccountFactory() {}

	/**
	 * Creates an {@link Account} object with the specified email and username fields.
	 * 
	 * @param email the email address of the account
	 * @param username the username of the account
	 * @return the created {@link Account} object
	 * @throws IllegalArgumentException if the email or username fields are invalid
	 */
	public static Account createAccount(String email, String username) {
		if (!AccountValidation.isValidEmail(email)) {
			throw new IllegalArgumentException("Invalid email format");
		}

		if (!AccountValidation.isValidUsername(username)) {
			throw new IllegalArgumentException("Invalid username format");
		}

		return new Account(email, username);
	}

	/**
	 * Creates an {@link Account} object with the specified username field, generating the email
	 * fields based on the username.
	 * 
	 * @param username the username of the account
	 * @return the created {@link Account} object
	 * @throws IllegalArgumentException if the username is invalid
	 */
	public static Account createAccount(String username) {
		return createAccount(AccountUtilities.generateDefaultEmail(username), username);
	}

	/**
	 * Creates an {@link Account} object based on the source {@link AccountLike} object.
	 * 
	 * @param source the source {@link AccountLike} object
	 * @return the created {@link Account} object
	 */
	public static Account createAccount(AccountLike source) {
		return Account.from(source);
	}

	/**
	 * Creates an {@link Account} object with a username generated from source {@link IdentityLike}
	 * object.
	 * 
	 * @param source the source {@link IdentityLike} object
	 * @return the created {@link Account} object
	 */
	public static Account createAccount(IdentityLike source) {
		String username = AccountUtilities.generateDefaultUsername(source);

		return createAccount(username);
	}
}
