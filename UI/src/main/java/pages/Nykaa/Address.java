package pages.Nykaa;

import base.BaseTest;
import org.openqa.selenium.By;

public class Address {
    public static By pincode=By.xpath("//input[@placeholder='Pincode']");
    public static By houseNo=By.xpath("//input[@placeholder='House/ Flat/ Office No.']");
    public static By area=By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']");
    public static By shiptoAddress;
}
