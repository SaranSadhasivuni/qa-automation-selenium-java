package com.qa.automation.qa_framework.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class ApiBaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
    }
}

//“I centralize API base configuration so it can be reused across multiple API tests.”