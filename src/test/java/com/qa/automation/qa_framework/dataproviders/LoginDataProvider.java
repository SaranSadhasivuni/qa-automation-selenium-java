package com.qa.automation.qa_framework.dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][]{
                {"validUser", "validPassword", true},
                {"invalidUser", "validPassword", false},
                {"validUser", "invalidPassword", false},
                {"", "", false}
        };
    }
}

/*“I use Object[][] so I can pass multiple data types like strings and booleans.”*/