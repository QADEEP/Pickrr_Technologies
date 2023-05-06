package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSingleOrderPage {

    @FindBy(xpath = "//div[@role='menuitem'][contains(@aria-controls,'order-management-popup')]")
    public static WebElement sideMenuOrderTab;
    @FindBy (xpath="//li[@role='menuitem']//a[contains(text(),'Create Order')]")
    public static WebElement createOrder;
    public static By customerName=By.xpath("//input[@placeholder='Enter customer name']");
    public static By customerphoneNumber=By.xpath("//input[@placeholder='Enter customer mobile number']");
    public static By customerPincode=By.id("to_pincode");
    public static By customerAdress=By.id("to_address");
    public static By nextButton=By.xpath("//button[@type='submit']");
    public static By customeritemName=By.xpath("//input[@placeholder='Item Name']");
    public static By choosedQty=By.xpath("//input[@placeholder='Qty.']");
    public static By choosedWeight=By.xpath("//input[@placeholder='kg']");
    public static By choosedLength=By.xpath("//input[@placeholder='Length']");
    public static By choosedBreadth=By.xpath("//input[@placeholder='Breadth']");
    public static By choosedHeight=By.xpath("//input[@placeholder='Height']");
    public static By orderInvoiceValue=By.xpath("//input[@id='invoice_value']");
    public static By proceedButton=By.xpath("//span[contains(text(),'Proceed')]");
    public static By continueButton=By.xpath("//span[contains(text(),'Create Order')]");

}
