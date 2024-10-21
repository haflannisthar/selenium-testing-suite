package part3.com.demoqa.test.part1.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import java.util.List;


// SelectDropDownTest class extends BaseTest to inherit common setup and teardown functionality
public class SelectDropDownTest extends BaseTest {

    // Test method to verify the functionality of multi-select dropdowns
    @Test
    public void testMultiSelectDropDown() {
        // Navigate to the widgets section and click on the multi-select menu
        var selectMenuPage = homePage.goToWidgets().clickMenu();

        // Select multiple options from the dropdown
        selectMenuPage.MultiSelect("Volvo"); // Select 'Volvo' by name
        selectMenuPage.MultiSelect(1);        // Select the option at index 1 (e.g., 'Opel')
        selectMenuPage.MultiSelect("Audi");   // Select 'Audi' by name
        selectMenuPage.MultiSelect(2);        // Select the option at index 2 (e.g., 'Saab')

        // Deselect 'Saab' from the selected options
        selectMenuPage.deSelectMulti("saab"); // Deselect by name (case-sensitive)

        // Retrieve all currently selected options
        List<String> actualSelectedOptions = selectMenuPage.getMultiAllSelectedOptions();

        // Assert that the expected options are selected
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"), "Expected option 'Volvo' is not selected.");
        Assert.assertTrue(actualSelectedOptions.contains("Opel"), "Expected option 'Opel' is not selected.");
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "Option 'Saab' should be deselected.");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"), "Expected option 'Audi' is not selected.");
    }
}
