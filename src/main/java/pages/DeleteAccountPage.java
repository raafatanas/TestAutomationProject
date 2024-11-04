package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class DeleteAccountPage extends BaseTest {

    @Step("Verify Deleted Account is Visible")
    public DeleteAccountPage verifyDeletedAccountIsVisible(String message){
        String text = driver.findElement(By.xpath("//h2[@class='title text-center']//b")).getText();
        Assert.assertEquals(message, text);
        System.out.println("Found: " + text);
        return this;
    }

    @Step("Click Continue")
    public DeleteAccountPage clickContinue(){
        driver.findElement(By.cssSelector("[data-qa='continue-button']")).click();
        return this;
    }

}
