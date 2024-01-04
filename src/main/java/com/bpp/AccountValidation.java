package com.bpp;

/**
 * The AccountValidation class provides methods for validating email addresses
 * and usernames.
 */
public class AccountValidation {
	/**
	 * Regular expression pattern for validating email addresses.
	 */
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	/**
	 * Regular expression pattern for validating usernames.
	 * The username must start with a letter, followed by letters or digits.
	 */
	private static final String USERNAME_REGEX = "^[A-Za-z][A-Za-z0-9]+$";

	private AccountValidation() {
	}

	/**
	 * Checks if the given email address is valid.
	 *
	 * @param email the email address to be validated
	 * @return true if the email address is valid, false otherwise
	 */
	public static boolean isValidEmail(String email) {
		return email.matches(EMAIL_REGEX);
	}

	/**
	 * Checks if the given username is valid.
	 *
	 * @param username the username to be validated
	 * @return true if the username is valid, false otherwise
	 */
	public static boolean isValidUsername(String username) {
		return username.matches(USERNAME_REGEX);
	}
}
