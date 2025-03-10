package com.chaitrachidanand.ex02_RA_TestNG_Allure;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class APITesting006_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description("Positive test case")
    public void Test_NonBDD_Get() {
        String pincode = "560016";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);


        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);
    }

    @Test
    @Description("negative test case")
    public void Test_NonBDD_Get2() {
        String pincode = "*";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);


        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);

    }
}
