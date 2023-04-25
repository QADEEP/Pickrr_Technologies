package Pages;

import org.openqa.selenium.By;

public class HomePage {

    public static By closeAdsHomePage= By.xpath("//span[@class='ant-modal-close-x']");
    public static By homePageCreateButton=By.xpath("//button[@type='button']//span[contains(text(),'Create')]");
    public static By homePageRechargeNowButton=By.xpath("//button[@class='sc-ptBTV eEIUK']");
    public static By selectRechargeAmount= By.xpath("//button[@type='button']//span[contains(text(),'2000')]");
    public static By submitRechargeNowButton=By.xpath("//button[@type='button']//span[contains(text(),'Recharge Now')]");
}
