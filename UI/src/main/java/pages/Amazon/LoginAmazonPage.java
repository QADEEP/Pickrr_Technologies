package pages.Amazon;

import org.openqa.selenium.By;

public class LoginAmazonPage {

    public static By myAccountHover= By.xpath("//a[@id='nav-link-accountList']");
    public static By signInButton=By.xpath("//*[@id='nav-signin-tooltip']/a/span");
    public static By email=By.xpath("//input[@name='email']");
    public static By continueButton=By.xpath("//input[@id='continue']");

    public static By password=By.xpath("//input[@name='password']");
    public static By signIn=By.xpath("//input[@id='signInSubmit']");
    public static By cod=By.xpath("//span/span[contains(text(),'Cash on Delivery/Pay on Delivery')][1]");
    public static By useThisPaymentMethod=By.xpath("//span[@id='pp-xe5Pj7-144']");
    public static By checkoutTextVerify=By.xpath("//div[@class='a-column a-span8']/h1[contains(text(),'Checkout')]");
    public static By reviewAndItemDelivery=By.xpath("//div[@aria-label='Review items and delivery']//h3");
}
