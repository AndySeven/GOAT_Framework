package com.goat.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = "target/failed.txt"
		,glue = "com/goat/steps"
		,monochrome = true
		, plugin = {

					"pretty"
				  , "html:target/cucumber-default-report"
		}
		
		
		)
public class FailerRunner {

}
