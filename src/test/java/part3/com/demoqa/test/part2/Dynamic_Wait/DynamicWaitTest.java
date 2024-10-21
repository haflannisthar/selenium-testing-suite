package part3.com.demoqa.test.part2.Dynamic_Wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// Test class for dynamic waits in the application
public class DynamicWaitTest extends BaseTest {

    // Test method to verify text visibility after a button click
    @Test
    public void testVisibleAfterButtonTest() {
        // Navigate to the Dynamic Property page and create an instance
        var dynamicPage = homePage.goToElement().clickDynamicProperty();

        // Get the actual result text that should be visible after the delay
        String actualResult = dynamicPage.getVisibleAfterText();

        // Define the expected text to be matched
        String expectedText = "Visible After 5 Seconds";

        // Assert that the actual result matches the expected text
        Assert.assertEquals(actualResult, expectedText, "Actual and expected result doesn't match");
    }

    // Test method to verify the progress bar functionality
    @Test
    public void testProgressBar() {
        // Navigate to the Progress Bar menu and create an instance
        var progressPage = homePage.goToWidgets().clickProgressBarMenu();

        // Click the Start button to begin the progress
        progressPage.clickStartButton();

        // Get the actual progress value displayed after the button click
        String actualValue = progressPage.getProgressValue();

        // Define the expected progress value
        String expectedValue = "100%";

        // Assert that the actual progress value matches the expected value
        Assert.assertEquals(actualValue, expectedValue, "\nActual value is not 100%");
    }
}

