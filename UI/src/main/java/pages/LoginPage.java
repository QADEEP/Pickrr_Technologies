package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By loginButton=By.xpath("//button/span[contains(text(),'Login')]");
    public static By userEmail=By.xpath("//input[@id='email']");
    public static By userPassword=By.xpath("//input[@id='password']");
    public static By adPopUp=By.xpath("//div[@class='dialog-btn-grp']/button");

}
