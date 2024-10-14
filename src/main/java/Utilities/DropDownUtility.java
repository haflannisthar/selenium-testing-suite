package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;
// DropDownUtility class provides utility methods for interacting with dropdown elements
public class DropDownUtility extends Utility {

    // Private method to find the dropdown element and return a Select instance
    private static Select findByDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    // Method to select an option in the dropdown by visible text
    public static void selectByVisibleText(By locator, String text) {
        findByDropDown(locator).selectByVisibleText(text);
    }

    // Method to select an option in the dropdown by index
    public static void selectByIndex(By locator, int index) {
        findByDropDown(locator).selectByIndex(index);
    }

    // Method to select an option in the dropdown by value
    public static void selectByValue(By locator, String text) {
        findByDropDown(locator).selectByValue(text);
    }

    // Method to deselect an option in the dropdown by value (only for multi-select)
    public static void deSelectByValue(By locator, String text) {
        findByDropDown(locator).deselectByValue(text);
    }

    // Method to retrieve all selected options from a multi-select dropdown as a list of strings
    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findByDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}