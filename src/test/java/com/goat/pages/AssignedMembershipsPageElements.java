package com.goat.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.utils.Functions;

public class AssignedMembershipsPageElements extends Functions{
	
	@FindBy(id="btnAddMembershipDetail")
	public WebElement addBtn;
	@FindBy(id="membership_membership")
	public WebElement membershipDD;
	@FindBy(id="membership_subscriptionPaidBy")
	public WebElement subscrPaidByDD;
	@FindBy(id="membership_subscriptionAmount")
	public WebElement subscriptionAmount;
	@FindBy(id="membership_currency")
	public WebElement currencyDD;
	@FindBy(css="img.ui-datepicker-trigger")
	public WebElement subscriptionCommenceDateCalendar;
	@FindBy(id="membership_subscriptionRenewalDate")
	public WebElement subscriptionRenewalDateCalendar;
	@FindBy(id="btnSaveMembership")
	public WebElement saveBtn;
	
	// Calendar
	@FindBy(css="select.ui-datepicker-year")
	public WebElement yearDD;
	@FindBy(css="select.ui-datepicker-month")
	public WebElement monthDD;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody/tr/td")
	public List<WebElement> days;	
	
	@FindBy(xpath="//table[@class='table hover']//tbody/tr")
	public List<WebElement> resultTableRows;	
	
	
	public AssignedMembershipsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
//---------------------------------------------------------
	
	/**
	 * Method Picks the date in Calendar
	 * @param year
	 * @param month
	 * @param days
	 * @param y
	 * @param m
	 * @param d
	 */
	public void pickDate(WebElement year, WebElement month, List<WebElement> days, 
			String y, String m, String d) {
		selectOptionDDbyValue(year, y);
		selectOptionDDbyValue(month, m);
		//List<WebElement> days = day;
		for(WebElement day: days) {
			if(day.getText().equalsIgnoreCase(d)) {
				day.click();
				break;
			}
		}
		
	}

}
