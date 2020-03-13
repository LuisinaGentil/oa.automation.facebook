package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends BasePage {
	WebDriver driver;
	private String accountLocator ="//input[@id='email']";
	private String passLocator = "//input[@id='pass']";
	private String btnLocator = "//input[@type='submit']";
	private WebElement inputAccount;
	private WebElement inputPass;
	private WebElement btnSignIn;

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.inputAccount = driver.findElement(By.xpath(accountLocator));
		this.inputPass = driver.findElement(By.xpath(passLocator));
		this.btnSignIn = driver.findElement(By.xpath(btnLocator));
	}

	public void login(){
		setWebElement(this.btnSignIn);
		click();
	}

	public void enterUser(String userAccount){
		setWebElement(inputAccount);
		enterText(userAccount);
	}

	public void enterPass(String password){
		setWebElement(inputPass);
		enterText(password);
	}
}
