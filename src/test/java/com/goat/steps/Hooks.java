package com.goat.steps;
import com.goat.utils.Functions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks extends Functions{
	@Before 
	public void start() {
		setUp();
	}
	@After 
	public void stop(Scenario scenario) {
		byte[]pic;
		if (scenario.isFailed()) {
			pic=takeScreenshotBytes("failed/"+scenario.getName());
		}else {
			pic=takeScreenshotBytes("passed/"+scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());
		tearDown();
	}
}
