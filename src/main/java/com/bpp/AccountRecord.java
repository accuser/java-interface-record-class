package com.bpp;

import java.util.Objects;

/**
 * Represents an account record with a username and an optional email.
 * 
 * @see {@link AccountLike}
 */
public record AccountRecord(String email, String username) implements AccountLike {
    /**
     * Constructs an AccountRecord object with the specified username.
     * The email is set to empty.
     *
     * @param username the username of the account
     */
    public AccountRecord {
        Objects.requireNonNull(email);
        Objects.requireNonNull(username);
    }
}