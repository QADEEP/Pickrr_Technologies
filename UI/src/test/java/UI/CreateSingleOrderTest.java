package UI;

import actions.CreateSingleOrderActions;
import actions.HomePageActions;
import actions.LoginPageActions;
import actions.SignupActions;
import base.BaseTest;
//import Utils.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.*;

public class CreateSingleOrderTest {

    CreateSingleOrderActions createSingleOrderActions;
    HomePageActions homePageActions;
    @BeforeClass
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();
        createSingleOrderActions=new CreateSingleOrderActions(getDriver());
    }
    @BeforeMethod
    public void login() throws InterruptedException {
        LoginPageActions loginPageActions=new LoginPageActions(getDriver());
        new SignupActions(driver).clickOnLoginButton();
        loginPageActions.moveToLoginFormAndLogin();
    }
     @Test
    public void createSingleOrder(){

    homePageActions=new actions.HomePageActions(getDriver());
    homePageActions.closeAdPopOnHomePage();
    createSingleOrderActions.hoverOnOrdersTabAndClickOnCreateOderTab();
    createSingleOrderActions.enterName("test");
    createSingleOrderActions.enterPhoneNumber("9210938475");
    createSingleOrderActions.enterPincode("110020");
    createSingleOrderActions.enterAddress("H.NO6, tilpat, Palla");
    createSingleOrderActions.clickOnNextButton();
    createSingleOrderActions.enterItemName("fdsf");
    createSingleOrderActions.enterQty("1");
    createSingleOrderActions.enterWeight("1");
    createSingleOrderActions.enterLength("12");
    createSingleOrderActions.enterBreadth("13");
    createSingleOrderActions.enterHeight("14");
    createSingleOrderActions.enterInvoiceValue("1234");
    createSingleOrderActions.clickOnNextButton();
    createSingleOrderActions.clickOnProceedButton();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
