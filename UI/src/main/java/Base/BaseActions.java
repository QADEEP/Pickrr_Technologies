package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Base.BrowserInstantiate.driver;


public class BaseActions {
    public static Duration MAX_ELEMENT_SEARCH_TIMEOUT = Duration.ofSeconds(10);
    public static void waitAndClick(WebElement element){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    public static void waitAndClick(WebDriver driver, By element) {

            WebDriverWait wait = new WebDriverWait(driver, MAX_ELEMENT_SEARCH_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public static void ClearAndSendKeys(WebDriver driver, By element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, MAX_ELEMENT_SEARCH_TIMEOUT);
            WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputBox.clear();
            inputBox.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    public static void ClearAndSendKeys(WebDriver driver, WebElement element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, MAX_ELEMENT_SEARCH_TIMEOUT);
            WebElement inputBox = wait.until(ExpectedConditions.visibilityOf(element));
            inputBox.clear();
            inputBox.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }
    public static void clearAndSendKeys(WebDriver driver, By element, String text){
        driver.findElement(element).clear();

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.findElement(element).sendKeys(text);
    }

}
