package com.qa.automation.qa_framework.tests;

import com.qa.automation.qa_framework.base.BaseTest;
import com.qa.automation.qa_framework.dataproviders.LoginDataProvider;
import com.qa.automation.qa_framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    (dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
    public void loginTest(String username, String password, boolean isValidUser) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        if (isValidUser) {
        	Assert.assertTrue(false, "Forcing failure to test screenshot capture");
        } else {
            Assert.assertTrue(driver.getTitle().contains("Login"),
                    "Invalid user should remain on Login page");
        }
    }
}