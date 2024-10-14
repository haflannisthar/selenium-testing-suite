package org.demoa.Widgets;

import org.openqa.selenium.By;
import java.util.List;

import static Utilities.DropDownUtility.*;
import static Utilities.JavaScriptUtility.scrollToElementJs;


// SelectMenuItem class extends WidgetPage to manage interactions with a multi-select dropdown
public class SelectMenuItem extends WidgetPage {

    // Locator for the multi-select dropdown
    private By standardMultiSelect = By.id("cars");

    // Method to select an option by visible text
    public void MultiSelect(String text) {
        scrollToElementJs(standardMultiSelect); // Scroll to the multi-select dropdown
        // Use utility method to select by visible text
        selectByVisibleText(standardMultiSelect, text);
    }

    // Method to select an option by index
    public void MultiSelect(int index) {
        scrollToElementJs(standardMultiSelect); // Scroll to the multi-select dropdown
        // Use utility method to select by index
        selectByIndex(standardMultiSelect, index);
    }

    // Method to deselect an option by value
    public void deSelectMulti(String text) {
        scrollToElementJs(standardMultiSelect); // Scroll to the multi-select dropdown
        // Use utility method to deselect by value
        deSelectByValue(standardMultiSelect, text);
    }

    // Method to get all selected options in the multi-select dropdown
    public List<String> getMultiAllSelectedOptions() {
        scrollToElementJs(standardMultiSelect); // Scroll to the multi-select dropdown
        // Return a list of all selected options
        return getAllSelectedOptions(standardMultiSelect);
    }
}

