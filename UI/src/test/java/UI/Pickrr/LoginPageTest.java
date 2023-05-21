package UI.Pickrr;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.Listeners.class)
public class LoginPageTest extends BaseTest {

   // public LoginPageActions loginPageActions;
    JavascriptExecutor js=(JavascriptExecutor)driver;

    @BeforeClass
    public void init() {
    initializeProperties();
    initializeBrowser();
   // loginPageActions=new LoginPageActions(getDriver());

    }

    @Test(dataProvider = "user creds")
    public void login(){
        WebElement username=(WebElement) js.executeScript("document.getElementByID('email')");
        username.sendKeys("g.mangla911@gmail.com");
        WebElement password=(WebElement) js.executeScript("document.getElementByID('password').value='complex1357';");
//        WebElement username = (WebElement) js.executeScript("return document.evaluate(\"//input[@id='email']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
//        username.sendKeys("test@gmail.com");
//        WebElement password = (WebElement) js.executeScript("return document.evaluate(\"//input[@id='email']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
//        password.sendKeys("deep123");
    }

//    @Test
//    public void loginUser() throws Exception {
//
//        new SignupActions(driver).clickOnLoginButton();
//
//        loginPageActions.moveToLoginFormAndLogin();
//    }
//
//    @Test
//    public void loginUser1() throws Exception {
//        new SignupActions(driver).clickOnLoginButton();
//        loginPageActions.moveToLoginFormAndLogin();
//    }
//    @Test
//    public void loginUser2() throws Exception {
//        System.out.println("pass ho gya to !!");
//
//    }
//    @Test
//    public void loginUser3() throws Exception {
//        throw new SkipException("skip ho ja ");
//    }


    @Test
    public void m1(){
        System.out.println("m1");
    }
    @Test
    public void m2(){
        System.out.println("m2");
    }
    @Test(dependsOnMethods = "m2")
    public void m4(){
        System.out.println("m4");
    }

    @Test(dependsOnMethods = "m4")
    public void m6(){
        System.out.println("m6");
    }

    @Test
    public void m10(){
        System.out.println("m10");
    }
}
