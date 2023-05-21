//package UI.Pickrr;
//
//import actions.Pickrr.LoginPageActions;
//import actions.Pickrr.SignupActions;
//import base.BaseTest;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.Iterator;
//import java.util.Set;
//
//import static base.BaseTest.*;
//
//public class SignupPageTest  {
//    LoginPageActions loginPageActions;
//    SignupActions signupActions;
//    @BeforeClass
//    public void init(){
//        BaseTest.initializeProperties();
//        BaseTest.initializeBrowser();
//        signupActions=new SignupActions(getDriver());
//    }
//    @Test
//    public void signup(){
//        signupActions.clickOnSignupBtn();
//        //logPass("signup button clicked successfully");
//        String parentWindow=driver.getWindowHandle();
//        Set<String> set= driver.getWindowHandles();
//        Iterator<String> I=set.iterator();
//        while (I.hasNext()){
//            String childWindow=I.next();
//            if(!parentWindow.equals(childWindow))
//            {
//                driver.switchTo().window(childWindow);
//                signupActions.enterFirstName(properties.getProperty("firstname"));
//                signupActions.enterLastName(properties.getProperty("lastname"));
//                signupActions.companyName(properties.getProperty("companyname"));
//                signupActions.email(properties.getProperty("email"));
//                signupActions.password(properties.getProperty("password"));
//                signupActions.signup();
//            }
//        }
//
//    }
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
//}
