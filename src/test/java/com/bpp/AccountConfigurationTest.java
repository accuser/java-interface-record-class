package com.bpp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountConfigurationTest {

	@Test
	public void testDefaultDomainName() {
		assertEquals("my.bpp.com", AccountConfiguration.DEFAULT_DOMAIN_NAME);
	}
}