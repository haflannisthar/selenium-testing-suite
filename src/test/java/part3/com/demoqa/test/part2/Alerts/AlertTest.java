package part3.com.demoqa.test.part2.Alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import static Utilities.SwitchToUtility.*;

@Test
public class AlertTest extends BaseTest {


    public void testInformationAlert() {

        // Expected alert text when the information alert is triggered
        String expectedAlertText = "You clicked a button";

        // Navigate to the Alerts page via the HomePage and Alerts/Windows section
        var alertPage = homePage.goToAlertsWindowsCard().clickAlertPage();

        // Click the button that triggers the alert
        alertPage.clickAlertInformationButton();

        // Assert that the alert's text matches the expected value
        Assert.assertEquals(getAlertText(), expectedAlertText, "\nActual and expected message do not match");

        // Accept (dismiss) the alert after verification
        acceptAlert();
    }

    public void testConfirmationAlert(){

        String expectedResult="You selected Cancel";

      var alertPage=homePage.goToAlertsWindowsCard().clickAlertPage();
      alertPage.clickConfirmationButton();
      dismissAlert();
      String actualConfirmationResult=alertPage.getConfirmationResult();

      Assert.assertEquals(actualConfirmationResult,expectedResult,"\n you did not select cancel");

    }


   /*
   prompt alert will open and  "Selenium with java" will be entered
    then in the div "You entered Selenium with java" will be shown
    */
    public void testPromptAlertButton(){

        String alertText="Selenium with java";
        String expectedResult="You entered "+alertText;

        var alertPage=homePage.goToAlertsWindowsCard().clickAlertPage();
        alertPage.clickPromptAlertButton();
        setAlertText(alertText);

        acceptAlert();

        String actualResult=alertPage.getPromptResult();
        Assert.assertEquals(actualResult,expectedResult,"\n actual and expected result do not match");
    }
}

