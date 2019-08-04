package com.qa.runner;

import org.junit.runner.RunWith;

import com.qa.util.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/qa/features/Test1.feature", glue = {
		"com/qa/stepDefinition" }, format = { "pretty",
				"html:cucumber-reports" }, monochrome = true, tags = { "@ScenarioA,@ScenarioB" })

public class TestRunner extends TestBase {
}
