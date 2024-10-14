package org.example;

import org.Base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    // Locators for the prodcut header

    private By productHeader=By.xpath("//span[text()='Products']");

//    check that the product header s displayed
    public boolean isProductHeaderDisplayed(){
        return find(productHeader).isDisplayed();
    }
}
