package part3.com.demoqa.test.part1.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;


// RadioButtonTest class extends BaseTest to inherit common setup and teardown functionality
public class RadioButtonTest extends BaseTest {

    // Test method to verify the functionality of radio buttons on the form
    @Test
    public void TestRadioButton() {
        // Navigate to the forms section and click on the practice form
        var formPage = homePage.goToForms().clickPracticeForm();

        // Click the Female radio button to select it
        formPage.clickFemaleRadioButton();

        // Check if the Female radio button is selected
        boolean isFemaleButtonSelected = formPage.isFemaleClicked();

        // Assert that the Female radio button is selected
        Assert.assertTrue(isFemaleButtonSelected, "Female Button is not selected");
    }
}
