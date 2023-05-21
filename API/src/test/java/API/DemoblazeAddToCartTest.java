package API;

import apiPayloads.DemoblazeAddToCartPayload;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoblazeAddToCartTest {

    WebDriver driver;
    @BeforeMethod
    public void url(){
        RestAssured.baseURI="https://api.demoblaze.com";
        RestAssured.basePath="/addtocart";
    }
    @Test
    public static void verifyAddToCart(){
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("content-type","application/json");
        requestSpecification.body(new Gson().toJson(DemoblazeAddToCartPayload.setBody()));
        Response response=requestSpecification.post();
        response.getBody().asPrettyString();
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals("name","name");
    }

    @Test
    public void dummy(){
        driver.findElements(By.xpath(""));

    }
}
