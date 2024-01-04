package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IdentityRecordTest {

	@Test
	public void testConstructorWithValidArguments() {
		String firstName = "Alice";
		String lastName = "Brockwell";

		IdentityRecord identityRecord = new IdentityRecord(firstName, lastName);

		assertEquals(firstName, identityRecord.firstName());
		assertEquals(lastName, identityRecord.lastName());
	}

	@Test
	public void testConstructorWithNullFirstName() {
		String lastName = "Brockwell";

		assertThrows(NullPointerException.class, () -> {
			new IdentityRecord(null, lastName);
		});
	}

	@Test
	public void testConstructorWithNullLastName() {
		String firstName = "Alice";

		assertThrows(NullPointerException.class, () -> {
			new IdentityRecord(firstName, null);
		});
	}
}