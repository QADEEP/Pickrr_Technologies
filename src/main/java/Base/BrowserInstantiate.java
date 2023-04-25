package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BrowserInstantiate {
    public static Logger log;
    public static WebDriver driver;
    public static Properties properties;
    public static void initializeProperties(){
        log= LogManager.getLogger(BrowserInstantiate.class);
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
    public static WebDriver getDriver(){
        return driver;
    }
}
