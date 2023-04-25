package UI;

import Actions.HomePageActions;
import Actions.LoginPageActions;
import Actions.SignupActions;
import Utils.BaseClass;
import org.testng.annotations.*;

import static Base.BrowserInstantiate.*;
public class HomePageTest extends BaseClass {
    HomePageActions homePageActions;
    @BeforeClass
    public void init() {
        initializeProperties();
        initializeBrowser();
        homePageActions=new HomePageActions(getDriver());
    }

    @BeforeMethod
    public void login() throws InterruptedException {
    LoginPageActions loginPageActions=new LoginPageActions(getDriver());
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
}

    @Test
    public void rechargeFromHomePage() throws InterruptedException {
        homePageActions.clickOnRechargeButton();
        homePageActions.selectRechargeAmount();
        homePageActions.submitRechargeNowButton();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
