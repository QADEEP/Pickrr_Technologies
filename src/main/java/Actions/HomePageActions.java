package Actions;

import Base.BaseActions;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Pages.HomePage.*;

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
