package actions.Pickrr;

import base.BaseActions;
import pages.Pickrr.CreateSingleOrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static pages.Pickrr.CreateSingleOrderPage.*;

public class CreateSingleOrderActions {
    WebDriver driver;

    public CreateSingleOrderActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, CreateSingleOrderPage.class);
    }

    public static By closeAdsHomePage = By.xpath("//span[@class='ant-modal-close-x']");

    public void hoverOnOrdersTabAndClickOnCreateOderTab() {
        Actions hover = new Actions(driver);
        hover.moveToElement(sideMenuOrderTab).perform();
        BaseActions.waitAndClick(createOrder);
        // hover.click(createOrder);
    }

    public void enterName(String name) {
        BaseActions.clearAndSendKeys(driver, customerName, name);
    }

    public void enterPhoneNumber(String mobileNumber) {
        BaseActions.clearAndSendKeys(driver, customerphoneNumber, mobileNumber);
    }

    public void enterPincode(String pincode) {
        BaseActions.clearAndSendKeys(driver, customerPincode, pincode);
    }

    public void enterAddress(String address) {
        BaseActions.clearAndSendKeys(driver, customerAdress, address);
    }

    public void clickOnNextButton() {
        BaseActions.waitAndClick(driver, nextButton);
    }

    public void enterItemName(String itemName) {
        BaseActions.clearAndSendKeys(driver, customeritemName, itemName);
    }

    public void enterQty(String qty) {
        BaseActions.clearAndSendKeys(driver, choosedQty, qty);
    }

    public void enterWeight(String weight) {
        BaseActions.clearAndSendKeys(driver, choosedWeight, weight);
    }

    public void enterLength(String length) {
        BaseActions.clearAndSendKeys(driver, choosedLength, length);
    }

    public void enterBreadth(String breadth) {
        BaseActions.clearAndSendKeys(driver, choosedBreadth, breadth);
    }

    public void enterHeight(String height) {
        BaseActions.clearAndSendKeys(driver, choosedHeight, height);
    }

    public void enterInvoiceValue(String invoiceValue) {
        BaseActions.clearAndSendKeys(driver, orderInvoiceValue, invoiceValue);
    }

    public void clickOnProceedButton() {

        BaseActions.waitAndClick(driver, continueButton);
    }
}
