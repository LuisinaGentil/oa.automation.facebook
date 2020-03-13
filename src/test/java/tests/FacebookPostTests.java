package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import static base.BaseSettings.*;

import java.util.Date;

public class FacebookPostTests extends BaseTest {


    @Test(priority = 0)
    public void createPost(){
        this.login();
        setFacebookHomePage();
        facebookHomePage.openPostPage();
        setFacebookPostPage();
        facebookPostPage.enterPost(POST_TEXT+ new Date());
        facebookPostPage.post();
    }

    private void login(){
        facebookLoginPage.enterUser(FACEBOOK_USER);
        facebookLoginPage.enterPass(FACEBOOK_PASS);
        facebookLoginPage.login();
    }

}

