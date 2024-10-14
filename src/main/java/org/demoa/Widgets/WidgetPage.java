package org.demoa.Widgets;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

import org.openqa.selenium.By;

// WidgetPage class extends HomePage to manage interactions with the widget menu items
public class WidgetPage extends HomePage {

    // Locators for the Select Menu and Date Picker menu items
    private final By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private final By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

    // Method to click on the Select Menu item
    public SelectMenuItem clickMenu() {
        scrollToElementJs(selectMenuItem); // Scroll to the Select Menu item
        click(selectMenuItem); // Click on the Select Menu item
        return new SelectMenuItem(); // Return a new instance of SelectMenuItem
    }

    // Method to click on the Date Picker menu item
    public DatePickerMenuItem clickDatePicker() {
        scrollToElementJs(datePickerMenuItem); // Scroll to the Date Picker item
        click(datePickerMenuItem); // Click on the Date Picker item
        return new DatePickerMenuItem(); // Return a new instance of DatePickerMenuItem
    }
}
