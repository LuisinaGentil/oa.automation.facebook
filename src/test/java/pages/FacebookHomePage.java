package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookHomePage extends BasePage {
    WebDriver driver;
    private String titleLocator = "//span[text()='Crear publicación']";
    private WebElement postTitle;


    public FacebookHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.postTitle = driver.findElement(By.xpath(titleLocator));

    }

    public void openPostPage(){
        setWebElement(postTitle);
         click();
     }


}
