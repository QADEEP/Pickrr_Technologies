package UI;

import actions.HomePageActions;
import actions.LoginPageActions;
import actions.NDROverviewActions;
import actions.SignupActions;
import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.driver;
import static base.BaseTest.getDriver;


public class NDROverviewPageTest {

    @BeforeClass
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();

    }
    @BeforeMethod
    public void login() throws InterruptedException {
        LoginPageActions loginPageActions=new LoginPageActions(getDriver());
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
    }
    @Test
    public void selectNDRCourierWise(){
        HomePageActions homePageActions=new actions.HomePageActions(getDriver());
        homePageActions.closeAdPopOnHomePage();
        NDROverviewActions ndrOverviewActions=new NDROverviewActions(getDriver());
      //  ndrOverviewActions.hoverOnFinanceTabAndClickOnInvoiceTab();


    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
