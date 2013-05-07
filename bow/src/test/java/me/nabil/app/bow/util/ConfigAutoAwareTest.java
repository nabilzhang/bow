package me.nabil.app.bow.util;

import me.nabil.app.bow.config.SystemConfig;

import org.junit.Test;

public class ConfigAutoAwareTest {

	@Test
	public void testAutoAware() {
		try {
			ConfigAutoAware.autoAware("system.properties", SystemConfig.getInstance());
		} catch (Exception e) {
		}
	}

}
