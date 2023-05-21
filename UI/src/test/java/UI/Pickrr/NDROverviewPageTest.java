package UI.Pickrr;

import actions.Pickrr.HomePageActions;
import actions.Pickrr.LoginPageActions;
import actions.Pickrr.NDROverviewActions;
import actions.Pickrr.SignupActions;
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
        HomePageActions homePageActions=new HomePageActions(getDriver());
        homePageActions.closeAdPopOnHomePage();
        NDROverviewActions ndrOverviewActions=new NDROverviewActions(getDriver());
      //  ndrOverviewActions.hoverOnFinanceTabAndClickOnInvoiceTab();


    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
