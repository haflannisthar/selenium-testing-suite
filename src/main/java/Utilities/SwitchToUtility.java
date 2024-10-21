package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {

    // Helper method to get the TargetLocator, which allows switching between frames, windows, or alerts.
    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    /**
     * Gets the text from an alert dialog.
     *
     * @return The text present on the alert.
     */
    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    /**
     * Accepts the currently displayed alert dialog (clicks the 'OK' button).
     */
    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    /**
     * dismiss the currently displayed alert dialog (clicks the 'CANCEL' button).
     */
    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    /*
    * set the text to prompt
    * */
    public static void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }


    // Switch to a frame using its string name or ID
    // Parameters:
    // - String value: the name or ID of the frame to switch to
    public static void switchToFrameString(String value) {
        switchTo().frame(value); // Switch to the frame with the given name or ID
    }

    // Switch to a frame using its index
    // Parameters:
    // - int index: the index of the frame to switch to (0-based)
    public static void switchToFrameIndex(int index) {
        switchTo().frame(index); // Switch to the frame at the specified index
    }

    // Switch back to the main document from a frame
    public static void switchToDefaultContent() {
        switchTo().defaultContent(); // Switch to the main document (default content)
    }

    // Switch to a frame using a WebElement representing the frame
    // Parameters:
    // - WebElement element: the frame element to switch to
    public static void switchToFrameElement(WebElement element) {
        switchTo().frame(element); // Switch to the specified frame element
    }

    // Switch to a specific window using its handle
    // Parameters:
    // - String handle: the handle of the window to switch to
    public static void switchToWindow(String handle) {
        switchTo().window(handle); // Switch to the window with the given handle
    }

}

