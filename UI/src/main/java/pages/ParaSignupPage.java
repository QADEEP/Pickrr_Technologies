package pages;

import org.openqa.selenium.By;

public class ParaSignupPage {

    public static By register=By.xpath("//*[@id='loginPanel']/p[2]/a");
    public static By firstName=By.xpath("//input[@id='customer.firstName']");
    public static By lastName=By.xpath("//input[@id='customer.lastName']");
    public static By address=By.xpath("//input[@id='customer.address.street']");
    public static By city=By.xpath("//input[@id='customer.address.city']");
    public static By state=By.xpath("//input[@id='customer.address.state']");
    public static By zipCode=By.xpath("//input[@id='customer.address.zipCode']");
    public static By phoneNumber=By.xpath("//input[@id='customer.phoneNumber']");
    public static By userName=By.xpath("//input[@id='customer.username']");
    public static By password=By.xpath("//input[@id='customer.password']");
    public static By confirmPassword=By.xpath("//input[@id='repeatedPassword']");
    public static By registerButton=By.xpath("//input[@value='Register']");

}
