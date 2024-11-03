import base.BaseTest;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void login(){
        loginPage.fillLoginEmail(userEmail).fillLoginPassword(userPassword).clickLogin();
    }
}
