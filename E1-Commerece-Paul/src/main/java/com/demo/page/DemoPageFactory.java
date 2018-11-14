package com.demo.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//after all FindBy,source select only getters

public class DemoPageFactory {
	
	WebDriver driver;

	public DemoPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	private String url = "https://demo.oscommerce.com/";
	private String expected_url = "https://demo.oscommerce.com/account.php";

	@FindBy(xpath = "//*[@id=\\\"tdb3\\\"]/span[2]")
	private WebElement myaccount;

	@FindBy(xpath = "//*[@name='email_address']")
	private WebElement email;

	@FindBy(xpath = "//*[contains(@name,'password')]")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"tdb1\"]/span[2]")
	private WebElement btnclk;

	@FindBy(xpath = " //*[@id=\"bodyContent\"]")
	private WebElement errmsg;

	@FindBy(xpath = "//*[@name='email_address']")
	private WebElement email2;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password2;

	@FindBy(xpath = "//*[@id=\"tdb1\"]/span[2]")
	private WebElement btnclk2;

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[3]/div[2]/form/input[1]")
	private WebElement qf;

	@FindBy(xpath = "//*[@id=\"bodyContent\"]/div/div[1]/div[1]/div[1]/table/tbody/tr/td[3]/a")
	private WebElement sorting;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
	private WebElement addcar;

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[1]/div[2]/a[2]")
	private WebElement qf2;

	@FindBy(xpath = "//*[@ichange_shippingd=\"bodyContent\"]/div/div/div/table/tbody/tr[2]/td/a[2]")
	private WebElement buy2;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
	private WebElement addcar2;

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[1]/div[2]/a[2]")
	private WebElement qf3;

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[1]/div[2]/a[4]")
	private WebElement it3;

	@FindBy(xpath = "//*[@id=\"bodyContent\"]/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a")
	private WebElement buy3;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
	private WebElement addcar3;

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[2]/div[2]/form/select")
	private WebElement manufac;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
	private WebElement sam;

	@FindBy(xpath = "//*[@id=\"tdb9\"]/span[2]")
	private WebElement chekout;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span[2]")
	private WebElement change_shipping;

	@FindBy(xpath = "(//*[@name='gender'])[2]")
	private WebElement gender;

	@FindBy(xpath = "//*[@name='firstname']")
	private WebElement first;

	@FindBy(xpath = "//*[@name='lastname']")
	private WebElement last;

	@FindBy(xpath = "//*[@name='street_address']")
	private WebElement street;

	@FindBy(xpath = "//*[@name='postcode']")
	private WebElement post_code;

	@FindBy(xpath = "//*[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//*[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//*[contains(@type,'submit')]")
	private WebElement continue_btn;

	@FindBy(xpath = "//*[@id=\"tdb6\"]/span[2]")
	private WebElement continue_btn2;

	@FindBy(xpath = "(//*[@name='payment'])[6]")
	private WebElement payment;

	@FindBy(xpath = "//*[@id=\"tdb6\"]/span[2]")
	private WebElement continue_btn3;

	@FindBy(xpath = "//*[@id=\"tdb5\"]/span")
	private WebElement paynow;

	@FindBy(xpath = "//*[@id=\"tdb4\"]/span")
	private WebElement logoff;

	public String getUrl() {
		return url;
	}

	public String getExpected_url() {
		return expected_url;
	}

	public WebElement getMyaccount() {
		return myaccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnclk() {
		return btnclk;
	}

	public WebElement getErrmsg() {
		return errmsg;
	}

	public WebElement getEmail2() {
		return email2;
	}

	public WebElement getPassword2() {
		return password2;
	}

	public WebElement getBtnclk2() {
		return btnclk2;
	}

	public WebElement getQf() {
		return qf;
	}

	public WebElement getSorting() {
		return sorting;
	}

	public WebElement getAddcar() {
		return addcar;
	}

	public WebElement getQf2() {
		return qf2;
	}

	public WebElement getBuy2() {
		return buy2;
	}

	public WebElement getAddcar2() {
		return addcar2;
	}

	public WebElement getQf3() {
		return qf3;
	}

	public WebElement getIt3() {
		return it3;
	}

	public WebElement getBuy3() {
		return buy3;
	}

	public WebElement getAddcar3() {
		return addcar3;
	}

	public WebElement getManufac() {
		return manufac;
	}

	public WebElement getSam() {
		return sam;
	}

	public WebElement getChekout() {
		return chekout;
	}

	public WebElement getChange_shipping() {
		return change_shipping;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPost_code() {
		return post_code;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	public WebElement getContinue_btn2() {
		return continue_btn2;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getContinue_btn3() {
		return continue_btn3;
	}

	public WebElement getPaynow() {
		return paynow;
	}

	public WebElement getLogoff() {
		return logoff;
	}

}
