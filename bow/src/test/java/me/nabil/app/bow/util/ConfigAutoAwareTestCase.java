package me.nabil.app.bow.util;

import junit.framework.Assert;
import me.nabil.app.bow.config.SystemConfig;

import org.junit.Before;
import org.junit.Test;

public class ConfigAutoAwareTestCase {
	
	private SystemConfig systemConfig;
	
	@Before
	public void setUp(){
		systemConfig = SystemConfig.getInstance();
	}

	@Test
	public void testAutoAware() {
		try {
			ConfigAutoAware.autoAware("system.properties", systemConfig);
			Assert.assertEquals("http://localhost:8080/bow/", systemConfig.BASE_HOME);
		} catch (Exception e) {
		}
	}

}
