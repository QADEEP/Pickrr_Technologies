package pages.Nykaa;

import org.openqa.selenium.By;

public class SignInNykaa {
    public static By signInButton=By.xpath("//div[@class='css-1tny7j1 e1ewpqpu0']//button[contains(text(),'Sign')]");
    public static By signInWithMobileEMail=By.xpath("//div[@class='css-1fzowby']//button[contains(text(),'Sign in with Mobile / Email')]");
    public static By enterEmailorMobile=By.xpath("//input[@name='emailMobile']");
    public static By proceed=By.xpath("//button[@id='submitVerification']");
    public static By name=By.xpath("//input[@name='userName']");
    public static By phoneNumber= By.xpath("//input[@name='phoneNumber']");
    public static By register=By.xpath("//button[@class='button big fill full mt60 false']");

}
