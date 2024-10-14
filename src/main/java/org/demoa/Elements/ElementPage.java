package org.demoa.Elements;

import org.demoa.HomePage;
import org.openqa.selenium.By;

public class ElementPage extends HomePage {

    private By webTableElement= By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    private By linkElement=By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablePage clickWebTable(){
        click(webTableElement);
        return new WebTablePage();
    }

    public LinkPage clickLinks(){
        click(linkElement);
        return new LinkPage();
    }
}
