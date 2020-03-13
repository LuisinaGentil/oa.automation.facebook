package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPostPage extends BasePage {

	WebDriver driver;
	private String inputPostLocator = "//div[@aria-autocomplete='list']";
	private String btnPostLocator = "//div[2]/button[@type='submit']";
	private WebElement inputPost;
	private WebElement btnPost;

	public FacebookPostPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.inputPost = driver.findElement(By.xpath(inputPostLocator));
		this.btnPost = driver.findElement(By.xpath(btnPostLocator));
	}

	public void enterPost(String postContent){
		setWebElement(inputPost);
		enterText(postContent);
	}

	public void post(){
		setWebElement(btnPost);
		click();
	}

}
