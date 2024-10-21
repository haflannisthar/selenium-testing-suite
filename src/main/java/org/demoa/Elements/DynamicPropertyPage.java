package org.demoa.Elements;

import org.openqa.selenium.By;

import static Utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertyPage extends ElementPage{


    private final By visibleAfterButton=By.id("visibleAfter");


    public String getVisibleAfterText(){
        explicitWaitUntilVisible(visibleAfterButton,5);
        System.out.println("Button Text : " + find(visibleAfterButton).getText());
        return find(visibleAfterButton).getText();
    }

}
