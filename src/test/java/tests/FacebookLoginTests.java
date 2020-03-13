package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FacebookLoginPage;

import static base.BaseSettings.*;

public class FacebookLoginTests extends BaseTest {

	@Test(priority = 1)
	//TODO: add assertions
	public void loginSuccess(){
		facebookLoginPage.enterUser(FACEBOOK_USER);
		facebookLoginPage.enterPass(FACEBOOK_PASS);
		facebookLoginPage.login();
	}
	@Test(priority = 0)
	//TODO: add assertions
	public void loginFailWrongPass(){
		facebookLoginPage.enterUser(FACEBOOK_USER);
		facebookLoginPage.enterPass("Testing.2019");
		facebookLoginPage.login();
	}
	@Test(priority = 0)
	//TODO: add assertions
	public void loginFailWrongUser(){
		facebookLoginPage.enterUser("luisiautomation@gmail.com");
		facebookLoginPage.enterPass(FACEBOOK_PASS);
		facebookLoginPage.login();
	}

}
