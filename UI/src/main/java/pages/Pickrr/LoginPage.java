package pages.Pickrr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static By loginButton=By.xpath("//button/span[contains(text(),'Login')]");
    public static By userEmail=By.xpath("//input[@id='email']");
    public static By userPassword=By.xpath("//input[@id='password']");
    public static By adPopUp=By.xpath("//div[@class='dialog-btn-grp']/button");


    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        // Create an instance of the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dashboard.pickrr.com/sign-in");

        // Find the username and password fields using JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement later=(WebElement)jsExecutor.executeScript("document.querySelector(\"#wigzo-push-opt-in > div > div > div.dialog-footer > div.dialog-btn-grp > button.wig-btn-later.ng-binding\");");
        //WebElement usernameField = (WebElement) jsExecutor.executeScript("return document.getElementById('email');");
        WebElement username = (WebElement) jsExecutor.executeScript("return document.evaluate(\"//input[@id='email']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
        WebElement passwordField = (WebElement) jsExecutor.executeScript("return document.evaluate(\"//input[@id='password']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
        //WebElement passwordField = (WebElement) jsExecutor.executeScript("return document.getElementById('password');");
       // WebElement login = (WebElement) jsExecutor.executeScript("return document.getElementByTagName('button');");
        // Enter the username and password
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",later);
        username.sendKeys("g.mangla911@gmail.com");
        passwordField.sendKeys("complex@1357");
        // Submit the form using JavaScript
        WebElement login=(WebElement)jsExecutor.executeScript("return document.querySelector(\"#login-form > div:nth-child(4) > div > div > div > button\"));");
        jsExecutor.executeScript("arguments[0].click();",later);
        // Wait for the page to load (you can use explicit waits or other techniques)

        // Verify the login was successful
        String expectedUrl = "https://dashboard.pickrr.com/dashboard";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();

//        // Navigate to the login page
//        driver.get("https://dashboard.pickrr.com/sign-in");
//        // Find the username and password fields using JavaScript
//
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        WebElement login = (WebElement) jsExecutor.executeScript("return document.getElementByTagName('button');");
//        WebElement usernameField = (WebElement)jsExecutor.executeScript("return document.getElementById('email');");
//        WebElement passwordField = (WebElement)jsExecutor.executeScript("return document.getElementById('password');");
//
//        // Enter the username and password
//        login.click();
//        usernameField.sendKeys("g.mangla911@gmail.com");
//        passwordField.sendKeys("complex@1357");
//        // Submit the form using JavaScript
//
//
//
//        // Wait for the page to load (you can use explicit waits or other techniques)
//
//        // Verify the login was successful
//        String expectedUrl = "https://dashboard.pickrr.com/dashboard";
//        String actualUrl = driver.getCurrentUrl();
//        if (actualUrl.equals(expectedUrl)) {
//            System.out.println("Login successful!");
//        } else {
//            System.out.println("Login failed!");
//        }

        // Close the browser
        driver.quit();
    }
    }

