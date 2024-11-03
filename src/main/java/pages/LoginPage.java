package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    public LoginPage verifyNewUserSignUpVisible(String message){
        String text = driver.findElement(By.cssSelector("div.signup-form h2")).getText();
        //System.out.println(text);
        return this;
    }

    public LoginPage fillLoginEmail(String text){
        driver.findElement(By.cssSelector("[data-qa='login-email']")).sendKeys(text);
        return this;
    }

    public LoginPage fillLoginPassword(String text){
        driver.findElement(By.cssSelector("[data-qa='login-password']")).sendKeys(text);
        return this;
    }

    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[data-qa='login-button']")).click();
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
