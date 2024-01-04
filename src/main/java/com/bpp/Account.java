package com.bpp;

/**
 * Represents an account in the system. An account has an email and a username.
 */
public class Account implements AccountLike {
    private static final String defaultDomainName = "my.bpp.com";

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
        this(defaultEmail(username), username);
    }

    /**
     * Creates an {@link Account} object from the given {@link AccountLike} object.
     *
     * @param accountLike the AccountLike to create the Account from
     * @return the created Account object
     */
    public static Account from(AccountLike account) {
        return new Account(account.email(), account.username());
    }

    public static Account from(IdentityLike identityLike) {
        String username = String.format("%1.1s%s", identityLike.firstName(), identityLike.lastName()).toLowerCase();

        return new Account(username);
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

    /**
     * Returns the default email of the account for the given username.
     *
     * @param username the username of the account
     * @return the default email of the account
     */
    private static String defaultEmail(String username) {
        return String.format("%s@%s", username, defaultDomainName);
    }
}