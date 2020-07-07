package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.utils.ConfReader;
import com.goat.utils.Functions;

public class LoginPageElements extends Functions {
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	@FindBy(id = "txtPassword")
	public WebElement password;
	@FindBy(id = "btnLogin")
	public WebElement btnLogin;

	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}

	// functions for login page

	public void loginAdmin() {
		
		sendText(username, ConfReader.getProperty("adminUsername"));
		sendText(password, ConfReader.getProperty("adminPassword"));
		click(btnLogin);
	}

}
