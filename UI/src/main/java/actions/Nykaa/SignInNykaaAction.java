package actions.Nykaa;

import base.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Nykaa.SignInNykaa;

import static pages.Nykaa.SignInNykaa.*;

public class SignInNykaaAction {

    public  WebDriver driver;
    public SignInNykaaAction(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, SignInNykaa.class);
    }

    public  void register(){
        BaseActions.waitAndClick(driver,signInButton);
        BaseActions.waitAndClick(driver,signInWithMobileEMail);
        BaseActions.ClearAndSendKeys(driver,enterEmailorMobile,"deepmahour@gmail.com");
        BaseActions.waitAndClick(driver,proceed);
        BaseActions.clearAndSendKeys(driver,name,"deep");
        BaseActions.clearAndSendKeys(driver,phoneNumber,"9898901212");
        BaseActions.waitAndClick(driver,register);
    }
}
