package org.demoa.Widgets;


import org.openqa.selenium.By;

import static Utilities.WaitUtility.fluentWaitUntilVisible;

// Class representing the Progress Bar page, extending functionality from WidgetPage
public class ProgressBarPage extends WidgetPage {

    // Locators for elements on the Progress Bar page
    private final By startStopButton = By.id("startStopButton"); // Locator for the Start/Stop button
    private final By progressValue = By.xpath("//div[@id='progressBar']//div[@aria-valuenow='100']"); // Locator for the progress value display

    // Method to click the Start/Stop button
    public void clickStartButton() {
        click(startStopButton); // Click the Start/Stop button to start or stop the progress bar
    }

    // Method to get the current progress value displayed
    // Returns:
    // - String: the text of the progress value when it reaches 100%
    public String getProgressValue() {
        fluentWaitUntilVisible(progressValue, 30); // Wait until the progress value is visible for up to 30 seconds
        return find(progressValue).getText(); // Get and return the text of the progress value
    }
}
