package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostTest {

    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .body("hello")

                .when()
                .post("/post")

                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("hi"));
    }

}