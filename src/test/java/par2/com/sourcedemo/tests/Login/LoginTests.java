package par2.com.sourcedemo.tests.Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import par2.com.sourcedemo.base.BaseTest;


// LoginTests class extends BaseTest to utilize common setup and teardown functionality
public class LoginTests extends BaseTest {

    // Test method to verify that an error message is displayed for incorrect login credentials
    @Test
    public void testLoginErrorMessage() {
        // Set the username for the login attempt
        loginPage.setUserName("standard_user");

        // Set the password for the login attempt
        loginPage.setPassword("256632541");

        // Click the login button to attempt logging in
        loginPage.clickButton();

        // Retrieve the actual error message displayed after the failed login attempt
        String actualErrorMessage = loginPage.getErrorMessage();

        // Assert that the actual error message contains the expected text
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"),
                "Error message does not contain expected text.");
    }
}
