package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AccountConfigurationTest {
	@Test
	void testDefaultDomainName() {
		assertEquals("my.bpp.com", AccountConfiguration.DEFAULT_DOMAIN_NAME);
	}
}
