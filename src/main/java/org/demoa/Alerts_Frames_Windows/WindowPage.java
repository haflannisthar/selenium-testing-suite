package org.demoa.Alerts_Frames_Windows;

import org.openqa.selenium.By;

import java.util.Set;

import static Utilities.SwitchToUtility.switchToWindow;

public class WindowPage extends Alerts_Frames_WindowsPage{


    private final By newWindowBtn=By.id("windowButton");


    public void clickNewWindowBtn(){
        click(newWindowBtn);
    }

    public void switchToNewWindow(){
//        step 1 : get the current main window handle
            String currentHandle=driver.getWindowHandle();   // can be written in the utility package by creating new java class
        System.out.println("Main window id  : "+ currentHandle +"\n");
//        step 2 : get all window handle
       Set<String> allWindowHandles=driver.getWindowHandles(); // can be written in the utility package by creating new java class
        System.out.println("all window handle : " +allWindowHandles.size());

        for (String handle:allWindowHandles){
            if (currentHandle.equals(handle)){
                System.out.println("1st window id " +handle);
            }else{
                switchToWindow(handle);  // == driver.switchTo.window(handle) --> all this utility methods are written in utility package
            System.out.println("2nd window id : " +handle);
            }
        }

//        step 3 : switch to the new window using new window handle
    }
}
