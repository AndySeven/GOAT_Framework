package com.goat.steps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;

import com.goat.utils.Functions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembershipsSteps extends Functions {
	List<String> expListMemb;
	List<String> addedListMemb = new ArrayList<>();

	@Given("I logged in application")
	public void i_logged_in_application() {
		login.loginAdmin();

	}

	@Given("I navigated to the Memberships page")
	public void i_navigated_to_the_Memberships_page() {
		jsClick(dash.adminBtn);
		mouseHover(dash.qualificationsBtn);
		click(dash.membershipsOpt);
	}

	@When("I click on Add button")
	public void i_click_on_Add_button() {
		click(memb.btnAdd);
	}

	@When("I enter the name of membership and click on Save button")
	public void i_enter_the_name_of_membership_and_click_on_Save_button(DataTable dataTable) throws Exception {
		expListMemb = new LinkedList<>(dataTable.asList());
		for (String m : expListMemb) {
			// if membership exist it lets TC pass using try and catch
			try {
				memb.addMembership(m);
			} catch (Exception e) {
				System.out.println("<-- Test CASE faild: " + e.getMessage());
			}
		}
	}

	@Then("I see all kind of memeberships successfully added")
	public void i_see_all_kind_of_memeberships_successfully_added() {
		addedListMemb = memb.getActual(memb.tableRows, expListMemb);
		Collections.sort(expListMemb);
		Collections.sort(addedListMemb);
		Assert.assertEquals("Memberships are NOT added", expListMemb, addedListMemb);
		
	}

}
