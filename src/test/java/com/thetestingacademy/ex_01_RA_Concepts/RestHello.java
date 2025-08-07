package com.thetestingacademy.ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class RestHello {
    public static void main(String[] args) {
    //https://api.postalpincode.in/pincode/560036
        //baseURI is https://api.postalpincode.in/
        //basePath is pin code /560036
        RestAssured.given()
                .baseUri("https://api.postalpincode.in/pincode/560036")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
