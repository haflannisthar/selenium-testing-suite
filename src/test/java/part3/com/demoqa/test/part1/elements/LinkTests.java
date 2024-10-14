package part3.com.demoqa.test.part1.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// LinkTests class extends BaseTest to inherit setup and teardown functionality
public class LinkTests extends BaseTest {

    // Test method to verify the behavior of links on the page
    @Test
    public void testLink() throws InterruptedException {
        // Navigate to the links section and click on the links element
        var linkPage = homePage.goToElement().clickLinks();

        // Click the "Bad Request" link to test its response
        linkPage.clickBadRequestLink();

        // Retrieve the actual response from the link page after clicking
        String actualResponse = linkPage.getResponse();

        // Assert that the actual response contains "400" and "Bad Request"
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "Actual Response (" + actualResponse + " ) \n does not contain 400 and bad request ");
    }
}
