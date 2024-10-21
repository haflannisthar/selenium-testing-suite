package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Utility class for handling wait conditions in Selenium
public class WaitUtility extends Utility {

    // Method to perform an explicit wait until a specific element is visible
    // Parameters:
    // - By locator: the locator for the element to wait for
    // - int seconds: the maximum time to wait
    public static void explicitWaitUntilVisible(By locator, int seconds) {
        // Create a WebDriverWait instance with the specified timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        // Wait until the specified element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Method to perform a fluent wait until a specific element is visible
    // Parameters:
    // - By locator: the locator for the element to wait for
    // - int seconds: the maximum time to wait
    public static void fluentWaitUntilVisible(By locator, int seconds) {
        // Create a FluentWait instance with the specified timeout and polling frequency
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(seconds)) // Set the total timeout
                .pollingEvery(Duration.ofMillis(500)) // Set the polling interval for checking the condition
                .ignoring(NoSuchFieldException.class, StaleElementReferenceException.class); // Ignore specific exceptions

        // Wait until the specified element is visible
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
