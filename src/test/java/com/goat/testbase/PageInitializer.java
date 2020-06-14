package com.goat.testbase;

import com.goat.pages.DashboardPageElements;
import com.goat.pages.LoginPageElements;
import com.goat.pages.MembershipsPageElements;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static MembershipsPageElements memb;
	
	
	public static void init() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		memb = new MembershipsPageElements();
	}
	
	
}
