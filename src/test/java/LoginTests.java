import base.BaseTest;

import org.testng.annotations.Test;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
    //RegisterPage registerPage = new RegisterPage();
    @Test(description = "Successful Login Control")
    // Enter valid email and password
    public void successfulLogin(){
        homePage.verifyHomePageIsVisible("Full-Fledged practice website for Automation Engineers");
        loginPage.moveToLoginPage()
                .verifyLoginToYourAccount("Login to your account")
                .fillLoginEmail(userEmail)
                .fillLoginPassword(userPassword)
                .clickLogin();
        homePage.verifyLoggedInAsIsVisible("Logged in as Anas")
                .clickDeleteAccount();
        deleteAccountPage.verifyDeletedAccountIsVisible("ACCOUNT DELETED!");
    }

    @Test(description = "Unsuccessful Login Control")
    public void unsuccessfulLogin(){
        homePage.verifyHomePageIsVisible("Full-Fledged practice website for Automation Engineers");
        loginPage.moveToLoginPage()
                .verifyLoginToYourAccount("Login to your account")
                .fillLoginEmail("test12@gmail.com")
                .fillLoginPassword(userPassword)
                .clickLogin()
                .emailorPasswordIncorrect("Your email or password is incorrect!");
    }

    @Test(description = "Logout Control")
    // testUser@hotmaail.com , test123
    public void logoutControl(){
        homePage.verifyHomePageIsVisible("Full-Fledged practice website for Automation Engineers");
        loginPage.moveToLoginPage()
                .verifyLoginToYourAccount("Login to your account")
                .fillLoginEmail("testt@hotmail.com")
                .fillLoginPassword("test123")
                .clickLogin();
        homePage.verifyLoggedInAsIsVisible("Logged in as Anas")
                .clickLogout();
        loginPage.verifyLoginToYourAccount("Login to your account");
    }
}
