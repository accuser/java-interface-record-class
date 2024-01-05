package com.bpp.validation;

/**
 * The IdentityValidation class provides methods for validating first names and last names.
 */
public class IdentityValidation {
	private static final String FIRST_NAME_REGEX = "^[A-Z][A-Za-z]*$";
	private static final String LAST_NAME_REGEX = "^[A-Z][A-Za-z]*$";

	private IdentityValidation() {}

	/**
	 * Checks if the given first name is valid.
	 *
	 * @param firstName the first name to be validated
	 * @return true if the first name is valid, false otherwise
	 */
	public static boolean isValidFirstName(String firstName) {
		return firstName.matches(FIRST_NAME_REGEX);
	}

	/**
	 * Checks if the given last name is valid.
	 *
	 * @param lastName the last name to be validated
	 * @return true if the last name is valid, false otherwise
	 */
	public static boolean isValidLastName(String lastName) {
		return lastName.matches(LAST_NAME_REGEX);
	}
}
