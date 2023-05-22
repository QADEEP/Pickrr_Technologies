package actions.Amazon;

import base.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.Amazon.LoginAmazonPage;

import static pages.Amazon.LoginAmazonPage.*;

public class LoginAmazonPageAction {
    public WebDriver driver;
    public LoginAmazonPageAction(WebDriver driver){

        PageFactory.initElements(driver, LoginAmazonPage.class);
    }
    public void hoverOnSignIn(){

        
        Actions actions=new Actions(driver);
        actions.moveToElement((WebElement) myAccountHover).build().perform();


    }
    public void signInButton(){
        BaseActions.waitAndClick(driver,LoginAmazonPage.signInButton);
    }
    public void enterEmail(String text) throws InterruptedException {
        System.out.println("reached");
        Thread.sleep(3000);
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
