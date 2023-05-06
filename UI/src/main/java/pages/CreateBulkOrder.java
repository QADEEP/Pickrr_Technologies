package pages;

import org.openqa.selenium.By;

public class CreateBulkOrder {
    public static By createBulkOrderButton= By.xpath("//button//span[contains(text(),'Create Bulk')]");
    public static By nextButton=By.xpath("//button[@type='submit']");
    public static By downloadButton=By.xpath("//button/span[contains(text(),'Download')]");
    public static By uploadButton=By.xpath("//div[@class='sc-AxmLO gmtmqV']/button");
    public static By selectCourier=By.xpath("//input[@type='radio' and @value='[105,108]']");
    public static By enterEmailId=By.xpath("//input[@placeholder='Enter Email ID']");

}
