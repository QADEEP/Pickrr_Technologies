package UI.Dummy;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.driver;

public class Class1 {

    @BeforeMethod
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();
    }
    @Test
    public void action() throws InterruptedException {
        WebElement googleSearch=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

        Actions actions=new Actions(driver);

        actions.sendKeys("selenium").click().build().perform();
        //actions.keyDown(Keys.ENTER).build().perform();
        WebElement search=driver.findElement(By.xpath("//input[@value='Google Search']"));
        search.click();
        WebElement resultPage=driver.findElement(By.xpath("//div[@class='SPZz6b']//span[contains(text(),'Sel')]"));
        Assert.assertEquals(resultPage.getText(),"Selenium");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

