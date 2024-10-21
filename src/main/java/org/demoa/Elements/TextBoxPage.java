package org.demoa.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Utilities.ActionUtility.sendKeys;
import static Utilities.JavaScriptUtility.scrollToElementJs;
import static Utilities.WaitUtility.explicitWaitUntilVisible;

// Class representing the TextBox page, extending functionality from ElementPage
public class TextBoxPage extends ElementPage {

    // Locators for elements on the TextBox page
    private final By fullNameField = By.id("userName"); // Locator for the full name input field
    private final By currentAddressField = By.xpath("//textarea[@id='currentAddress']"); // Locator for the current address input field
    private final By currentAddressResult = By.xpath("//p[@id='currentAddress']"); // Locator for the current address result display
    private final By submitBtn = By.id("submit"); // Locator for the submit button

    // Method to set the full name in the input field
    // Parameters:
    // - String fullName: the full name to be entered
    public void setFullName(String fullName) {
        scrollToElementJs(fullNameField); // Scroll to the full name field
        sendKeys(find(fullNameField), Keys.chord(fullName)); // Send the full name to the input field
    }

    // Method to set the email in the email field by using TAB to navigate
    // Parameters:
    // - String email: the email to be entered
    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email)); // Set the full name and then TAB to the email field
    }

    // Method to set the current address in the address input field
    // Parameters:
    // - String address: the current address to be entered
    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER); // Send the address and press ENTER
    }

    // Method to click the submit button
    public void clickSubmitBtn() {
        scrollToElementJs(submitBtn); // Scroll to the submit button
        click(submitBtn); // Click the submit button
    }

    // Method to get the current address from the result display
    // Returns:
    // - String: the text of the current address result
    public String getCurrentAddress() {
        explicitWaitUntilVisible(currentAddressResult, 5); // Wait until the current address result is visible
        return find(currentAddressResult).getText(); // Get and return the text of the current address result
    }
}

