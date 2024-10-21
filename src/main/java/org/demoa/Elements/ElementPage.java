package org.demoa.Elements;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJs;

// ElementPage class that extends HomePage and provides methods for interacting with specific elements
public class ElementPage extends HomePage {

    // Locator for the Web Tables element in the navigation menu
    private By webTableElement = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    // Locator for the Links element in the navigation menu
    private By linkElement = By.xpath("//li[@id='item-5']/span[text()='Links']");


    private By DynamicPropertyElement = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");


private By textBoxElement=By.xpath("//li[@id='item-0']//span[text()='Text Box']");

    // Method to click on the Web Tables element and navigate to the WebTablePage
    public WebTablePage clickWebTable() {
        click(webTableElement); // Click on the Web Tables element
        return new WebTablePage(); // Return a new instance of WebTablePage
    }

    // Method to click on the Links element and navigate to the LinkPage
    public LinkPage clickLinks() {
        click(linkElement); // Click on the Links element
        return new LinkPage(); // Return a new instance of LinkPage
    }


    // Method to click on the Dynamic Property element and navigate to the DynamicPropertyPage
    public DynamicPropertyPage clickDynamicProperty() {
        scrollToElementJs(DynamicPropertyElement); // Scroll to the Dynamic Property element to ensure it is in view
        click(DynamicPropertyElement); // Click the Dynamic Property element
        return new DynamicPropertyPage(); // Return a new instance of DynamicPropertyPage
    }

    // Method to click on the TextBox element and navigate to the TextBoxPage
    public TextBoxPage clickTextBox() {
        scrollToElementJs(textBoxElement); // Scroll to the TextBox element to ensure it is in view
        click(textBoxElement); // Click the TextBox element
        return new TextBoxPage(); // Return a new instance of TextBoxPage
    }

}