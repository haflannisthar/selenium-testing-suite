package Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility extends Utility{
    // Private method to create and return an instance of the Actions class using the shared WebDriver instance
    private static Actions act() {
        // Initialize and return an Actions object for performing complex user interactions like drag and drop
        return new Actions(driver);
    }

    // Public method to perform drag and drop action on a specific element by given x and y coordinates
    // Parameters:
    // - WebElement element: the web element (e.g., slider) to be dragged
    // - int x: the horizontal offset by which the element should be moved
    // - int y: the vertical offset by which the element should be moved
    public static void dragAndDropBy(WebElement element, int x, int y) {
        // Use the Actions class to perform drag and drop by offset, then execute the action with perform()
        act().dragAndDropBy(element, x, y).perform();
    }


    public static  void sendKeys(WebElement element,CharSequence value){
        act().sendKeys(element,value).perform();
    }
}
