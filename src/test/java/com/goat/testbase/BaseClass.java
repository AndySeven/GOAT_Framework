package com.goat.testbase;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.goat.utils.ConfReader;
import com.goat.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = null;

	/**
	 * Method sets up the and lunches the browser
	 * 
	 * @return driver of type WebDriver
	 */
	public static WebDriver setUp() {
		ConfReader.readConfigurationFile(Constants.CONFIGS_FILEPATH);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");

		switch (ConfReader.getProperty("browser")) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOpt = new ChromeOptions();
			chromeOpt.addArguments("--start-fullscreen");
			//chromeOpt.addArguments("--kiosk");
			driver = new ChromeDriver(chromeOpt);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOpt = new FirefoxOptions();
			firefoxOpt.addArguments("start-maximized");
			driver = new FirefoxDriver(firefoxOpt);
			break;

		default:

			throw new NoSuchElementException("This Browser is NOT suported");

		}

		PageInitializer.init();
		driver.get(ConfReader.getProperty("url"));
		return driver;

	}

	/**
	 * Method closes all web browser windows and terminates WebDriver session
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
