package pages;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    public HomePage verifyHomePageIsVisible(String message){
        String text = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals(message, text);
        System.out.println("Home Page is visible!");
        return this;
    }

    public HomePage verifyLoggedInAsIsVisible(String message){
        String loggedInText = driver.findElement(By.xpath("//a[contains(text(), 'Logged in as')]")).getText();
        Assert.assertEquals(message, loggedInText);
        System.out.println("Found: " + loggedInText);
        return this;
    }

    public HomePage clickDeleteAccount(){
        driver.findElement(By.cssSelector("[href='/delete_account']")).click();
        return this;
    }
}
