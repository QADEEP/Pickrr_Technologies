package UI.Nykaa;

import actions.Nykaa.SignInNykaaAction;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.driver;

public class SignInNykaaTest {
    @BeforeMethod
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();
    }
    @Test
    public void registerOnNykaa(){
        SignInNykaaAction signInNykaaAction=new SignInNykaaAction(driver);
        signInNykaaAction.register();
    }
}
