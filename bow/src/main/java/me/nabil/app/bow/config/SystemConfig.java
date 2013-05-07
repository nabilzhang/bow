package me.nabil.app.bow.config;

import me.nabil.app.bow.util.Config;
import me.nabil.app.bow.util.ConfigAutoAware;

public class SystemConfig {
	private static SystemConfig INSTANCE = new SystemConfig();

	public static SystemConfig getInstance() {
		try {
			ConfigAutoAware.autoAware("system.properties",
					INSTANCE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}

	private SystemConfig() {
		
	}

	@Config(name = "bow.host", defaultValue = "")
	public String BASE_HOME;
}
