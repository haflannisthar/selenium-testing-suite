package part3.com.demoqa.test.part1.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class checkBoxTest extends BaseTest {

    @Test
    public void testCheckBox(){
        var FormPage=homePage.goToForms().clickPracticeForm();
        FormPage.clickMusicCheckBox();
        FormPage.clickReadCheckBox();
        FormPage.clickSportCheckBox();
        FormPage.unClickMusicCheckBox();

      boolean isMusicCheckBoxSelected=FormPage.isMusicSelected();

        Assert.assertFalse(isMusicCheckBoxSelected,"Music CheckBox is Selected");
    }
}
