package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.bpp.records.AccountRecord;

class AccountRecordTest {
	@Test
	void testConstructor() {
		String email = "alice@bpp.com";
		String username = "alice";

		AccountRecord account = new AccountRecord(email, username);

		assertNotNull(account);
		assertEquals(email, account.email());
		assertEquals(username, account.username());
	}

	@Test
	void testConstructorWithNullUsername() {
		String email = "alice@bpp.com";

		assertThrows(NullPointerException.class, () -> new AccountRecord(email, null));
	}

	@Test
	void testConstructorWithNullEmail() {
		String username = "alice";

		assertThrows(NullPointerException.class, () -> new AccountRecord(null, username));
	}
}
