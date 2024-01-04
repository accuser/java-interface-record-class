package com.bpp;

/**
 * The {@link AccountUtilities} class provides utility methods for generating
 * default email and username for accounts.
 */
public class AccountUtilities {
    private AccountUtilities() {
    }

    /**
     * Generates a default email address for a given username.
     *
     * @param username the username to generate the email address for
     * @return the generated default email address
     */
    public static String generateDefaultEmail(String username) {
        return String.format("%s@%s", username, AccountConfiguration.DEFAULT_DOMAIN_NAME);
    }

    /**
     * Generates a default email address based on the given identity.
     *
     * @param identity the identity used to generate the email address
     * @return the generated default email address
     */
    public static String generateDefaultEmail(IdentityLike identity) {
        String username = generateDefaultUsername(identity);

        return generateDefaultEmail(username);
    }

    /**
     * Generates a default username based on the provided identity.
     *
     * @param identity the identity object containing the first name and last name
     * @return the generated default username
     */
    public static String generateDefaultUsername(IdentityLike identity) {
        return String.format("%1.1s%s", identity.firstName(), identity.lastName()).toLowerCase();
    }
}
