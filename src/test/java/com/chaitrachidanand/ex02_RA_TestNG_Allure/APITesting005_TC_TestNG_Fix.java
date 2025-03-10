package com.chaitrachidanand.ex02_RA_TestNG_Allure;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.junit.Test;

public class APITesting005_TC_TestNG_Fix {

    @Test
    @Description("Positive test case")
    public void one()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/560016").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
    @Test
    @Description("Negative test case")
    public void two()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/1").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
    @Test
    @Description("Special char test case")
    public void three()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/%").
                when()
                .get()
                .then().log().all().statusCode(200);

    }


}
