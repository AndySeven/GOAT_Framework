package com.goat.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfReader {
	public static FileInputStream fis;
	public static Properties prop;

	/**
	 * Method read *.properties file
	 * 
	 * @param filePath
	 */
	public static void readConfigurationFile(String filePath) {

		try {
			// Obtains input bytes from a file 
			fis = new FileInputStream(filePath);
			// Subclass of HashTable maintains *.properties file (keys value pairs String type both)
			prop = new Properties();
			// Reads property list from input byte stream
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Method gets value of corresponding key(property)
	 * @param key
	 * @return property String value 
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
