package com.talentech.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	        features = "Features",
	        glue="com.talentech.stepdef",
	        tags="@register"
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
