package part3.com.demoqa.test.part2.Interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void sliderTest(){

        int x=400;
        int y=0;

       var sliderPage=homePage.goToWidgets().clickSliderMenu();
       sliderPage.moveSlider(x,y);
       String actualValue=sliderPage.getSliderValue();
       String expectedValue="25";
        Assert.assertEquals(actualValue,expectedValue,"\n actual and expected value do not match");
    }
}
