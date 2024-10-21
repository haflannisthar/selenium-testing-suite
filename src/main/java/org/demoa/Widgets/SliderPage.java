package org.demoa.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.ActionUtility.dragAndDropBy;

public class SliderPage extends WidgetPage{

    private final By slider=By.xpath("//div[@id='sliderContainer']//input[@type='range']");
  private final By sliderValue=By.id("sliderValue");

    public void moveSlider(int x,int y){

        /*
         * The logic to drag the slider has been moved to the ActionUtility class
         * and utilizes the dragAndDropBy method from that class.
         *
         * Advantages of creating the ActionUtility class:
         * 1. **Code Reusability**: Centralizing common actions (like drag-and-drop) into a utility class allows us to reuse these methods across different tests or classes without rewriting the code.
         * 2. **Separation of Concerns**: The logic for interacting with elements is separated from the main test logic, making the code more modular, cleaner, and easier to maintain.
         * 3. **Easier Updates**: If the drag-and-drop logic or behavior changes, we only need to update it in the utility class, rather than updating multiple test classes individually.
         * 4. **Improved Readability**: Tests are more readable because the main test logic focuses on what is being tested, while detailed actions (like dragging elements) are handled by utility methods.

         * Advantages of making methods static:
         * 1. **No Need to Instantiate**: Static methods can be accessed directly without creating an instance of the class. This reduces memory usage and simplifies the code, especially for utility functions that are used frequently across tests.
         * 2. **Shared Across All Tests**: Static methods belong to the class, not instances of the class. This ensures the same method behavior is used consistently across different parts of the application.
         * 3. **Performance**: Since static methods don't rely on object creation, they can offer a slight performance advantage when frequently used, making them ideal for utility classes that provide common, repeatable operations.
         */


//        Actions action=new Actions(driver);
//        action.dragAndDropBy(find(slider),x,y);
//        action.perform();


        // Find the slider element and pass it along with the x and y offsets to the dragAndDropBy method
        // This performs the drag and drop action to move the slider
        dragAndDropBy(find(slider),x,y);


    }


    public String getSliderValue(){
        return find(slider).getAttribute("value");
    }

}
