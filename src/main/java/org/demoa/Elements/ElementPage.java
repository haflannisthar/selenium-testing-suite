package org.demoa.Elements;

import org.demoa.HomePage;
import org.openqa.selenium.By;

// ElementPage class that extends HomePage and provides methods for interacting with specific elements
public class ElementPage extends HomePage {

    // Locator for the Web Tables element in the navigation menu
    private By webTableElement = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    // Locator for the Links element in the navigation menu
    private By linkElement = By.xpath("//li[@id='item-5']/span[text()='Links']");

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
}