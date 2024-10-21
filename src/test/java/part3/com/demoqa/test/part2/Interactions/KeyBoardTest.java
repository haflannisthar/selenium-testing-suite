package part3.com.demoqa.test.part2.Interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// Test class for keyboard actions in the application
public class KeyBoardTest extends BaseTest {

    // Test method to verify the application functionality using keyboard inputs
    @Test
    public void testApplicationUsingKeyBoard() {
        // Navigate to the TextBox element and create an instance of the TextBox page
        var textBoxPage = homePage.goToElement().clickTextBox();

        // Set the full name in the TextBox page
        textBoxPage.setFullName("Haflan Nisthar");

        // Set the email in the TextBox page
        textBoxPage.setEmail("haflan395@gmail.com");

        // Set the current address in multiple steps (each call adds to the input)
        textBoxPage.setCurrentAddress("No : 14,");
        textBoxPage.setCurrentAddress("Nalanada Elaawala Road,");
        textBoxPage.setCurrentAddress("Kuruwita.");

        // Click the submit button on the TextBox page
        textBoxPage.clickSubmitBtn();

        // Get the current address displayed after submission
        String actualAddress = textBoxPage.getCurrentAddress();

        // Assert that the actual address contains the expected text "Kuruwita"
        Assert.assertTrue(actualAddress.contains("Kuruwita"), "\n actual address does not contain Kuruwita");
    }
}

