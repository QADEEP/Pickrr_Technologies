package UI.Amazon;

import actions.Amazon.LoginAmazonPageAction;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static base.BaseTest.*;

public class LoginAmazonTest {

    LoginAmazonPageAction loginAmazonPageAction;
    @BeforeClass
    public void init() {
        initializeProperties();
        initializeBrowser();
        loginAmazonPageAction= new LoginAmazonPageAction(getDriver());
    }

    @Test
    public void verifyAmazonLogin() throws InterruptedException {
        loginAmazonPageAction.signInButton();
        loginAmazonPageAction.enterEmail("deep@pickrr.com");
        loginAmazonPageAction.clickOnContinue();
        loginAmazonPageAction.enterPassword("dnsj");
        loginAmazonPageAction.clickOnSignIn();
    }

}
