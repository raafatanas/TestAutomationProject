package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Click Signup/Login Button")
    public LoginPage moveToLoginPage(){
        driver.findElement(By.cssSelector("[href='/login']")).click();
        return this;
    }

    @Step("Verify New User Signup is Visible")
    public LoginPage verifyNewUserSignUpVisible(String message){
        String text = driver.findElement(By.cssSelector("div.signup-form h2")).getText();
        System.out.println("Found: " + text);
        return this;
    }

    @Step("Fill Login Email Field")
    public LoginPage fillLoginEmail(String text){
        driver.findElement(By.cssSelector("[data-qa='login-email']")).sendKeys(text);
        return this;
    }

    @Step("Fill Login Password Field")
    public LoginPage fillLoginPassword(String text){
        driver.findElement(By.cssSelector("[data-qa='login-password']")).sendKeys(text);
        return this;
    }

    @Step("Click Login Button")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[data-qa='login-button']")).click();
        screenshot();
        return this;
    }

    @Step("Verify Login To Your Account is Visible")
    public LoginPage verifyLoginToYourAccount(String message){
        String text = driver.findElement(By.cssSelector("div.login-form h2")).getText();
        System.out.println("Found: " + text);
        return this;
    }

    @Step("Verify Email or Password Is Incorrect")
    public LoginPage emailorPasswordIncorrect(String message){
        driver.findElement(By.xpath("//form[@action='/login']//p")).getText();
        return this;
    }

    @Step("Verify Email Address Is Already Existed")
    public LoginPage emailAddressAlready(String message){
        driver.findElement(By.xpath("//form[@action='/signup']//p")).getText();
        return this;
    }

//    public LoginRegisterPage fillSignupName(String text){
//        driver.findElement(By.cssSelector("[data-qa='signup-name']")).sendKeys(text);
//        return this;
//    }
//
//    public LoginRegisterPage fillSignupEmail(String text){
//        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(text);
//        return this;
//    }
//
//    public LoginRegisterPage clickSignup(){
//        driver.findElement(By.cssSelector("[data-qa='signup-button']")).click();
//        return this;
//    }

}
