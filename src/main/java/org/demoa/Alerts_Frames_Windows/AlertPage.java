package org.demoa.Alerts_Frames_Windows;

import org.openqa.selenium.By;

public class AlertPage extends Alerts_Frames_WindowsPage {

    // Locator for the "Information Alert" button by its ID attribute
    private final By informationAlertButton = By.id("alertButton");
    private final By confirmationAlertButton=By.id("confirmButton");
    private final By confirmationResult=By.id("confirmResult");

    private final By promptAlertButton=By.id("promtButton");
    private final By promptResult=By.id("promptResult");

    /**
     * Method to click the "Information Alert" button.
     * This triggers the alert popup when clicked.
     */
    public void clickAlertInformationButton() {
        click(informationAlertButton);  // Utilizes a click method from the parent class to click the element
    }
    /* *
     * Method to click the "Confirmation Alert" button.
     * This triggers the alert popup when clicked that has two buttons [OK ,CANCEL].
     * */
    public void clickConfirmationButton(){
        click(confirmationAlertButton);

    }

    /**
     * get the text that will appear in the div tag
     * */
    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }

    /* *
     * Method to click the "prompt Alert" button.
     * This triggers the alert popup when clicked that has two buttons [OK ,CANCEL] and a text box .
     * */

    public void clickPromptAlertButton(){
        click(promptAlertButton);
    }

    /**
     * get the text that will appear in the div tag
     * */
    public String getPromptResult(){
        return find(promptResult).getText();
    }


}

