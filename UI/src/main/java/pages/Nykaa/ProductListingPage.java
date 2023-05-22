package pages.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
    public static By product=By.xpath("//*[@id='product-list-wrap']//a[contains(@href,'pps=11')]");
    public static By sortBy=By.xpath("//span[@class='sort-name']");

}
