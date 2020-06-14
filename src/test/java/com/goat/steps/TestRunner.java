package com.goat.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		  features = "src/test/resources/features"

		, glue = "com/goat/steps"

		, dryRun = false

		, monochrome = true

		// ,tags = ""

		, plugin = {

				  "pretty"
				, "html:target/cucumber-default-report"
				, "json:target/cucumber.json"           // https://github.com/damianszczepanik/maven-cucumber-reporting
				, "rerun:target/faild.txt"

		})
public class TestRunner {

}
