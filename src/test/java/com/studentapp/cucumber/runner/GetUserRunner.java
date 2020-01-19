package com.studentapp.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
				 features = "src/test/resources/features/",
				 glue="com.studentapp.cucumber.stepdefinition",
				 tags = {"@running"},
				 plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
				 monochrome = true,
				 dryRun = false
		)

public class GetUserRunner{
	
}
