package actions;

import base.BaseActions;
import pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static pages.SignupPage.*;

public class SignupActions {
    WebDriver driver;

    public SignupActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, SignupPage.class);
    }

    public void clickOnSignupBtn() {
        BaseActions.waitAndClick(driver, signupbtn);
    }

    public void enterFirstName(String name) {
        //BaseActions.clearAndSendKeys(driver, firstName, name);
        driver.findElement(firstName).sendKeys("test");
    }

    public void enterLastName(String lasname) {
       // BaseActions.clearAndSendKeys(driver, lastName, lasname);
        driver.findElement(lastName).sendKeys("order");
    }

    public void companyName(String company) {
        //BaseActions.clearAndSendKeys(driver, companyName, company);
        driver.findElement(companyName).sendKeys("test123");
    }

    public void email(String mail) {
        //BaseActions.clearAndSendKeys(driver, email, mail);
        driver.findElement(email).sendKeys("test189754545@gmail.com");
    }

    public void password(String pass) {
        //BaseActions.clearAndSendKeys(driver, password, pass);
        driver.findElement(password).sendKeys("Test@123");
    }

    public void signup() {
        BaseActions.waitAndClick(driver, signupForFreeBtn);
    }
    public void clickOnLoginButton(){
        BaseActions.waitAndClick(driver,loginBtn);
    }
}