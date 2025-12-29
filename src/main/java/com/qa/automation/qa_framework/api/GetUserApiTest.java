package com.qa.automation.qa_framework.api;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserApiTest extends ApiBaseTest {

    @Test
    public void getUserDetails() {

        Response response =
                given()
                .when()
                    .get("/api/users/2")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("data.id"), "2");
    }
}
