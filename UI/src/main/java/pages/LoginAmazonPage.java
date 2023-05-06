package pages;

import org.openqa.selenium.By;

public class LoginAmazonPage {

    public static By myAccountHover= By.xpath("//a[@id='nav-link-accountList']");
    public static By signInButton=By.xpath("//*[@id='nav-flyout-ya-signin']/a/span");
    public static By email=By.xpath("//input[@name='email']");
    public static By continueButton=By.xpath("//input[@id='continue']");

    public static By password=By.xpath("//input[@name='password']");
    public static By signIn=By.xpath("//input[@id='signInSubmit']");

}
