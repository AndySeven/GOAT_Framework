package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.utils.Functions;

public class DashboardPageElements extends Functions{

	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement adminBtn;
	@FindBy(id="menu_admin_Qualifications")
	public WebElement qualificationsBtn;
	@FindBy(id="menu_admin_membership")
	public WebElement membershipsOpt;
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	
}
