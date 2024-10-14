package org.demoa.Forms;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

public class FormPage extends HomePage {

    private By practice=By.xpath("//li[@id='item-0']/span[text()='Practice Form']");


    public PracticeFormPage clickPracticeForm(){
        scrollToElementJs(practice);
        click(practice);

        return  new PracticeFormPage();
    }
}
