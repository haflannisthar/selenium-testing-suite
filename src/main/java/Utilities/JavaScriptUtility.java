package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


// JavaScriptUtility class provides utility methods for executing JavaScript operations in a web application
public class JavaScriptUtility extends Utility {

    // Method to scroll to a specific element using JavaScript
    public static void scrollToElementJs(By locator) {
        // Find the web element using the provided locator
        WebElement element = driver.findElement(locator);
        // JavaScript to scroll the element into view
        String jsScript = "arguments[0].scrollIntoView();";
        // Execute the JavaScript to scroll to the element
        ((JavascriptExecutor) driver).executeScript(jsScript, element);
    }

    // Method to click on an element using JavaScript
    public static void clickJS(By locator) {
        // Find the web element using the provided locator
        WebElement element = driver.findElement(locator);
        // Cast the driver to JavascriptExecutor
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        // Execute the JavaScript to click the element
        executor.executeScript("arguments[0].click()", element);
    }
}