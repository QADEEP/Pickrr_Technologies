package base;

import reporting.Reporter;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;


public class BaseTest {
    public static Logger log;
    public static WebDriver driver;
    public static Properties properties;
    public static WebDriver getDriver(){
        return driver;
    }
    public static void initializeProperties(){
        log= LogManager.getLogger(BaseTest.class);
        properties=new Properties();
        try {
            FileInputStream fileInputStream=new FileInputStream("src/main/resources/BaseProperties.properties");
            properties.load(fileInputStream);
            log.info("Property file loaded");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Property not loaded");
        }
    }

    public static void initializeBrowser()  {
        String browserName=properties.getProperty("browser");
        log.info("Browser set from propert file");

        switch(browserName){
            case("FF"):
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            case("safari"):
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            case("edge"):
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            default:
                WebDriverManager.chromedriver().setup();
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                log.info("Browser setup complete");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        driver.get(properties.getProperty("url"));
    }

    public void failedScreenShots(String testMethodName)  {
        System.out.println("This is my timestamp :" );
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("src/main/screenShot/"+ testMethodName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @BeforeMethod
    public void initMethods(Method methodName){
        Reporter.setExtentTest(methodName.getName());
    }
    @AfterMethod
    public void getTestCaseStatus(ITestResult iTestResult) {
        if(iTestResult.getStatus()==ITestResult.SUCCESS){
            Reporter.setTestcaseStatus(Status.PASS,"Test case is Passed",iTestResult.getTestName());
        }else if(iTestResult.getStatus()==ITestResult.FAILURE){
            Reporter.setTestcaseStatus(Status.FAIL,"Test case is Failed",iTestResult.getTestName());
        }else if(iTestResult.getStatus()==ITestResult.SKIP){
            Reporter.setTestcaseStatus(Status.SKIP,"Test case is Skipped",iTestResult.getTestName());
        }
    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }
}
