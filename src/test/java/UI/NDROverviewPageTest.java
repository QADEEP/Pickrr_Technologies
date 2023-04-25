package UI;

import Actions.HomePageActions;
import Actions.LoginPageActions;
import Actions.NDROverviewActions;
import Actions.SignupActions;
import Base.BrowserInstantiate;
import Utils.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Base.BrowserInstantiate.driver;
import static Base.BrowserInstantiate.getDriver;


public class NDROverviewPageTest extends BaseClass {

    @BeforeClass
    public void init(){
        BrowserInstantiate.initializeProperties();
        BrowserInstantiate.initializeBrowser();

    }
    @BeforeMethod
    public void login() throws InterruptedException {
        LoginPageActions loginPageActions=new LoginPageActions(getDriver());
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
    }
    @Test
    public void selectNDRCourierWise(){
        HomePageActions homePageActions=new Actions.HomePageActions(getDriver());
        homePageActions.closeAdPopOnHomePage();
        NDROverviewActions ndrOverviewActions=new NDROverviewActions(getDriver());
      //  ndrOverviewActions.hoverOnFinanceTabAndClickOnInvoiceTab();


    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
