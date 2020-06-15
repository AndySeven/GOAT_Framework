package com.goat.steps;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;

import com.goat.utils.Functions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembershipsToEmployee extends Functions {

	@Given("I navigated to Add Employee page")
	public void i_navigated_to_Add_Employee_page() {
		jsClick(dash.pimBtn);
		jsClick(dash.addEmpBtn);

	}

	@Given("I added new employees {string} and {string}")
	public void i_added_new_employees_and(String firstName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
		click(addEmp.btnSave);
	}

	@Given("I navigated on Assigned Memberships page")
	public void i_navigated_on_Assigned_Memberships_page() {
		click(persDetails.MembershipsBtn);
	}

	@When("I click Add button")
	public void i_click_Add_button() {
		click(assMemb.addBtn);
	}

	@When("I select Membership {string}")
	public void i_select_Membership(String membership) {
		selectOptionDDbyValue(assMemb.membershipDD, membership);
	}

	@When("I select Subscription Paid By option {string}")
	public void i_select_Subscription_Paid_By_option_Company(String subscrOpt) {
		selectOptionDDbyValue(assMemb.subscrPaidByDD, subscrOpt);
	}

	@When("I enter Amount {string}")
	public void i_enter_Amount(String amount) {
		sendText(assMemb.subscriptionAmount, amount);
	}

	@When("I select {string}")
	public void i_select(String currency) {
		selectOptionDDbyValue(assMemb.currencyDD, currency);
	}

	@When("I select Subscription Commence Date {string}")
	public void i_select_Subscription_Commence_Date(String subscrCommDate) {
		Iterator<String> it = Arrays.asList(subscrCommDate.split("-")).iterator();
		while (it.hasNext()) {
			click(assMemb.subscriptionCommenceDateCalendar);
			assMemb.pickDate(assMemb.yearDD, assMemb.monthDD, assMemb.days, it.next(), it.next(),
					it.next().replaceAll("^0+(?!$)", ""));
		}
	}

	@When("I select Subscription Renewal Date {string}")
	public void i_select_Subscription_Renewal_Date(String subscrRenDate) {
		Iterator<String> it = Arrays.asList(subscrRenDate.split("-")).iterator();
		while (it.hasNext()) {
			click(assMemb.subscriptionRenewalDateCalendar);
			assMemb.pickDate(assMemb.yearDD, assMemb.monthDD, assMemb.days, it.next(), it.next(),
					it.next().replaceAll("^0+(?!$)", ""));
		}
	}

	@When("I click on Save button")
	public void i_click_on_Save_button() {
		click(assMemb.saveBtn);
	}

	@Then("I see membership {string} successfully added to employee")
	public void i_see_membership_successfully_added_to_employee(String membership) {
		Assert.assertTrue("Membership is NOT Added", presentedInTable(assMemb.resultTableRows, membership));
		takeScreenShot(membership);
	}

}
