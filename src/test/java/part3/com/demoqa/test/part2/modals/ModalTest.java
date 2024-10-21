package part3.com.demoqa.test.part2.modals;

import org.demoa.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;


public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        // Navigate to the Alerts, Frames, Windows (AFW) page via the HomePage
        var afwPage = homePage.goToAlertsWindowsCard();

        // Navigate to the Modal Dialog page from AFW
        var modalDialogPage = afwPage.clickModalDialog();

        // Click the button that opens the small modal dialog
        modalDialogPage.clickSmallModalDialogButton();

        // Retrieve the text inside the small modal dialog
        String modalDialogActualText = modalDialogPage.getSmallModalText();

        // Assert that the modal dialog's text contains "small modal"
        Assert.assertTrue(modalDialogActualText.contains("small modal"),
                "\n The message does not contain 'small modal' \n");

        // Close the small modal dialog after validation
        modalDialogPage.clickCloeButton();
    }
}

