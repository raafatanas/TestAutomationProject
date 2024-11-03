package pages;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeleteAccountPage extends BaseTest {

    public DeleteAccountPage verifyDeletedAccountIsVisible(String message){
        String text = driver.findElement(By.xpath("//h2[@class='title text-center']//b")).getText();
        Assert.assertEquals(message, text);
        System.out.println("Found: " + text);
        return this;
    }

    public DeleteAccountPage clickContinue(){
        driver.findElement(By.cssSelector("[data-qa='continue-button']")).click();
        return this;
    }

}
