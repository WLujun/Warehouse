package com.dxd.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParameterUtil {


	public static String getParameterValue(String key) {
		InputStream in = ParameterUtil.class.getClassLoader()
				.getResourceAsStream("config/parameter.properties");
		Properties pop = new Properties();
		try {
			pop.load(in);
			String value = pop.getProperty(key);
			return value;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
