package com.qa.automation.qa_framework.pages;

import com.qa.automation.qa_framework.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    ElementActions actions;

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new ElementActions(driver, 10);
    }

    public void login(String user, String pass) {
        actions.type(username, user);
        actions.type(password, pass);
        actions.click(loginBtn);
    }
}

