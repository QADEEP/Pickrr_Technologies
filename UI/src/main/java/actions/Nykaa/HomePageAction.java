package actions.Nykaa;

import base.BaseActions;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.Nykaa.HomePage;
import pages.Nykaa.PDP;
import pages.Nykaa.ProductListingPage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static base.BaseTest.driver;
import static base.BaseTest.getDriver;
import static pages.Nykaa.PDP.addToBag;

public class HomePageAction {
    public WebDriver driver;
     HomePageAction homePageAction;

    public HomePageAction(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, HomePage.class);
    }
    public void getHeaderDropdown(){

       List<WebElement> headers =getDriver().findElements(HomePage.dropDownHeading);
       int count=headers.size();
       for(int i=0;i<=headers.size();i++){

       }
    }
    public void searchItem(){
    driver.findElement(HomePage.search).sendKeys("lipstick");
    driver.findElement(HomePage.search).sendKeys(Keys.ENTER);
    }
    public void clickOnProduct(){
        driver.findElement(ProductListingPage.product).click();
    }
    public void movetoNewTab(){
        String parent =driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I= s.iterator();
        while(I.hasNext()){
            String child= I.next();
            if(!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
            }
        }
    }
    public void addToBag(){
        BaseActions.waitAndClick(driver,addToBag);
    }
    public void clickOnCartIcon(){
        BaseActions.waitAndClick(driver,HomePage.carticon);
    }
}
