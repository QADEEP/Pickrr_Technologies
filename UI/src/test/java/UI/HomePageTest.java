package UI;

import Actions.HomePageActions;
import Actions.LoginPageActions;
import Actions.SignupActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Base.BrowserInstantiate.*;
public class HomePageTest  {
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
