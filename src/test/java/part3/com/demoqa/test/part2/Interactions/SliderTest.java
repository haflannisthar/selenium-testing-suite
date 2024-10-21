package part3.com.demoqa.test.part2.Interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// Test class for testing the slider functionality in the application
public class SliderTest extends BaseTest {

    // Test method to verify the slider functionality
    @Test
    public void sliderTest() {

        int x = 180; // The horizontal distance to move the slider
        int y = 0;   // The vertical distance (0 for horizontal movement)

        // Navigate to the Slider menu and create an instance of the Slider page
        var sliderPage = homePage.goToWidgets().clickSliderMenu();

        // Move the slider by the specified x and y values
        sliderPage.moveSlider(x, y);

        // Get the actual value displayed after moving the slider
        String actualValue = sliderPage.getSliderValue();

        // Define the expected value after moving the slider
        String expectedValue = "25";

        // Assert that the actual slider value matches the expected value
        Assert.assertEquals(actualValue, expectedValue, "\nActual and expected value do not match");
    }
}
