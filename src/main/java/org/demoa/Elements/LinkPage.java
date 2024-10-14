package org.demoa.Elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

public class LinkPage extends ElementPage{

    private By badRequestLink=By.id("bad-request");
    private By badRequestResponce=By.id("linkResponse");

    public void clickBadRequestLink(){
        scrollToElementJs(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse() throws InterruptedException {
        Thread.sleep(2000);
        return find(badRequestResponce).getText();
    }
}
