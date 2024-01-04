package com.bpp;

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
	public Identity(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Creates an identity with the given first name and last name.
	 * 
	 * @param firstName The first name of the identity.
	 * @param lastName The last name of the identity.
	 * @return An identity with the given first name and last name.
	 */
	public static Identity from(IdentityLike identityLike) {
		return new Identity(identityLike.firstName(), identityLike.lastName());
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
