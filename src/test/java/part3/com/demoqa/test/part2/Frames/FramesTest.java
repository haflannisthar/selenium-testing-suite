package part3.com.demoqa.test.part2.Frames;


import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;


@Test
public class FramesTest extends BaseTest {

    /*
     *  get the text in the iframe by string
     */
    public void testFrames(){
        var framesPage=homePage.goToAlertsWindowsCard().clickFrames();
       String actualResult=framesPage.getTextInFromFrame();

        Assert.assertEquals(actualResult,"This is a sample page","\n actual and expected text do not match");
        String actualHeaderText=framesPage.getHeaderFrameText();
        String expectedHeaderText="Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"actual and expected header text do not match");
    }


    /*
     *  get the text in the iframe by index
     */
    public void  testSmallFrame(){


        var framesPage=homePage.goToAlertsWindowsCard().clickFrames();
        String actualResult=framesPage.getSmallFrameText();
        Assert.assertEquals(actualResult,"This is a sample page","\n actual and expected small box text do not match");

        String actualHeaderText=framesPage.getHeaderFrameText();
        String expectedHeaderText="Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"actual and expected header text do not match");

    }


    /*
    *  get the text in the iframe by web element
     */
    public void  testSmallFrameByWebElement(){


        var framesPage=homePage.goToAlertsWindowsCard().clickFrames();
        String actualResult=framesPage.getSmallFrameTextByWebElement();
        Assert.assertEquals(actualResult,"This is a sample page","\n actual and expected small box text do not match");

        String actualHeaderText=framesPage.getHeaderFrameText();
        String expectedHeaderText="Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"actual and expected header text do not match");

    }



}
