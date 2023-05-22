package actions.Amazon;

import base.BaseActions;
import org.openqa.selenium.support.PageFactory;
import pages.Amazon.AmazonHomePage;

import static base.BaseTest.driver;
import static pages.Amazon.AmazonHomePage.*;

public class AmazonHomePageActions {
    public AmazonHomePageActions() {
        PageFactory.initElements(driver , AmazonHomePage.class);
    }

    public void clickOnAll(){
        BaseActions.waitAndClick(driver,sideMenu);
    }
    public void clickOnFireStick(){
        BaseActions.waitAndClick(driver,fireTv);
    }
    public void clickOnFireTv4K(){
        BaseActions.waitAndClick(driver,fireTvStick4K);
    }
    public void buyNowButton(){
        BaseActions.waitAndClick(driver,buyNow);
    }
}
