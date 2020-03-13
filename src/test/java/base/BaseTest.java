package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;
import pages.FacebookPostPage;

import static base.Constants.*;

public class BaseTest {
	private WebDriver driver;
	private ChromeOptions chromeOptions = new ChromeOptions();
	protected FacebookLoginPage facebookLoginPage;
	protected FacebookHomePage facebookHomePage;
	protected FacebookPostPage facebookPostPage;

	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + CHROMEDRIVER);
		chromeOptions.addArguments("start-maximized");
		// added to avoid chrome notifications to appear
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);

	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}

	@BeforeMethod
	public void navigateToBaseUrl(){
		driver.navigate().to(BASE_URL);
		facebookLoginPage = new FacebookLoginPage(driver);
	}

	public void setFacebookHomePage(){
		facebookHomePage = new FacebookHomePage(driver);
	}

	public void setFacebookPostPage(){
		facebookPostPage = new FacebookPostPage(driver);
	}
}
