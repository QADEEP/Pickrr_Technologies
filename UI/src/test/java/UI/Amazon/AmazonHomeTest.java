package UI.Amazon;

import actions.Amazon.AmazonHomePageActions;
import actions.Amazon.LoginAmazonPageAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.*;

public class AmazonHomeTest {

    AmazonHomePageActions amazonHomePageActions;
    @BeforeMethod
    public void init(){
        initializeProperties();
        initializeBrowser();
    }
    @Test
    public void buyFireStick() throws InterruptedException {
        amazonHomePageActions=new AmazonHomePageActions();
        amazonHomePageActions.clickOnAll();
        amazonHomePageActions.clickOnFireStick();
        amazonHomePageActions.clickOnFireTv4K();
        amazonHomePageActions.buyNowButton();
        LoginAmazonPageAction loginAmazonPageAction=new LoginAmazonPageAction(driver);
        loginAmazonPageAction.enterEmail("xd");
        loginAmazonPageAction.clickOnContinue();
        loginAmazonPageAction.enterPassword("Dcdc#200");
        loginAmazonPageAction.clickOnSignIn();

    }
}
