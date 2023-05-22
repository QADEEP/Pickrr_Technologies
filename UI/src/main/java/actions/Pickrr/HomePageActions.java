package actions.Pickrr;

import base.BaseActions;
import pages.Pickrr.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static pages.Pickrr.HomePage.*;

public class HomePageActions {
    WebDriver driver;

    public HomePageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, HomePage.class);
    }

    public void clickOnRechargeButton() {
        BaseActions.waitAndClick(driver, closeAdsHomePage);
        BaseActions.waitAndClick(driver, homePageRechargeNowButton);
    }

    public void selectRechargeAmount() {
        BaseActions.waitAndClick(driver, selectRechargeAmount);
    }

    public void submitRechargeNowButton() {
        BaseActions.waitAndClick(driver, submitRechargeNowButton);
    }

    public void closeAdPopOnHomePage() {
        BaseActions.waitAndClick(driver, closeAdsHomePage);
    }
}
