package API;

import APIRequest.LoginRequest;
import ApiResponse.LoginResponse;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApi {
    public static void main(String[] args) {
        loginAndReturnObject();
    }
    public static LoginResponse loginAndReturnObject(){
        RestAssured.baseURI="https://pickrr.com";
        RestAssured.basePath="/api/v1/web-login/";
        LoginRequest loginApiRequest=new LoginRequest();
        loginApiRequest.setEmail("g.mangla911@gmail.com");
        loginApiRequest.setPassword("complex@1357");

        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.header("Content-Type","application/json");
        requestSpecification.params("","");
        String requestBody=new Gson().toJson(loginApiRequest);
        //System.out.println(requestSpecification.body(requestBody));

        Response response=requestSpecification.post();
        System.out.println(response);


        LoginResponse loginApiResponse=new Gson().fromJson(response.getBody().asString(), LoginResponse.class);
        System.out.println(loginApiResponse.getToken());
        return loginApiResponse;

    }
}
