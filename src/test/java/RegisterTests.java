import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class RegisterTests extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
    @Test(description = "User Create Control")
    public void signupControl(){
        String userEmail2 = createEmail();
        homePage.verifyHomePageIsVisible("Full-Fledged practice website for Automation Engineers");
        registerPage.clickSignupButton()
                .fillSignupName("Anas")
                .fillSignupEmail(userEmail2)
                .clickSignup()
                .checkGender()
                .fillSignupPassword("test123")
                .fillSignupDay("21")
                .fillSignupMonth("July")
                .fillSignupYear("2002")
                .checkNewsletter()
                .checkOptin()
                .fillFirstName("Test")
                .fillLastName("TheTEST")
                .fillAdress("Barska")
                .chooseCountry("United States")
                .fillState("Test")
                .fillCity("Sarajevo")
                .fillZipcode("231241")
                .fillPhoneNumber("5934599213")
                .clickCreateAccount();

        accountCreatedPage.verifyAccountCreated("ACCOUNT CREATED!")
                .clickContinue();
        homePage.verifyLoggedInAsIsVisible("Logged in as Anas")
                .clickDeleteAccount();
        deleteAccountPage.verifyDeletedAccountIsVisible("ACCOUNT DELETED!")
                .clickContinue();
    }
    
}