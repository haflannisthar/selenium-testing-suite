package org.demoa.Alerts_Frames_Windows;

import org.openqa.selenium.By;

public class ModalDialog extends Alerts_Frames_WindowsPage{

    // Locator for the small Modal Dialog open button element
    private By smallModuleDialog=By.xpath("//button[@id='showSmallModal']");
    //private By smallModuleDialog=By.css("#showSmallModal");  ---> by css selector

    // Locator for the small Modal Dialog text element
    private By modalDialogText=By.xpath("//div[contains(text(),'small modal')]");

    // Locator for the small Modal Dialog close button element
    private By modalDialogCloseButton=By.id("closeSmallModal");

//    click the modal dialog open button
    public void clickSmallModalDialogButton(){
        click(smallModuleDialog);
    }

//    get the text in the modal
    public String getSmallModalText(){
        return find(modalDialogText).getText();
    }

//    close the dialog by click close button
    public void clickCloeButton(){
        click(modalDialogCloseButton);
    }





}
