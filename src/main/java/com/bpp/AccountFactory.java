package com.bpp;

/**
 * The AccountFactory class provides static methods for creating Account objects.
 */
public class AccountFactory {
	private AccountFactory() {}

	/**
	 * Creates an Account object with the specified email and username.
	 * 
	 * @param email the email address of the account
	 * @param username the username of the account
	 * @return the created Account object
	 * @throws IllegalArgumentException if the email or username is invalid
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
	 * Creates an Account object with the specified username and a default email generated based on
	 * the username.
	 * 
	 * @param username the username of the account
	 * @return the created Account object
	 * @throws IllegalArgumentException if the username is invalid
	 */
	public static Account createAccount(String username) {
		return createAccount(AccountUtilities.generateDefaultEmail(username), username);
	}

	/**
	 * Creates an Account object based on the provided AccountLike object.
	 * 
	 * @param account the AccountLike object containing the email and username
	 * @return the created Account object
	 */
	public static Account createAccount(AccountLike account) {
		String email = account.email();
		String username = account.username();

		return createAccount(email, username);
	}

	/**
	 * Creates an Account object with a default username generated based on the provided
	 * IdentityLike object.
	 * 
	 * @param identity the IdentityLike object containing the identity information
	 * @return the created Account object
	 */
	public static Account createAccount(IdentityLike identity) {
		String username = AccountUtilities.generateDefaultUsername(identity);

		return createAccount(username);
	}

}
