package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountLikeTest {
    AccountLike account = new AccountLike() {
        @Override
        public String email() {
            return "alice@bpp.com";
        }

        @Override
        public String username() {
            return "alice";
        }
    };

    @Test
    public void testEmail() {
        assertEquals("alice@bpp.com", account.email());
    }

    @Test
    public void testUsername() {
        assertEquals("alice", account.username());
    }
}