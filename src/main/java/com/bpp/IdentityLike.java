package com.bpp;

/**
 * This interface represents an identity-like object.
 */
public interface IdentityLike {
    /**
     * Retrieves the first name associated with the identity.
     *
     * @return the first name.
     */
    String firstName();

    /**
     * Retrieves the last name associated with the identity.
     *
     * @return the last name.
     */
    String lastName();
}