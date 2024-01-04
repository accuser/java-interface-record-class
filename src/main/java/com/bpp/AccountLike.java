package com.bpp;

/**
 * This interface represents an account-like object.
 */
public interface AccountLike {
    /**
     * Retrieves the email associated with the account.
     *
     * @return the email.
     */
    String email();

    /**
     * Retrieves the username associated with the account.
     *
     * @return the username.
     */
    String username();
}
