package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import com.bpp.interfaces.AccountLike;
import com.bpp.interfaces.IdentityLike;
import com.bpp.records.AccountRecord;

class AccountTest {
	String email = "abrockwell@my.bpp.com";
	String firstName = "Alice";
	String lastName = "Brockwell";
	String username = "abrockwell";

	AccountLike accountLike = new AccountLike() {
		@Override
		public String email() {
			return email;
		}

		@Override
		public String username() {
			return username;
		}
	};

	IdentityLike identityLike = new IdentityLike() {
		@Override
		public String firstName() {
			return firstName;
		}

		@Override
		public String lastName() {
			return lastName;
		}
	};

	@Test
	void testConstructWithEmailAndUsername() {
		Account account = new Account(email, username);

		assertNotNull(account);
		assertEquals(email, account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testConstructWithUsername() {
		Account account = new Account(username);

		assertNotNull(account);
		assertEquals(email, account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testFromAccountLike() {
		Account account = Account.from(accountLike);

		assertNotNull(account);
		assertEquals(username, account.username());
		assertEquals(email, account.email());
	}

	@Test
	void testFromIdentityLike() {
		Account account = Account.from(identityLike);

		assertNotNull(account);
		assertEquals(username, account.username());
		assertEquals(email, account.email());
	}

	@Test
	void testEmail() {
		Account account = new Account(email, username);

		assertEquals(email, account.email());
	}

	@Test
	void testUsername() {
		Account account = new Account(email, username);

		assertEquals(username, account.username());
	}
}
