package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NDROverviewPage {
    @FindBy(xpath = "//div[@role='menuitem'][contains(@aria-controls,'manage-ndr-popup')]")
    public static WebElement sideMenuNDRTab;
    @FindBy (xpath="//li[@role='menuitem']//a[contains(text(),'NDR Overview')]")
    public static WebElement ndrOverview;
    public static By allFilter= By.xpath("//button//span[contains(text(),'All Filter')]");
    public static By dropDownLatestNDR= By.xpath("//span[contains(text(),'Latest NDR Date')]");
    @FindBy(xpath = "//input[@placeholder='Start date']")
    public static WebElement startDate;
    @FindBy(xpath = "//input[@placeholder='End date']")
    public static WebElement endDate;

    public static By trackingID= By.xpath("//span[@title='Tracking ID']");
    public static By pendingTab= By.xpath("//div[contains(text(),'Pending')]");
    public static By initiatedTab= By.xpath("//div[contains(text(),'Initiated')]");
    public static By closedTab= By.xpath("//div[contains(text(),'Closed')]");

    @FindBy(xpath = "//span[contains(text(),'Select Courier')]")
    public static WebElement selectCourier;

    @FindBy(xpath = "//span[contains(text(),'NDR Reason')]")
    public static WebElement selectNDRReason;
    @FindBy(xpath = "//span[contains(text(),'Attempt Count')]")
    public static WebElement selectAttemptCount;

}
