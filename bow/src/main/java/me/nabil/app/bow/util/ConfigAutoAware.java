package me.nabil.app.bow.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConfigAutoAware {
	protected final static Log logger = LogFactory
			.getLog(ConfigAutoAware.class);
	private static Properties properties = null;

	public static void autoAware(String filename, Object object) throws Exception {
		InputStream in = ConfigAutoAware.class.getClassLoader()
				.getResourceAsStream(filename);
		properties = new Properties();
		try {
			properties.load(in);
			in.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())
					&& Modifier.isPublic(field.getModifiers())) {
				Config annotation = field.getAnnotation(Config.class);
				field.setAccessible(true);
				String value = annotation.defaultValue();
				if(properties.getProperty(annotation.name()) != null){
					value = properties.getProperty(annotation.name());
				}
				logger.info(value);
				if(field.getType()==int.class){
					field.setInt(object, Integer.valueOf(value));
				} else if(field.getType() == long.class){
					field.setLong(object, Long.valueOf(value));
				} else if (field.getType() == String.class){
					field.set(object, value);
				}
			}

		}
	}
}
