package UI;

import actions.ParaSignupActions;
import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.getDriver;

public class ParaSignupTest {
    ParaSignupActions paraSignupActions;
    @BeforeMethod
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();
        paraSignupActions=new ParaSignupActions(getDriver());
    }

    @Test
    public void signup(){
        paraSignupActions.clickOnRegisterLink();
        paraSignupActions.enterFirstName("test");
        paraSignupActions.enterLastName("deep");
        paraSignupActions.enterAddress("surya");
        paraSignupActions.enterCity("faridabad");
        paraSignupActions.enterState("haryana");
        paraSignupActions.enterZipCode("121003");
        paraSignupActions.enterPhone("9090284940");
        paraSignupActions.enterUserName("hu");
        paraSignupActions.enterPassword("hu");
        paraSignupActions.enterConfirmPassword("hu");
        paraSignupActions.clickRegisterButton();
    }

    @AfterMethod
    public void tearDown(){
        getDriver().quit();
    }

}
