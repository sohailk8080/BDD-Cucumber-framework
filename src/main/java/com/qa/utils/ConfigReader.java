package com.qa.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	private String path;

	// This method is used to load properties from config.properties

	public Properties init_prop() {
		prop = new Properties();
		path = "src\\test\\resources\\Config\\config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
