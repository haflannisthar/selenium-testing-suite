package part3.com.demoqa.test.part2.screenshot;

import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class CaptureFailedScreenShotTest extends BaseTest {


    @Test
    public void testClickingSubmitButtonWithoutJavascriptExecutor(){
        var practiceFormPage=homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitBtn();
    }

}
