package org.demoa.Widgets;

import org.openqa.selenium.By;

import static Utilities.DropDownUtility.selectByVisibleText;

// DatePickerMenuItem class extends WidgetPage to handle date selection from a date picker
public class DatePickerMenuItem extends WidgetPage {

    // Locators for various elements in the date picker
    private final By selectDateField = By.id("datePickerMonthYearInput");
    private final By monthDropDown = By.className("react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    // Method to construct the locator for a specific day in the date picker
    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    // Method to click on a specific day in the date picker
    public void clickDate(String day) {
        click(dayValue(day)); // Click the day using its locator
    }

    // Method to check if a specific day is displayed in the current month
    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed(); // Return true if the day is visible, false otherwise
    }

    // Method to click the date input field to open the date picker
    public void clickSelectDate() {
        click(selectDateField); // Click the date input field
    }

    // Method to get the currently selected date from the date input field
    public String getDate() {
        return find(selectDateField).getAttribute("value"); // Retrieve the value of the date input field
    }

    // Method to select a month from the month dropdown
    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month); // Select the month by visible text
    }

    // Method to select a year from the year dropdown
    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year); // Select the year by visible text
    }
}
