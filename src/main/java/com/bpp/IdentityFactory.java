package com.bpp;

/**
 * The IdentityFactory class provides methods for creating Identity objects.
 */
public class IdentityFactory {
	private IdentityFactory() {}

	/**
	 * Creates an Identity object with the specified first name and last name.
	 *
	 * @param firstName the first name of the identity
	 * @param lastName the last name of the identity
	 * @return the created Identity object
	 * @throws IllegalArgumentException if the first name or last name format is invalid
	 */
	public static Identity createIdentity(String firstName, String lastName) {
		if (!IdentityValidation.isValidFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name format");
		}

		if (!IdentityValidation.isValidLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name format");
		}

		return new Identity(firstName, lastName);
	}

	/**
	 * Creates an Identity object based on the provided IdentityLike object.
	 *
	 * @param identity the IdentityLike object containing the first name and last name
	 * @return the created Identity object
	 */
	public static Identity createAccount(IdentityLike identity) {
		String firstName = identity.firstName();
		String lastName = identity.lastName();

		return createIdentity(firstName, lastName);
	}
}
