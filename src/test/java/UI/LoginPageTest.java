package UI;

import Actions.LoginPageActions;
import Actions.SignupActions;
import Utils.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Base.BrowserInstantiate.*;

public class LoginPageTest extends BaseClass {
    public LoginPageActions loginPageActions;

    @BeforeClass
    public void init() {
    initializeProperties();
    initializeBrowser();
    loginPageActions=new LoginPageActions(getDriver());
    }

    @Test
    public void loginUser() throws Exception {
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
    }

    @AfterMethod
    public void tearDown() {
    getDriver().quit();
    }
}
