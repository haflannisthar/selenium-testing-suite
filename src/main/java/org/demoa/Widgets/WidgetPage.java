package org.demoa.Widgets;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

public class WidgetPage extends HomePage {

    private final By selectMenuItem=By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private final By datePickerMenuItem=By.xpath("//li[@id='item-2']//span[text()='Date Picker']");


    public SelectMenuItem clickMenu(){
        scrollToElementJs(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuItem();

    }

    public DatePickerMenuItem clickDatePicker(){
        scrollToElementJs(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuItem();
    }
}
