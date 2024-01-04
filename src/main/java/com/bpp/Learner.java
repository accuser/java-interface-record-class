package com.bpp;

/**
 * This class represents a learner.
 */
public class Learner implements AccountLike, IdentityLike {
    /**
     * The account associated with this learner.
     */
    private Account account;

    /**
     * The identity associated with this learner.
     */
    private Identity identity;

    /**
     * Creates a learner with the given identity.
     *
     * @param identity the identity of the learner
     */
    public Learner(Identity identity) {
        this.account = Account.from(identity);
        this.identity = identity;
    }

    /**
     * The first name associated with this learner.
     */
    @Override
    public String firstName() {
        return identity.firstName();
    }

    /**
     * The last name associated with this learner.
     */
    @Override
    public String lastName() {
        return identity.lastName();
    }

    /**
     * The email associated with this learner.
     */
    @Override
    public String email() {
        return account.email();
    }

    /**
     * The username associated with this learner.
     */
    @Override
    public String username() {
        return account.username();
    }
}
