package com.bpp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountConfigurationTest {

	@Test
	void testDefaultDomainName() {
		assertEquals("my.bpp.com", AccountConfiguration.DEFAULT_DOMAIN_NAME);
	}
}
