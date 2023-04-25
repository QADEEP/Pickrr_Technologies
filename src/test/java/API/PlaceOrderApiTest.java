package API;


import APIPayloads.PlaceOrderPayload;
import ApiResponse.PlaceOrderResponse;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.internal.multipart.MultiPartSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class PlaceOrderApiTest {
   public PlaceOrderResponse placeOrderResponse;

    @BeforeMethod
    public void apiUrl(){
        RestAssured.baseURI="https://www.pickrr.com";
        RestAssured.basePath="/api/place-order/";
    }
    @Test
    public void verifyPlaceOrder(){
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Content-Type","application/json");
        //requestSpecification.log().all();
        requestSpecification.multiPart(new File("src/main/resources/lost.csv"));
        MultiPartSpecification multiPartSpecification=new MultiPartSpecificationImpl();
        requestSpecification.multiPart()





        PlaceOrderPayload placeOrderPayload=new PlaceOrderPayload();
        requestSpecification.body(new Gson().toJson(PlaceOrderPayload
                .placeOrderSetBody(LoginApi.loginAndReturnObject().getAuth_token()))).log().all();
        Response response=requestSpecification.post();
        Assert.assertEquals(response.getStatusCode(),200);
        response.getBody().prettyPrint();
        placeOrderResponse=new Gson().fromJson(response.getBody().asString(),PlaceOrderResponse.class);
        System.out.println(placeOrderResponse.getOrderId());
        }
        @Test(priority = 1)
         public void verifyClientId(){
            System.out.println(placeOrderResponse.getClientOrderId());
        }
    }
