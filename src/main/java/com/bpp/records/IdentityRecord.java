package com.bpp.records;

import java.util.Objects;
import com.bpp.interfaces.IdentityLike;

/**
 * Represents an identity record with a first name and last name. Implements the IdentityLike
 * interface.
 */
public record IdentityRecord(String firstName, String lastName) implements IdentityLike {
	/**
	 * Constructs an IdentityRecord object with the specified first name and last name.
	 *
	 * @param firstName the first name of the identity
	 * @param lastName the last name of the identity
	 */
	public IdentityRecord {
		Objects.requireNonNull(firstName);
		Objects.requireNonNull(lastName);
	}
}
