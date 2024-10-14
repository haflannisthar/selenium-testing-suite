package org.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    // Static WebDriver instance to be shared across all page objects
    public static WebDriver driver;

    // Method to set the WebDriver instance for the BasePage
    public void setDriver(WebDriver driver) {
        BasePage.driver = driver; // Assign the provided WebDriver instance to the static driver variable
    }

    // Method to locate a WebElement using a By locator
    protected WebElement find(By locator) {
        return driver.findElement(locator); // Return the located WebElement
    }

    // Method to enter text into a WebElement identified by the By locator
    protected void set(By locator, String text) {
        find(locator).clear(); // Clear any existing text in the WebElement
        find(locator).sendKeys(text); // Send the specified text to the WebElement
    }

    // Method to click on a WebElement identified by the By locator
    protected void click(By locator) {
        find(locator).click(); // Click on the located WebElement
    }
}