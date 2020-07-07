package com.goat.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goat.testbase.PageInitializer;

public class Functions extends PageInitializer {

//---------------------------------------------------------------------------------------

	public static WebDriverWait getWaitObj() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
		return wait;
	}

	public static WebElement waitForClickability(WebElement element) {
		return getWaitObj().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObj().until(ExpectedConditions.visibilityOf(element));
	}

	public static List<WebElement> waitForVisibility(List<WebElement> elements) {
		return getWaitObj().until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//---------------------------------------------------------------------------------------

	public static void sendText(WebElement element, String text) {
		waitForVisibility(element).clear();
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		waitForClickability(element).click();
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", waitForClickability(element));
	}

//---------------------------------------------------------------------------------------	

	public static Actions getActionsObj() {
		Actions action = new Actions(driver);
		return action;
	}

	public static void mouseHover(WebElement element) {
		getActionsObj().moveToElement(element).perform();
	}

	public static boolean isElementPresent(By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * 
	 * @param locator
	 * @return
	 */
	public static boolean isElementVisible(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	/**
	 * 
	 * @param listRows
	 * @param text
	 * @return
	 */
	public static boolean presentedInTable(List<WebElement> listRows, String text) {

		for (int i = 0; i < waitForVisibility(listRows).size(); i++) {
			String row = listRows.get(i).getText();
			if (row.contains(text)) {
				return true;
			}
		}
		return false;
	}

//---------------------------------------------------------------------------------------	

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static byte[] takeScreenshotBytes(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File shot = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(shot, new File(destinationFile));
		} catch (IOException e) {
			System.out.println("Cannot Take Screenshot");
			e.printStackTrace();
		}
		return picBytes;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String takeScreenShot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String destFile = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return destFile;

	}

	/**
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}

	public static void uploadFile(WebElement element, String path) {
		sendText(element, path);
	}

//---------------------------------------------------------------------------------------

	public static void selectOptionDDbyValue(WebElement element, String text) {
		try {
			Select select = new Select(element);
			List<WebElement> list = select.getOptions();
			for (WebElement el : list) {
				String opt = el.getText().trim();
				String optToSelect = text.trim();

				if (el.isEnabled() && opt.equalsIgnoreCase(optToSelect)) {
					select.selectByVisibleText(optToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

//---------------------------------------------------------------------------------------
	
	public String readPDFContent(String appUrl) throws Exception {
		// get the URL object using actual String URL 
		URL url = new URL(appUrl);
		
		// using reference variable URL type call the method openStream()
		// returned result we store in InputStream type ref var
		InputStream input = url.openStream();
		
		// Use this var as parameter to BufferedInputStream constructor, getting its object
		BufferedInputStream fileToParse = new BufferedInputStream(input);

		
		PDDocument document = null;
		String output = null;
		
		try {
			
			// getting pdf file using static method load and pass as parameter BufferedInputStream object
			// and store it in PDDocument typr variable 
			document = PDDocument.load(fileToParse);
			
			// getting text from pdf 
			output = new PDFTextStripper().getText(document);
			System.out.println(output);

		} finally {
			if (document != null) {
				document.close();
			}
			fileToParse.close();
			input.close();
		}
		System.out.println(output);
		return output;
	}
	

}
