package pages.Pickrr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancePage {
    @FindBy(xpath = "//div[@role='menuitem'][contains(@aria-controls,'manage-finance-popup')]")
    public static WebElement sideMenuFinanceTab;
    @FindBy (xpath="//li[@role='menuitem']//a[contains(text(),'Invoice')]")
    public static WebElement invoiceTab;
}
