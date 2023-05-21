package actions.Pickrr;

import base.BaseActions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Pickrr.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import static base.BaseTest.properties;
import static org.apache.poi.xddf.usermodel.TileFlipMode.X;
import static pages.Pickrr.HomePage.closeAdsHomePage;
import static pages.Pickrr.LoginPage.*;

public class LoginPageActions {
    WebDriver driver = null;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, LoginPage.class);
    }

    public void enterUserName(String userName) {
        BaseActions.clearAndSendKeys(driver, userEmail, userName);
    }
//
    public void enterPassword(String password) {
        BaseActions.clearAndSendKeys(driver, userPassword, password);
    }
//
    public void clickLoginTab() throws InterruptedException {
        BaseActions.waitAndClick(driver, loginButton);

        Thread.sleep(5000);
    }

    public void clickLoginButton() throws InterruptedException {
        BaseActions.waitAndClick(driver, loginButton);
        Thread.sleep(3000);
        BaseActions.waitAndClick(driver, closeAdsHomePage);
    }

    public void closeAdPopup() {
        BaseActions.waitAndClick(driver, adPopUp);
    }

    public void moveToLoginFormAndLogin() throws InterruptedException {
        String parentWindow=driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> I =set.iterator();
        while (I.hasNext()){
            String childWindow=I.next();
            if(!parentWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
                closeAdPopup();
                enterUserName(properties.getProperty("userName"));
                enterPassword(properties.getProperty("userPassword"));
                clickLoginButton();
            }
        }
    }


    WebDriver driver1= new ChromeDriver();

    public void takeScreenshot(){
    TakesScreenshot screenshot= (TakesScreenshot)driver;

    File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
    String destination="C/hds/sdhsj/";
    //FileUtils.copyFile(screenshotFile,new File(destination));
}

}