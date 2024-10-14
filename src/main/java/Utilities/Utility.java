package Utilities;

import org.Base.BasePage;
import org.openqa.selenium.WebDriver;

// Utility class to manage the WebDriver instance used across the application
public class Utility {

    // Static WebDriver instance to be shared across the application
    public static WebDriver driver;

    // Method to set the WebDriver instance from BasePage
    public static void setUtilityDriver() {
        // Assign the WebDriver instance from the BasePage to the Utility class's driver
        driver = BasePage.driver;
    }
}
