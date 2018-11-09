package com.Revengers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hulk {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrive.chrome.driver", "/Users/sukhsingh/Desktop/E1-Commerece-Paul/chromedriver");
		WebDriver ant = new ChromeDriver();

		ant.get("https://demo.oscommerce.com/");
		ant.manage().window().fullscreen();
		ant.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement myaccount = ant.findElement(By.xpath("//*[@id=\"tdb3\"]/span[2]"));
		myaccount.click();

		WebElement email = ant.findElement(By.xpath("//*[@name='email_address']"));
		email.sendKeys("askick@aol.com");

		WebElement password = ant.findElement(By.xpath("//*[contains(@name,'password')]"));
		password.sendKeys("chickawoow");

		WebElement btnclk = ant.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]"));
		btnclk.click();

		WebElement errmsg = ant.findElement(By.xpath(" //*[@id=\"bodyContent\"]"));
		String actual_error = errmsg.getText();
		String expected = "Error: No match for E-Mail Address and/or Password.\n" + "";

		if (actual_error.contains(expected)) {

			System.out.println("Validation Complete");

		} else {
			System.out.println("Validation incomplete");

		}

		WebElement email2 = ant.findElement(By.xpath("//*[@name='email_address']"));
		email2.clear();
		email2.sendKeys("asf@gmail.com");

		WebElement password2 = ant.findElement(By.xpath("//*[@name='password']"));
		password2.sendKeys("123456a");

		WebElement btnclk2 = ant.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]"));
		btnclk2.click();

		String validation_url = ant.getCurrentUrl();
		String expected_url = "https://demo.oscommerce.com/account.php";

		if (validation_url.contains(expected_url)){
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		WebElement qf = ant.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[3]/div[2]/form/input[1]"));
		qf.sendKeys("mouse");
		qf.sendKeys(Keys.ENTER);
	
		WebElement sorting = ant.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div[1]/div[1]/div[1]/table/tbody/tr/td[3]/a"));
		sorting.click();
		
		WebElement addcar = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]"));
		addcar.click();
		
		WebElement qf2 = ant.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[2]"));
		qf2.click();
		
		WebElement buy2 = ant.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div/div/table/tbody/tr[2]/td/a[2]"));
		buy2.click();
		
		WebElement addcar2 = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]"));
		addcar2.click();
		
		WebElement qf3 = ant.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[2]"));
		qf3.click();
		
		WebElement it3 = ant.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[4]"));
		it3.click();
		
		WebElement buy3 = ant.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a"));
		buy3.click();
		
		WebElement addcar3 = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]"));
		addcar3.click();
		
		Select manufac = new Select(ant.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[2]/div[2]/form/select")));
		manufac.selectByVisibleText("Samsung");
		
		WebElement sam = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]"));
		sam.click();
		
		WebElement chekout = ant.findElement(By.xpath("//*[@id=\"tdb9\"]/span[2]"));
		chekout.click();
	
		WebElement change_shipping = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span[2]"));
		change_shipping.click();
		
		WebElement gender = ant.findElement(By.xpath("(//*[@name='gender'])[2]"));
		gender.click();
		
		WebElement first = ant.findElement(By.xpath("//*[@name='firstname']"));
		first.sendKeys("Br");
		
		WebElement last = ant.findElement(By.xpath("//*[@name='lastname']"));
		last.sendKeys("Griffen");

		WebElement street = ant.findElement(By.xpath("//*[@name='street_address']"));
		street.sendKeys("140 grace");

		WebElement post_code = ant.findElement(By.xpath("//*[@name='postcode']"));
		post_code.sendKeys("91110");

		WebElement city = ant.findElement(By.xpath("//*[@name='city']"));
		city.sendKeys("Queens");
		
		WebElement state = ant.findElement(By.xpath("//*[@name='state']"));
		state.sendKeys("NY");

		//Select Country = new Select (ant.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[6]/table/tbody/tr[10]/td[2]/select")));
		//Country.selectByVisibleText("Sir Lanka");
		
		WebElement continue_btn = ant.findElement(By.xpath("//*[contains(@type,'submit')]"));
		continue_btn.click();
	
		WebElement continue_btn2 = ant.findElement(By.xpath("//*[@id=\"tdb6\"]/span[2]"));
		continue_btn2.click();
	

		WebElement payment = ant.findElement(By.xpath("(//*[@name='payment'])[6]"));
		payment.click();

		WebElement continue_btn3 = ant.findElement(By.xpath("//*[@id=\"tdb6\"]/span[2]"));
		continue_btn3.click();

		WebElement paynow = ant.findElement(By.xpath("//*[@id=\"tdb5\"]/span"));
		paynow.click();
		
		WebElement logoff = ant.findElement(By.xpath("//*[@id=\"tdb4\"]/span"));
		logoff.click();

	
		

}
}

				

