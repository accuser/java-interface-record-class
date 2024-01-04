package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccountLikeTest {
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
	void testEmail() {
		assertEquals("alice@bpp.com", account.email());
	}

	@Test
	void testUsername() {
		assertEquals("alice", account.username());
	}
}
