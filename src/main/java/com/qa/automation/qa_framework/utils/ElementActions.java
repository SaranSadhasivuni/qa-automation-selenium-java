package com.qa.automation.qa_framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementActions {

    private WebDriver driver;
    private WaitUtils wait;

    public ElementActions(WebDriver driver, long timeout) {
        this.driver = driver;
        this.wait = new WaitUtils(driver, timeout);
    }

    public void type(By locator, String value) {
        wait.waitForElementVisible(locator);
        driver.findElement(locator).sendKeys(value);
    }

    public void click(By locator) {
        wait.waitForElementClickable(locator);
        driver.findElement(locator).click();
    }
}

/*“I abstracted element interactions to reduce code duplication and
   enforce consistent wait behavior.”*/
 