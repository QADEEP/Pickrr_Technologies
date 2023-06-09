package API.Pickrr;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.internal.multipart.MultiPartSpecificationImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static apiPayloads.PlaceOrderPayload.placeOrderSetBody;
import static org.apache.commons.compress.harmony.pack200.PackingUtils.log;

public class PlaceOrderApiTest {
//    public PlaceOrderResponse placeOrderResponse;

    @BeforeMethod
    public void apiUrl(){
        RestAssured.baseURI="https://www.pickrr.com";
        RestAssured.basePath="/api/place-order/";
    }
    @Test
    public void verifyPlaceOrder(){
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Content-Type","application/json");
        requestSpecification.log().all();
        requestSpecification.multiPart(new File("src/main/resources/lost.csv"));
        MultiPartSpecification multiPartSpecification=new MultiPartSpecificationImpl();
        System.out.println(multiPartSpecification.getHeaders());


  //      PlaceOrderPayload placeOrderPayload=new PlaceOrderPayload();
       // requestSpecification.body(new Gson().toJson(PlaceOrderPayload
      //  .placeOrderSetBody(LoginApi.loginAndReturnObject().getAuth_token()))).log().all();
        Response response=requestSpecification.post();
        System.out.println(response);
        JsonPath jsonPath=response.jsonPath();
        Assert.assertEquals(response.getStatusCode(),400);
           response.getBody().prettyPrint();
        String trackingId=jsonPath.getString("tracking_id");
        System.out.println(trackingId);
     //   Assert.assertEquals(trackingId,"14393571159628");
      // placeOrderResponse=new Gson().fromJson(response.getBody().asString(),PlaceOrderResponse.class);
       // System.out.println(placeOrderResponse.getOrderId());
     //   System.out.println(placeOrderResponse.getClientOrderId());
    }
//    @Test(priority = 1)
//    public void verifyClientId(){
//        System.out.println(placeOrderResponse.getClientOrderId());
//    }  t
}
