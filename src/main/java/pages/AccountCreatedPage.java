package pages;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountCreatedPage extends BaseTest {

    public AccountCreatedPage verifyAccountCreated(String message){
        String text = driver.findElement(By.xpath("//h2[@class='title text-center']//b")).getText();
        Assert.assertEquals(message, text);
        System.out.println("Found: " + text);
        return this;
    }

    public AccountCreatedPage clickContinue(){
        driver.findElement(By.cssSelector("[data-qa='continue-button']")).click();
        return this;
    }
}
