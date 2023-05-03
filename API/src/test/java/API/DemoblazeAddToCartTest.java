package API;

import APIPayloads.DemoblazeAddToCartPayload;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoblazeAddToCartTest {

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
    }

    @Test
    public void parseJsonObject(){

    }
}
