package part3.com.demoqa.test.part2.Dynamic_Wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {


@Test
public void testVisibleAfterButtonTest(){
    var dynamicPage=homePage.goToElement().clickDynamicProperty();
   String actualResult=dynamicPage.getVisibleAfterText();
   String expectedText="Visible After 5 Seconds";
    Assert.assertEquals(actualResult,expectedText," actual and expected result doesn't match");
}


@Test
    public void testProgressBar(){
    var progressPage=homePage.goToWidgets().clickProgressBarMenu();
    progressPage.clickStartButton();
  String actualValue=progressPage.getProgressValue();
  String expectedValue="100%";

  Assert.assertEquals(actualValue,expectedValue,"\n actual  value is not 100%");

}

}
