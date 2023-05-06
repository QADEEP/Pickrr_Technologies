package UI;

import actions.LoginPageActions;
import actions.SignupActions;
import base.BaseTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

@Listeners(listeners.Listeners.class)
public class LoginPageTest extends BaseTest {

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

    @Test
    public void loginUser1() throws Exception {
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
    }
    @Test
    public void loginUser2() throws Exception {
        System.out.println("pass ho gya to !!");

    }
    @Test
    public void loginUser3() throws Exception {
        throw new SkipException("skip ho ja ");
    }

}
