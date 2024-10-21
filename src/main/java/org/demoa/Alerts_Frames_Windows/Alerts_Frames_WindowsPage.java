package org.demoa.Alerts_Frames_Windows;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

public class Alerts_Frames_WindowsPage extends HomePage {

    // Locator for the "Modal Dialogs" element in the navigation menu
    private By ModalDialogElement = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    // Locator for the "Alerts" element in the navigation menu
    private By AlertMenuElement = By.xpath("//li[@id='item-1']//span[text()='Alerts']");

    private By framesMenuItem=By.xpath("//li[@id='item-2']//span[text()='Frames']");

    private By windowsMenuItem=By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");


    /**
     * Method to click the "Frames" menu item.
     * This will navigate to the Frames page.
     *
     * @return a new instance of the FramesPage page object
     */
    public FramesPage clickFrames(){
        scrollToElementJs(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }


    /**
     * Method to click the "Modal Dialogs" menu item.
     * This will navigate to the Modal Dialogs page.
     *
     * @return a new instance of the ModalDialog page object
     */
    public ModalDialog clickModalDialog() {
        scrollToElementJs(ModalDialogElement);  // Scrolls to the Modal Dialogs element using JavaScript
        click(ModalDialogElement);              // Clicks the Modal Dialogs element
        return new ModalDialog();               // Returns a new instance of the ModalDialog page object
    }

    /**
     * Method to click the "Alerts" menu item.
     * This will navigate to the Alerts page.
     *
     * @return a new instance of the AlertPage page object
     */
    public AlertPage clickAlertPage() {
        scrollToElementJs(AlertMenuElement);    // Scrolls to the Alerts element using JavaScript
        click(AlertMenuElement);                // Clicks the Alerts element
        return new AlertPage();                 // Returns a new instance of the AlertPage page object
    }

    /**
     * Method to click the "Browser Windows" menu item.
     * This will navigate to the Browser Windows.
     *
     * @return a new instance of the Browser Windows page object
     */

    public WindowPage clickBrowserWindowPage() {
        scrollToElementJs(windowsMenuItem);    // Scrolls to the Browser Window element using JavaScript
        click(windowsMenuItem);                // Clicks the WindowPage element
        return new WindowPage();                 // Returns a new instance of the WindowPage page object
    }

}
