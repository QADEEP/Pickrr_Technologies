package UI.Nykaa;

import actions.Nykaa.HomePageAction;
import actions.Nykaa.PDP;
import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.BaseTest.driver;

public class HomePageTest {

    @BeforeMethod
    public void init(){
        BaseTest.initializeProperties();
        BaseTest.initializeBrowser();
    }

    @Test
    public void placeOrder(){
        HomePageAction homePageAction=new HomePageAction(driver);
        homePageAction.searchItem();
        homePageAction.clickOnProduct();
        homePageAction.movetoNewTab();
        homePageAction.addToBag();
        homePageAction.clickOnCartIcon();
        PDP pdp=new PDP();
        pdp.clickOnProceedButton();
    }
    @AfterMethod
    public void tearDown(){
     driver.quit();
    }
}
