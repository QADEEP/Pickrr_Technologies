package actions.Pickrr;

import base.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

import static pages.Pickrr.NDROverviewPage.*;

public class NDROverviewActions {
    WebDriver driver;

    public NDROverviewActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, NDROverviewActions.class);
    }

    public void hoverOnNDRTabAndClickOnNDROverviewTab() {

        Actions hover = new Actions(driver);
        hover.moveToElement(sideMenuNDRTab).perform();
        BaseActions.waitAndClick(ndrOverview);
         //hover.click(ndrOverview);
    }
    public void clickOnAllFilter() {
        BaseActions.waitAndClick(driver, allFilter);
    }

    public void selectCourier(String courierName) {
        Select select = new Select(selectCourier);
        select.selectByValue(courierName);
    }

    public void selectNDRReason(String reason) {
        Select select = new Select(selectNDRReason);
        select.selectByValue(reason);
    }

    public void selectAttemptCount(String count) {
        Select select = new Select(selectAttemptCount);
        select.selectByValue(count);
    }

    public void selectFromDate(String fromDate) {
        Select select = new Select(startDate);
        select.selectByValue(fromDate);
        //BaseActions.ClearAndSendKeys(fromDate);

    }

    public void latestNDRDate(Date latestDate) {
        Select select = new Select(endDate);
        select.selectByValue(String.valueOf(latestDate));
    }

}
