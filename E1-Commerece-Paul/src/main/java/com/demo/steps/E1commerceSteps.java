package com.demo.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.page.DemoPageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class E1commerceSteps  {

	WebDriver Driver;
	
	
	DemoPageFactory pff = (DemoPageFactory) PageFactory.initElements( Driver, DemoPageFactory.class);
	
	@BeforeTest

//TC01:invalid user log in
@Given("^User opens browser and navigates to url https://demo\\.oscommerce\\.com/index\\.php$")
public void user_opens_browser_and_navigates_to_url_https_demo_oscommerce_com_index_php() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver", "/Users/sukhsingh/git/repository3/E1-Commerece-Paul/chromedriver");
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	Driver.get(pff.getUrl());
}


@Given("^User clicks on my account tab$")
public void user_clicks_on_my_account_tab() throws Throwable{
   pff.getMyaccount().click(); 
}

@Test(priority = 1)

@Then("^User enters invalid (.*) and (.*)$")
public void user_enters_invalid_and(String arg1, String arg2) throws Throwable{
   pff.getEmail().sendKeys(arg1);
   pff.getPassword().sendKeys(arg2);
}

@Then("^User clicks submit button$")
public void user_clicks_submit_button()throws Throwable {
    pff.getBtnclk().click();
}

@Then("^User should get an error$")
public void user_should_get_an_error() throws Throwable{
	
	
	String actual_error = pff.getErrmsg().getText();
	String expected = "Error: No match for E-Mail Address and/or Password.\n" + "";

	if (actual_error.contains(expected)) {

		System.out.println("Validation Complete");

	} else {
		System.out.println("Validation incomplete");

	}
}
@Test(priority = 2)


//TC02:Valid user login
@Given("^User clears username$")
public void user_clears_username() throws Throwable {
	pff.getEmail2().clear();
         
}

@Given("^User valid (.*) and (.*)$")
public void user_valid_and(String arg1, String arg2) throws Throwable {
    pff.getEmail2().sendKeys(arg1);
    pff.getPassword2().sendKeys(arg2);
}

@Then("^Clicks submit button$")
public void clicks_submit_button() throws Throwable{
   pff.getBtnclk2().click();
}

@Then("^User should be able to login$")
public void user_should_be_able_to_login() throws Throwable{
	String validation_url = Driver.getCurrentUrl();
	

	if (validation_url.contains(pff.getExpected_url())){
		System.out.println("Passed");
	} else {
		System.out.println("Failed");
	}

   
}
@Test(priority = 3)
//TC03: Searching for mouse

@Given("^Searches mouse$")
public void searches_mouse() throws Throwable{
   pff.getQf().sendKeys("mouse");
}

@Then("^User clicks submit$")
public void user_clicks_submit() throws Throwable{
    pff.getQf().sendKeys(Keys.ENTER);
}
@Test(priority = 4)
//TC04: Filter by price
@Given("^User filters by price$")
public void user_filters_by_price() throws Throwable{
    pff.getSorting().click();
}

@Given("^adds the first item to cart$")
public void adds_the_first_item_to_cart()throws Throwable {
   pff.getAddcar().click();
}

@Test(priority = 5)
//TC05: Add software to cart
@Given("^User clicks on software$")
public void user_clicks_on_software() throws Throwable{
   pff.getQf2().click();
}

@Given("^User click on simulation$")
public void user_click_on_simulation() throws Throwable{
   pff.getBuy2().click();
}

@Then("^User adds item to cart$")
public void user_adds_item_to_cart() throws Throwable{
   pff.getAddcar2().click();
}
@Test(priority = 6)
//TC06: Select samsung from drop down and add to cart
@Given("^User navigates to manufacturers$")
public void user_navigates_to_manufacturers() throws Throwable{
    pff.getQf3().click();
    pff.getIt3().click();
    pff.getBuy3().click();
    pff.getAddcar3().click();
}

@Given("^User selects Samsung$")
public void user_selects_Samsung() throws Throwable{
    Select manu = new Select ( pff.getManufac());
    manu.selectByVisibleText("Samsung");
}

@Then("^User adds to item to cart$")
public void user_adds_to_item_to_cart() throws Throwable{
    pff.getSam().click();
}
@Test(priority = 7)
//TC07: Checkout

@Given("^User clicks on checkout$")
public void user_clicks_on_checkout() throws Throwable{
    pff.getChekout().click();
}

@Test(priority = 8)
//TC08: Changing shipping address
@Given("^User clicks on change address button$")
public void user_clicks_on_change_address_button() throws Throwable{
    pff.getChange_shipping().click();
}

@Given("^User Enters valid credentials (.*) , (.*) , (.*) , (.*) , (.*)  and (.*)$")
public void user_Enters_valid_credentials_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)throws Throwable {
   pff.getGender().click();
   pff.getFirst().sendKeys(arg1);
   pff.getLast().sendKeys(arg2);
   pff.getStreet().sendKeys(arg3);
   pff.getPost_code().sendKeys(arg4);
   pff.getCity().sendKeys(arg5);
   pff.getState().sendKeys(arg6);
}

@Test(priority = 9)
//TC09: Checkout with payment
@Then("^User click continue$")
public void user_click_continue() throws Throwable{
   pff.getContinue_btn().click();
}

@Given("^User clicks continue$")
public void user_clicks_continue() throws Throwable{
    pff.getContinue_btn2().click();
}

@Given("^User enters valid payment$")
public void user_enters_valid_payment() throws Throwable{
   pff.getPayment().click();
}

@Then("^User clicks checkout$")
public void user_clicks_checkout() throws Throwable{
   pff.getContinue_btn3().click();
   pff.getPaynow().click();
}

@After
//TC10:Logging off
@Then("^User logsoff$")
public void user_logsoff() throws Throwable{
    pff.getLogoff().click();
}



}
