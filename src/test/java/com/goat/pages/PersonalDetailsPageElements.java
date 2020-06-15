package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.utils.Functions;

public class PersonalDetailsPageElements extends Functions{
	
	@FindBy(css="#sidenav > li:nth-child(11) > a")
	public WebElement MembershipsBtn;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
	

}
