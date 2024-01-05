package com.bpp.factories;

import com.bpp.Identity;
import com.bpp.interfaces.IdentityLike;
import com.bpp.validation.IdentityValidation;

/**
 * The {@link IdentityFactory} class provides static methods for creating {@link Identity} objects.
 */
public class IdentityFactory {
	private IdentityFactory() {}

	/**
	 * Creates an {@link Identity} object with the specified first name and last name fields.
	 *
	 * @param firstName the first name of the identity
	 * @param lastName the last name of the identity
	 * @return the created {@link Identity} object
	 * @throws IllegalArgumentException if the first name or last name fields are invalid
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
	 * Creates an {@link Identity} object based on the source {@link IdentityLike} object.
	 *
	 * @param source the source {@link IdentityLike} object containing
	 * @return the created {@link Identity} object
	 */
	public static Identity createIdentity(IdentityLike source) {
		return Identity.from(source);
	}
}
