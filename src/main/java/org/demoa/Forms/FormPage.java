package org.demoa.Forms;

import org.demoa.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;


// FormPage class that extends HomePage to handle interactions on the form page
public class FormPage extends HomePage {

    // Locator for the Practice Form menu item
    private By practice = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    // Method to click on the Practice Form link and navigate to the PracticeFormPage
    public PracticeFormPage clickPracticeForm() {
        scrollToElementJs(practice); // Scroll to the Practice Form element
        click(practice); // Click on the Practice Form link

        return new PracticeFormPage(); // Return a new instance of PracticeFormPage
    }
}

