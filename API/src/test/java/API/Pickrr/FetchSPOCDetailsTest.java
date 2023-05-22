package API.Pickrr;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class FetchSPOCDetailsTest {

    @Test
    public void fetchSpocDetails(){
        RestAssured.baseURI="https://pickrr.com";
        RestAssured.basePath="/users/secure-shipment/spoc-details/?auth_token=c5a2a4af9f55b744473879737f6cf81a442";
        RequestSpecification requestSpecification=RestAssured.given().queryParam("auth_token","c5a2a4af9f55b744473879737f6cf81a442");
        requestSpecification.header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1ZW0iOiJnLm1hbmdsYTkxMUBnbWFpbC5jb20iLCJ1aWQiOiIxIiwicm9sZXMiOlsiIl0sImF1dCI6ImM1YTJhNGFmOWY1NWI3NDQ0NzM4Nzk3MzdmNmNmODFhNDQyIiwiZXhwIjoxNjgyNjE1NDc2LCJjYXV0IjoiYzVhMmE0YWY5ZjU1Yjc0NDQ3Mzg3OTczN2Y2Y2Y4MWE0NDIiLCJ1cGsiOjQyNH0.ujouVBfIjAsVrnJPz5j6kSAhUVTKnfvYkOOGjxYI1TU");
        Response response=requestSpecification.request(Method.GET);
        String responseBody=response.getBody().prettyPrint();
    }
}
