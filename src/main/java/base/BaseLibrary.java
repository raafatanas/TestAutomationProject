package base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseLibrary extends Data{
    public static WebDriver driver;

    public String createEmail(){
        Random random = new Random();

        String email = "testUser" + random.nextInt(1000000) + "@hotmail.com";
        return email;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void selectRandomGender() {
        // Generate a random boolean value
        Random random = new Random();
        boolean isMaleSelected = random.nextBoolean();

        // Select one of the radio buttons based on the random value
        if (isMaleSelected) {
            driver.findElement(By.id("id_gender1")).click();
        } else {
            driver.findElement(By.id("id_gender2")).click();
        }
    }
}
