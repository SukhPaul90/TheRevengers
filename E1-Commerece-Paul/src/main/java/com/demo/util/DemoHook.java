package com.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DemoHook {
	public static WebDriver chromeDriver;

	@Before("@chrome")
	public void setUpChrome() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sukhsingh/Desktop/CucumberPageFactory/CucumberProjectThree/chromedriver");
		chromeDriver = new ChromeDriver();

	}

	@After("@chrome")
	public void tearDownChrome() {
		chromeDriver.quit();
	}

	@Before("chrome")
	public static WebDriver getChromeDriver() {
		return chromeDriver;
	}
}