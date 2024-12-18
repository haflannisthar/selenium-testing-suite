package org.demoa;

import org.demoa.Alerts_Frames_Windows.Alerts_Frames_WindowsPage;
import org.demoa.Elements.ElementPage;
import org.demoa.Forms.FormPage;
import org.Base.BasePage;
import org.demoa.Widgets.WidgetPage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJs;

// HomePage class extends BasePage to manage interactions with the home page
public class HomePage extends BasePage {

    // Locators for different cards on the home page
    private By formCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertCard=By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]") ;



    // Method to navigate to the Forms page
    public FormPage goToForms() {
        scrollToElementJs(formCard); // Scroll to the Forms card
        click(formCard); // Click on the Forms card
        return new FormPage(); // Return a new instance of FormPage
    }

    // Method to navigate to the Elements page
    public ElementPage goToElement() {
        scrollToElementJs(elementCard); // Scroll to the Elements card
        click(elementCard); // Click on the Elements card
        return new ElementPage(); // Return a new instance of ElementPage
    }

    // Method to navigate to the Widgets page
    public WidgetPage goToWidgets() {
        scrollToElementJs(widgetCard); // Scroll to the Widgets card
        click(widgetCard); // Click on the Widgets card
        return new WidgetPage(); // Return a new instance of WidgetPage
    }

    // Method to navigate to the Alerts_Frames_WindowsPage page
    public Alerts_Frames_WindowsPage goToAlertsWindowsCard(){
        scrollToElementJs(alertCard); //scroll
        click(alertCard); //click the Alerts_Frames_WindowsPage card
        return new Alerts_Frames_WindowsPage(); //return a new instance of Alerts_Frames_WindowsPage
    }
}

