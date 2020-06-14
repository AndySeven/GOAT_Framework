package com.goat.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.goat.utils.Functions;

public class MembershipsPageElements extends Functions {

	@FindBy(id = "btnAdd")
	public WebElement btnAdd;
	@FindBy(id = "membership_name")
	public WebElement nameTextBox;
	@FindBy(id = "btnSave")
	public WebElement btnSave;
	@FindBy(css = "span.validation-error")
	public WebElement existsMsg;
	@FindBy(xpath = "//table[@id='resultTable']//tbody//tr")
	public List<WebElement> tableRows;

	public MembershipsPageElements() {
		PageFactory.initElements(driver, this);
	}

	public boolean allAdded(String expected, String actual) {
		if (expected.contains(actual))
			return true;
		return false;
	}

	public void addMembership(String membership) throws Exception {
		sendText(nameTextBox, membership);
		if (!isElementPresent(By.cssSelector("span.validation-error"))) {
			click(btnSave);
			click(memb.btnAdd);
		} else if (!isElementVisible(By.cssSelector("span.validation-error"))) {
			click(btnSave);
			click(memb.btnAdd);
		}else {
			throw new Exception(membership+"--> Membership is already excist");
		}

	}

	public String getActualMemb(List<WebElement> listRows, String text) {
		String m = null;
		for (int i = 0; i < listRows.size(); i++) {
			String row = listRows.get(i).getText();
			if (row.contains(text)) {
				m = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[" + (i + 1) + "]/td[2]"))
						.getText();
				break;
			}
		}
		return m;
	}

	public List<String> getActual(List<WebElement> listRows, List<String> expec) {
		List<String> act = new ArrayList<>();
		for (String ex : expec) {
			act.add(getActualMemb(listRows, ex));
		}
		return act;
	}

}
