package part3.com.demoqa.test.part2.screenshot;

import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

// CaptureFailedScreenShotTest class extends BaseTest to inherit common setup and teardown functionality
public class CaptureFailedScreenShotTest extends BaseTest {

    // Test method to verify behavior when the submit button is clicked without using JavaScript Executor
    @Test
    public void testClickingSubmitButtonWithoutJavascriptExecutor() {
        // Navigate to the forms section and click on the practice form
        var practiceFormPage = homePage.goToForms().clickPracticeForm();

        // Click the submit button on the practice form
        practiceFormPage.clickSubmitBtn();

        // Note: The functionality of capturing a screenshot on failure should be implemented
        // in the BaseTest class (e.g., using an AfterMethod annotation) if needed.
    }
}