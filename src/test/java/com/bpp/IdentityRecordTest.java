package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.bpp.records.IdentityRecord;

class IdentityRecordTest {
	@Test
	void testConstructorWithValidArguments() {
		String firstName = "Alice";
		String lastName = "Brockwell";

		IdentityRecord identityRecord = new IdentityRecord(firstName, lastName);

		assertEquals(firstName, identityRecord.firstName());
		assertEquals(lastName, identityRecord.lastName());
	}

	@Test
	void testConstructorWithNullFirstName() {
		String lastName = "Brockwell";

		assertThrows(NullPointerException.class, () -> {
			new IdentityRecord(null, lastName);
		});
	}

	@Test
	void testConstructorWithNullLastName() {
		String firstName = "Alice";

		assertThrows(NullPointerException.class, () -> {
			new IdentityRecord(firstName, null);
		});
	}
}
