package org.demoa;

import org.demoa.Elements.ElementPage;
import org.demoa.Forms.FormPage;
import org.Base.BasePage;
import org.demoa.Widgets.WidgetPage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

public class HomePage extends BasePage {

    private By formCard=By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By  elementCard=By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By  widgetCard=By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormPage goToForms(){
        scrollToElementJs(formCard);
           click(formCard);
           return new FormPage();
    }

    public ElementPage goToElement(){
        scrollToElementJs(elementCard);
        click(elementCard);
        return new ElementPage();
    }

    public WidgetPage GoToWidgets(){
        scrollToElementJs(widgetCard);
        click(widgetCard);
        return new WidgetPage();
    }

}
