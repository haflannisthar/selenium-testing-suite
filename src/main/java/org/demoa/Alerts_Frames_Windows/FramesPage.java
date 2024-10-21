package org.demoa.Alerts_Frames_Windows;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private  By textInFrames=By.id("sampleHeading");

    private final By headerFrameText=By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");

    private final By iframeSmallBox=By.xpath("//div[@id='frame2Wrapper']//iframe");


    public String getHeaderFrameText(){
        return find(headerFrameText).getText();
    }

//    go to the frame inside the page using string
    private void switchToBigBox(){
        String iFrameBigBox = "frame1";
        switchToFrameString(iFrameBigBox);
//        driver.switchTo().frame(iFrameBigBox);
    }


    public String getTextInFromFrame(){
        switchToBigBox();
        String bigFrameText=find(textInFrames).getText();
        System.out.println("big frame text : " +bigFrameText);
//        go back to parent from the iframe
//         driver.switchTo().parentFrame();
         switchToDefaultContent();
        return bigFrameText;
    }

//    switch to small box(iframe) using index
    private void switchToSmallBox(){
        switchToFrameIndex(2);

    }

    //    switch to small box(iframe) using web element
    private void switchToSmallBoxByWebElement(){
     switchToFrameElement(find(iframeSmallBox));
    }


    public String getSmallFrameText(){

        // Create a WebDriverWait object that will wait for up to 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until at least one iframe is present on the page
        // This condition checks that the number of elements matching the tag 'iframe' is greater than 0
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("iframe"), 0));

        /*
        This line instructs the wait object to wait until at least one iframe element is present on the page.
        The ExpectedConditions.numberOfElementsToBeMoreThan() method checks the number of elements matching the specified condition—in this case,
        if the number of iframes (found by their tag name "iframe") is greater than 0.
         If the condition is met within the 10-second wait time, the code execution proceeds to the next line. If not, a TimeoutException will be thrown.
        * */


        switchToSmallBox();
//        System.out.println("line number 53 printed successfully");
        String smallFrameText=find(textInFrames).getText();
        System.out.println("small frame text : "+smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getSmallFrameTextByWebElement(){

        // Create a WebDriverWait object that will wait for up to 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until at least one iframe is present on the page
        // This condition checks that the number of elements matching the tag 'iframe' is greater than 0
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("iframe"), 0));

        /*
        This line instructs the wait object to wait until at least one iframe element is present on the page.
        The ExpectedConditions.numberOfElementsToBeMoreThan() method checks the number of elements matching the specified condition—in this case,
        if the number of iframes (found by their tag name "iframe") is greater than 0.
         If the condition is met within the 10-second wait time, the code execution proceeds to the next line. If not, a TimeoutException will be thrown.
        * */


        switchToSmallBoxByWebElement();
//        System.out.println("line number 53 printed successfully");
        String smallFrameText=find(textInFrames).getText();
        System.out.println("small frame text : "+smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

}
