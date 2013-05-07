package me.nabil.app.bow.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;

public class BaseController {
	private Logger logger = null;

	protected Logger getLogger() {
		if (null == logger) {
			logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		}
		return logger;
	}

	protected Map<String, Object> map = new HashMap<String, Object>();
}
