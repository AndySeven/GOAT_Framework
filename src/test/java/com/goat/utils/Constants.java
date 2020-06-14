package com.goat.utils;

public class Constants {
	// obtaining environmental value
	public static String systemPath = System.getProperty("user.dir");
	public static final String CONFIGS_FILEPATH = systemPath+"/src/test/resources/configs/configuration.properties";
	public static final int IMPLICIT_WAIT = 15;
	public static final int EXPLICIT_WAIT = 10;
	public static final String TESTDATA_FILEPATH = System.getProperty("user.dir")+"/src/test/resources/testdata/data.xlsx";
	public static final String REPORT_FILEPATH = System.getProperty("user.dir")+"/target/html-report/HRMS.html";
	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/";
	
}
