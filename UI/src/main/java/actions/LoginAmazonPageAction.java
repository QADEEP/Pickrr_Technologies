package actions;

import base.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginAmazonPage;

import static pages.LoginAmazonPage.*;

public class LoginAmazonPageAction {
    WebDriver driver;
    LoginAmazonPageAction(WebDriver driver){

        PageFactory.initElements(driver, LoginAmazonPage.class);
    }
    public void signInButton(){
        BaseActions.waitAndClick(driver,LoginAmazonPage.signInButton);
    }
    public void enterEmail(String text){
        BaseActions.ClearAndSendKeys(driver,email,text);
    }
    public void clickOnContinue(){
        BaseActions.waitAndClick(driver,continueButton);
    }
    public void enterPassword(String enterPassword){
        BaseActions.clearAndSendKeys(driver,password,enterPassword);
    }
    public void clickOnSignIn(){
        BaseActions.waitAndClick(driver,signIn);
    }
}
