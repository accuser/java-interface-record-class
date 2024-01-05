package com.bpp;

import com.bpp.interfaces.IdentityLike;
import com.bpp.validation.IdentityValidation;

/**
 * Represents an identity in the system. An identity has a first name and a last name.
 */
public class Identity implements IdentityLike {
	/**
	 * The first name associated with this identity.
	 */
	private String firstName;

	/**
	 * The last name associated with this identity.
	 */
	private String lastName;

	/**
	 * Constructs an {@link Identity} with the specified first name and last name fields.
	 * 
	 * @param firstName the first name of the identity
	 * @param lastName the last name of the identity
	 * @return the constructed {@link Identity} object
	 * @throws IllegalArgumentException if the first name or last name fields are invalid
	 */
	public Identity(String firstName, String lastName) {
		if (!IdentityValidation.isValidFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name format");
		}

		if (!IdentityValidation.isValidLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name format");
		}

		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Creates an {@link Identity} object based on the source {@link IdentityLike} object.
	 * 
	 * @param identity the source {@link IdentityLike} object
	 * @return the created {@link Identity} object
	 */
	public static Identity from(IdentityLike identity) {
		String firstName = identity.firstName();
		String lastName = identity.lastName();

		return new Identity(firstName, lastName);
	}

	/**
	 * Returns the first name of the identity.
	 * 
	 * @return the first name of the identity
	 */
	public String firstName() {
		return firstName;
	}

	/**
	 * Returns the last name of the identity.
	 * 
	 * @return the last name of the identity
	 */
	public String lastName() {
		return lastName;
	}
}
