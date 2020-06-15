package com.goat.testbase;

import com.goat.pages.AddEmployeePageElements;
import com.goat.pages.AssignedMembershipsPageElements;
import com.goat.pages.DashboardPageElements;
import com.goat.pages.LoginPageElements;
import com.goat.pages.MembershipsPageElements;
import com.goat.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static MembershipsPageElements memb;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements persDetails;
	public static AssignedMembershipsPageElements assMemb;

	public static void init() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		memb = new MembershipsPageElements();
		addEmp = new AddEmployeePageElements();
		persDetails = new PersonalDetailsPageElements();
		assMemb = new AssignedMembershipsPageElements();
	}

}
