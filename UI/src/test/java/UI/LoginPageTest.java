package UI;

import Actions.LoginPageActions;
import Actions.SignupActions;
import Utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Base.BrowserInstantiate.*;

public class LoginPageTest  {

    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest extentTest;
    public LoginPageActions loginPageActions;

    @BeforeClass
    public void init() {
    initializeProperties();
    initializeBrowser();
    loginPageActions=new LoginPageActions(getDriver());
        extentReports=ExtentReportManager.getReport();
        extentTest=extentReports.createTest("Login Page Test");

    }

    @Test
    public void loginUser() throws Exception {
        extentTest.log(Status.INFO,"Starting logged in test case.");
        new SignupActions(driver).clickOnLoginButton();
        extentTest.log(Status.INFO,"Clicked on login button");
        loginPageActions.moveToLoginFormAndLogin();
        extentTest.log(Status.INFO,"Moved to login page");
    }

    @AfterMethod
    public void tearDown() {
        extentReports.flush();
        getDriver().quit();
    }
}
