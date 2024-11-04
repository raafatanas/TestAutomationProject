package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    @Step("Verify Home Page is Visible")
    public HomePage verifyHomePageIsVisible(String message){
        String text = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals(message, text);
        System.out.println("Home Page is visible!");
        return this;
    }

    @Step("Verify Logged In As is Visible")
    public HomePage verifyLoggedInAsIsVisible(String message){
        String loggedInText = driver.findElement(By.xpath("//a[contains(text(), 'Logged in as')]")).getText();
        Assert.assertEquals(message, loggedInText);
        System.out.println("Found: " + loggedInText);
        return this;
    }

    @Step("Click Delete Button")
    public HomePage clickDeleteAccount(){
        driver.findElement(By.cssSelector("[href='/delete_account']")).click();
        return this;
    }

    @Step("Click Logout Button")
    public HomePage clickLogout(){
        driver.findElement(By.cssSelector("[href='/logout']")).click();
        return this;
    }

    @Step("Click Signup/Login Button")
    public HomePage moveToRegisterAndLoginPage(){
        driver.findElement(By.cssSelector("[href='/login']")).click();
        return this;
    }
}
