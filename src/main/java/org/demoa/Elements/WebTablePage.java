package org.demoa.Elements;

import org.openqa.selenium.By;

// WebTablePage class that extends ElementPage to handle interactions specific to the web table page
public class WebTablePage extends ElementPage {

    // Locator for the registration age field
    private By registrationAgeField = By.id("age");

    // Locator for the submit button
    private By submitButton = By.id("submit");

    // Method to click the Edit button for a specific email
    public void clickEdit(String email) {
        // XPath to find the Edit button next to the given email
        By edit = By.xpath("//div[text()='" + email + "']//following::span[@title='Edit']");
        click(edit); // Click on the Edit button
    }

    // Method to set the age in the registration age field
    public void setAge(String age) {
        set(registrationAgeField, age); // Use the set method to enter age
    }

    // Method to click the submit button
    public void clickSubmitBtn() {
        click(submitButton); // Click on the submit button
    }

    // Method to get the age from the table for a specific email
    public String getTableAge(String email) {
        // XPath to find the age corresponding to the given email
        By tableAge = By.xpath("//div[text()='" + email + "']//preceding::div[1]");
        return find(tableAge).getText(); // Get and return the text of the age element
    }
}

