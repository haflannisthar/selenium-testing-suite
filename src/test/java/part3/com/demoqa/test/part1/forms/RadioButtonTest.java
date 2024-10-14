package part3.com.demoqa.test.part1.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void TestRadioButton(){
        var formPage=homePage.goToForms().clickPracticeForm();
        formPage.clickFemaleRadioButton();
      boolean isFemaleButtonSelected=formPage.isFemaleClicked();

        Assert.assertTrue(isFemaleButtonSelected,"Female Button is not selected");
    }
}
