package actions;

import base.BaseActions;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

import static base.BaseTest.properties;
import static pages.HomePage.closeAdsHomePage;
import static pages.LoginPage.*;

public class LoginPageActions {
    WebDriver driver = null;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, LoginPage.class);
    }

    public void enterUserName(String userName) {
        BaseActions.clearAndSendKeys(driver, userEmail, userName);
    }

    public void enterPassword(String password) {
        BaseActions.clearAndSendKeys(driver, userPassword, password);
    }

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

}

