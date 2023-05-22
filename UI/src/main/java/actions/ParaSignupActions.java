package actions;

import base.BaseActions;
import pages.ParaSignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static pages.ParaSignupPage.*;

public class ParaSignupActions {

     WebDriver driver;
    public ParaSignupActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, ParaSignupPage.class);
    }
    public void clickOnRegisterLink(){
        BaseActions.waitAndClick(driver,register);
    }


    public void enterFirstName(String firstNameText) {
        BaseActions.clearAndSendKeys(driver, firstName, firstNameText);
    }

    public void enterLastName(String lastNameText) {
        BaseActions.clearAndSendKeys(driver, lastName, lastNameText);
    }

    public void enterAddress(String addressText) {
        BaseActions.clearAndSendKeys(driver, address, addressText);
    }

    public void enterCity(String cityName) {
        BaseActions.clearAndSendKeys(driver, city, cityName);
    }

    public void enterState(String stateName) {
        BaseActions.clearAndSendKeys(driver, state, stateName);
    }

    public void enterZipCode(String zipcodevalue) {
        BaseActions.clearAndSendKeys(driver, state, zipcodevalue);
    }

    public void enterPhone(String phone){
        BaseActions.clearAndSendKeys(driver,phoneNumber,phone);
    }
    public void enterUserName(String userNameText) {
        BaseActions.clearAndSendKeys(driver, userName, userNameText);
    }

    public void enterPassword(String passwordText) {
        BaseActions.clearAndSendKeys(driver, password, passwordText);
    }

    public void enterConfirmPassword(String confirmPasswordText) {
        BaseActions.clearAndSendKeys(driver, password, confirmPasswordText);
    }

    public void clickRegisterButton() {
        BaseActions.waitAndClick(driver,registerButton);
    }
}