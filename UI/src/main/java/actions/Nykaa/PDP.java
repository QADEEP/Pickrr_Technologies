package actions.Nykaa;

import base.BaseActions;
import pages.Nykaa.HomePage;

import static base.BaseTest.driver;
import static pages.Nykaa.HomePage.carticon;
import static pages.Nykaa.PDP.proceed;

public class PDP {
    public void clickOnCartIcon(){
        BaseActions.waitAndClick(driver,carticon);
    }
    public void clickOnProceedButton(){
        BaseActions.waitAndClick(driver,proceed);
    }

    public void writeReview(){

    }
}
