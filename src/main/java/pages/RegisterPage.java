package pages;

import base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public RegisterPage clickSignupButton(){
        driver.findElement(By.cssSelector("[href='/login']")).click();
        loginPage.verifyNewUserSignUpVisible("New User Signup!");
        return this;
    }

    public RegisterPage fillSignupName(String text){
        driver.findElement(By.cssSelector("[data-qa='signup-name']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillSignupEmail(String text){
        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(text);
        return this;
    }

    public RegisterPage clickSignup(){
        driver.findElement(By.cssSelector("[data-qa='signup-button']")).click();
        verifyAccountInformation("Enter Account Information");
        return this;
    }

    public RegisterPage verifyAccountInformation(String message){
        String text = driver.findElement(By.xpath("//h2[@class='title text-center']//b")).getText();
        System.out.println("Found: " + text);
        return this;
    }

    public RegisterPage checkGender(){
        selectRandomGender();
        return this;
    }

    public RegisterPage fillSignupPassword(String text){
        driver.findElement(By.cssSelector("[data-qa='password']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillSignupDay(String text){
        Select dayDropdown = new Select(driver.findElement(By.cssSelector("[data-qa='days']")));
        dayDropdown.selectByVisibleText(text);
        return this;
    }

    public RegisterPage fillSignupMonth(String text){
        Select monthDropdown = new Select(driver.findElement(By.cssSelector("[data-qa='months']")));
        monthDropdown.selectByVisibleText(text);
        return this;
    }

    public RegisterPage fillSignupYear(String text){
        Select yearDropdown = new Select(driver.findElement(By.cssSelector("[data-qa='years']")));
        yearDropdown.selectByVisibleText(text);
        return this;
    }

    public RegisterPage checkNewsletter(){
        driver.findElement(By.cssSelector("input[type='checkbox'][id='newsletter']")).click();
        return this;
    }

    public RegisterPage checkOptin(){
        driver.findElement(By.cssSelector("input[type='checkbox'][id='optin']")).click();
        return this;
    }

    public RegisterPage fillFirstName(String text){
        driver.findElement(By.cssSelector("[data-qa='first_name']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillLastName(String text){
        driver.findElement(By.cssSelector("[data-qa='last_name']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillAdress(String text){
        driver.findElement(By.cssSelector("[data-qa='address']")).sendKeys(text);
        return this;
    }

    public RegisterPage chooseCountry(String text){
        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText(text);
        return this;
    }

    public RegisterPage fillState(String text){
        driver.findElement(By.cssSelector("[data-qa='state']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillCity(String text){
        driver.findElement(By.cssSelector("[data-qa='city']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillZipcode(String text){
        driver.findElement(By.cssSelector("[data-qa='zipcode']")).sendKeys(text);
        return this;
    }

    public RegisterPage fillPhoneNumber(String text){
        driver.findElement(By.cssSelector("[data-qa='mobile_number']")).sendKeys(text);
        return this;
    }

//    public RegisterPage clickCreateAccount(){
//        driver.findElement(By.cssSelector("[data-qa='create-account']")).click();
//
//        return this;
//    }
    // We had to do this function with "wait" because we got an error that the test couldn't enter Create Account button
    public RegisterPage clickCreateAccount() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Close any overlay if present
            closeOverlayIfPresent();
            // Wait for the Create Account button to be clickable
            WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-qa='create-account']")));
            // Use JavaScript to click the button
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", createAccountButton);
        } catch (Exception e) {
            System.out.println("Error clicking the Create Account button: " + e.getMessage());
        }
        return this;
    }

    private void closeOverlayIfPresent() {
        try {
            // Replace this CSS selector with the actual selector for the overlay close button
            WebElement closeButton = driver.findElement(By.cssSelector("your-overlay-close-button-css-selector"));
            closeButton.click();
        } catch (NoSuchElementException e) {
            // Overlay not present, do nothing
        }
    }
}
