package org.demoa.Elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

// LinkPage class that extends ElementPage to handle interactions specific to the link page
public class LinkPage extends ElementPage {

    // Locator for the Bad Request link
    private By badRequestLink = By.id("bad-request");

    // Locator for the response message displayed after clicking the Bad Request link
    private By badRequestResponse = By.id("linkResponse");

    // Method to click on the Bad Request link
    public void clickBadRequestLink() {
        scrollToElementJs(badRequestLink); // Scroll to the Bad Request link using JavaScript
        click(badRequestLink); // Click the Bad Request link
    }

    // Method to retrieve the response text after clicking the Bad Request link
    public String getResponse() throws InterruptedException {
        Thread.sleep(2000); // Wait for 2 seconds to allow the response to load
        return find(badRequestResponse).getText(); // Get the text of the response element
    }
}

