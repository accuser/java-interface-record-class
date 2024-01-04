package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AccountTest {

	@Test
	public void testFromAccountLikeWithEmail() {
		String username = "alice";
		String email = "alice@bpp.com";
		AccountLike accountLike = new AccountRecord(email, username);

		Account account = Account.from(accountLike);

		assertNotNull(account);
		assertEquals(username, account.username());
		assertEquals(email, account.email());
	}
}