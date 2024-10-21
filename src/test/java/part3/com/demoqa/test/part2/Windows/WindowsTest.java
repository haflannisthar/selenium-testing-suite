package part3.com.demoqa.test.part2.Windows;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import static Utilities.GetUtilities.getURL;

public class WindowsTest extends BaseTest {
    @Test
    public void testWindow(){

        var windowPage=homePage.goToAlertsWindowsCard().clickBrowserWindowPage();
        windowPage.clickNewWindowBtn();
        windowPage.switchToNewWindow();
        String actualUrl=getURL();
        String expectedURL="https://demoqa.com/sample";
        Assert.assertEquals(actualUrl,expectedURL,"\n actual and expected URL doesnt match \n");
    }
}
