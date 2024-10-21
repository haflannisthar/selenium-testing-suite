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


    public static void switchToFrameString(String value){
        switchTo().frame(value);
    }


    public static void switchToFrameIndex(int index){
        switchTo().frame(index);
    }
    public static void switchToDefaultContent(){
        switchTo().defaultContent();
    }

public static void switchToFrameElement(WebElement element){
        switchTo().frame(element);
}


public static void switchToWindow(String handle){
        switchTo().window(handle);
}

}

