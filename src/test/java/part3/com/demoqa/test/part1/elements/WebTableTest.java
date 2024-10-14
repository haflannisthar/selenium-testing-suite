package part3.com.demoqa.test.part1.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// WebTableTest class extends BaseTest to inherit common setup and teardown functionality
public class WebTableTest extends BaseTest {

    // Test method to verify editing a web table entry
    @Test
    public void testWebTable() {
        // Navigate to the web table section from the home page
        var webTablePage = homePage.goToElement().clickWebTable();

        // Click the edit button for the entry with the specified email address
        webTablePage.clickEdit("alden@example.com");

        // Update the age field in the web table
        webTablePage.setAge("22");

        // Submit the changes to the web table
        webTablePage.clickSubmitBtn();

        // Retrieve the actual age from the web table for the specified email
        String actualAge = webTablePage.getTableAge("alden@example.com");

        // Define the expected age value
        String expectedAge = "22";

        // Assert that the actual age matches the expected age
        Assert.assertEquals(actualAge, expectedAge, "Actual age and expected age do not match");
    }
}