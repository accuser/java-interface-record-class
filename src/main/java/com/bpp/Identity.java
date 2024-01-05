package com.bpp;

import com.bpp.interfaces.IdentityLike;

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
	 * Creates an identity with the given first name and last name.
	 * 
	 * @param firstName The first name of the identity.
	 * @param lastName The last name of the identity.
	 * @return An identity with the given first name and last name.
	 */
	private Identity(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Creates an identity from the given identity-like object.
	 * 
	 * @param identity The identity-like object to create an identity from.
	 * @return An identity with the same fields as the given identity-like object.
	 */
	public static Identity from(IdentityLike identity) {
		return new Identity(identity.firstName(), identity.lastName());
	}

	/**
	 * Returns the first name of the identity.
	 * 
	 * @return The first name of the identity.
	 */
	public String firstName() {
		return firstName;
	}

	/**
	 * Returns the last name of the identity.
	 * 
	 * @return The last name of the identity.
	 */
	public String lastName() {
		return lastName;
	}
}
