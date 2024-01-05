package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.bpp.factories.AccountFactory;
import com.bpp.interfaces.AccountLike;
import com.bpp.interfaces.IdentityLike;
import com.bpp.utilities.AccountUtilities;

class AccountFactoryTest {
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
	void testCreateAccount_ValidEmailAndUsername_ReturnsAccount() {
		Account account = AccountFactory.createAccount(email, username);

		assertEquals(email, account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testCreateAccount_InvalidEmail_ThrowsIllegalArgumentException() {
		String email = "invalid_email";

		assertThrows(IllegalArgumentException.class, () -> {
			AccountFactory.createAccount(email, username);
		});
	}

	@Test
	void testCreateAccount_InvalidUsername_ThrowsIllegalArgumentException() {
		String username = "invalid_username!";

		assertThrows(IllegalArgumentException.class, () -> {
			AccountFactory.createAccount(email, username);
		});
	}

	@Test
	void testCreateAccount_UsernameOnly_ReturnsAccountWithDefaultEmail() {
		String username = "alice123";

		Account account = AccountFactory.createAccount(username);

		assertEquals(AccountUtilities.generateDefaultEmail(username), account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testCreateAccount_AccountLikeObject_ReturnsAccount() {
		Account account = AccountFactory.createAccount(accountLike);

		assertEquals(email, account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testCreateAccount_IdentityLikeObject_ReturnsAccountWithDefaultUsername() {
		Account account = AccountFactory.createAccount(identityLike);

		assertEquals(username, account.username());
	}

}
