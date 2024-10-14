package org.demoa.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utilities.DropDownUtility.*;
import static Utilities.JavaScriptUtility.scrollToElementJs;

public class SelectMenuItem extends WidgetPage{

    private By standardMultiSelect=By.id("cars");

    public void MultiSelect(String text){
        scrollToElementJs(standardMultiSelect);
//        Select select=new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);

        selectByVisibleText(standardMultiSelect,text);

    }

    public void MultiSelect(int index){
        scrollToElementJs(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }

    public void deSelectMulti(String text){
        scrollToElementJs(standardMultiSelect);
        deSelectByValue(standardMultiSelect,text);
    }

    public List<String> getMultiAllSelectedOptions(){
        scrollToElementJs(standardMultiSelect);
        return getAllSelectedOptions(standardMultiSelect);
    }
}
