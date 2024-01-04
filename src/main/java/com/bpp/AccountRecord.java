package com.bpp;

import java.util.Objects;

/**
 * Represents an account record with an email and username.
 * 
 * @see {@link AccountLike}
 */
public record AccountRecord(String email, String username) implements AccountLike {
    /**
     * Constructs an AccountRecord object with the specified username and email
     *
     * @param email    the email of the account
     * @param username the username of the account
     */
    public AccountRecord {
        Objects.requireNonNull(email);
        Objects.requireNonNull(username);
    }
}