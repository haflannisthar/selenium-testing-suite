package part3.com.demoqa.test.part1.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class LinkTests extends BaseTest {

    @Test
    public void testLink() throws InterruptedException {
        var linkPage=homePage.goToElement().clickLinks();
        linkPage.clickBadRequestLink();
      String actualResponse=linkPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "Actual Response ("+actualResponse+" ) \n does not contain 400 and bad request ");

    }


}
