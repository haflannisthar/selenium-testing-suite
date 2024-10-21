package org.demoa.Elements;

import org.openqa.selenium.By;

import static Utilities.WaitUtility.explicitWaitUntilVisible;

// Class representing the Dynamic Property page, extending functionality from ElementPage
public class DynamicPropertyPage extends ElementPage {

    // Locator for the button that becomes visible after a certain condition
    private final By visibleAfterButton = By.id("visibleAfter");

    // Method to retrieve the text of the button that becomes visible after a condition is met
    // Returns:
    // - String: the text of the visible button
    public String getVisibleAfterText() {
        explicitWaitUntilVisible(visibleAfterButton, 5); // Wait until the button is visible for up to 5 seconds

        // Print the button text to the console for debugging purposes
        System.out.println("Button Text : " + find(visibleAfterButton).getText());

        // Return the text of the visible button
        return find(visibleAfterButton).getText();
    }
}

