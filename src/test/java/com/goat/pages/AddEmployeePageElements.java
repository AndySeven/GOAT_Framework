package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.utils.Functions;

public class AddEmployeePageElements extends Functions{
	
	@FindBy(id="firstName")
	public WebElement firstName;
	@FindBy(id="lastName")
	public WebElement lastName;
	@FindBy(id="btnSave")
	public WebElement btnSave;
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	
	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}
	

}
