package org.demoa.Widgets;


import org.openqa.selenium.By;

import static Utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetPage {

private final By startStopButton=By.id("startStopButton");
private final By progressValue=By.xpath("//div[@id='progressBar']//div[@aria-valuenow='100']");

public void clickStartButton(){
    click(startStopButton);
}

public String getProgressValue(){
    fluentWaitUntilVisible(progressValue,30);

    return find(progressValue).getText();
}
}
