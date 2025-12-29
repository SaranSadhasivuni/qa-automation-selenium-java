package com.qa.automation.qa_framework.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateUserApiTest extends ApiBaseTest {

    @Test
    public void createUserTest() {

        String requestBody = "{\n" +
                "  \"name\": \"Saran\",\n" +
                "  \"job\": \"QA Engineer\"\n" +
                "}";

        Response response =
                given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                .when()
                    .post("/api/users")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "Saran");
    }
}
