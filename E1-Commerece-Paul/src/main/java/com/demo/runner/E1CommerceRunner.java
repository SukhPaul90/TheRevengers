package com.demo.runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "E1-Commerece.feature" }, glue = { "E1commerceSteps.java","DemoHook.java"}, 
plugin = { "pretty","html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
tags={"@BeforeTest", "@Test","@After","@chrome"},

monochrome = true

		)


@Test
public class E1CommerceRunner extends AbstractTestNGCucumberTests{

	
	

}
