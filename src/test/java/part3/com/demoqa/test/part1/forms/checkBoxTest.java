package part3.com.demoqa.test.part1.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;


// checkBoxTest class extends BaseTest to inherit common setup and teardown functionality
public class checkBoxTest extends BaseTest {

    // Test method to verify the functionality of checkboxes on the form
    @Test
    public void testCheckBox() {
        // Navigate to the forms section and click on the practice form
        var FormPage = homePage.goToForms().clickPracticeForm();

        // Click the Music checkbox to select it
        FormPage.clickMusicCheckBox();

        // Click the Read checkbox to select it
        FormPage.clickReadCheckBox();

        // Click the Sport checkbox to select it
        FormPage.clickSportCheckBox();

        // Unselect the Music checkbox
        FormPage.unClickMusicCheckBox();

        // Check if the Music checkbox is selected
        boolean isMusicCheckBoxSelected = FormPage.isMusicSelected();

        // Assert that the Music checkbox is not selected
        Assert.assertFalse(isMusicCheckBoxSelected, "Music CheckBox is Selected");
    }
}
