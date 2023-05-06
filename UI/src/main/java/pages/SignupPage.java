package pages;

import org.openqa.selenium.By;

public class SignupPage {
    public static By signupbtn= By.xpath("//ul[@class='navbar-nav me-auto mb-2 mb-lg-0']//li[5]");
    public static By loginBtn=By.xpath("//ul[@class='navbar-nav me-auto mb-2 mb-lg-0']//li[6]");
    public static By firstName=By.xpath("//input[@name='first_name']");
    public static By lastName=By.xpath("//input[@name='last_name']");
    public static By companyName=By.xpath("//input[@name='company_name']");
    public static By email=By.xpath("//input[@name='email']");
    public static By password=By.xpath("//input[@name='password']");
    public static By signupForFreeBtn=By.xpath("//button[contains(text(),'Sign up for Free')]");

}
