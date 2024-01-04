package com.bpp;

/**
 * Represents an account in the system. An account has an email and a username.
 */
public class Account implements AccountLike {
    /**
     * The email address associated with the account.
     */
    private String email;

    /**
     * The username associate with the account.
     */
    private String username;

    /**
     * Constructs an {@link Account} object with the given email and username.
     *
     * @param email    the email of the account
     * @param username the username of the account
     */
    public Account(String email, String username) {
        if (AccountValidation.isValidEmail(email) == false) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (AccountValidation.isValidUsername(username) == false) {
            throw new IllegalArgumentException("Invalid username format");
        }

        this.email = email;
        this.username = username;
    }

    /**
     * Constructs an {@link Account} object with the given username.
     * The email is set to the default email.
     *
     * @param username the username of the account
     */
    public Account(String username) {
        this(AccountUtilities.generateDefaultEmail(username), username);
    }

    /**
     * Creates an {@link Account} object from the given {@link AccountLike} object.
     *
     * @param accountLike the AccountLike to create the Account from
     * @return the created Account object
     */
    public static Account from(AccountLike account) {
        String email = account.email();
        String username = account.username();

        return new Account(email, username);
    }

    /**
     * Creates an {@link Account} object from the given {@link IdentityLike} object.
     *
     * @param identity the IdentityLike to create the Account from
     * @return the created Account object
     */
    public static Account from(IdentityLike identity) {
        String email = AccountUtilities.generateDefaultEmail(identity);
        String username = AccountUtilities.generateDefaultUsername(identity);

        return new Account(email, username);
    }

    /**
     * Returns the optional email of the account.
     *
     * @return the optional email of the account
     */
    public String email() {
        return email;
    }

    /**
     * Returns the username of the account.
     *
     * @return the username of the account
     */
    public String username() {
        return username;
    }
}