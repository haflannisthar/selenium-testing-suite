package part3.com.demoqa.test.part1.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable(){
        var webTablePage=homePage.goToElement().clickWebTable();
        webTablePage.clickEdit("alden@example.com");
        webTablePage.setAge("22");
        webTablePage.clickSubmitBtn();

       String actualAge=webTablePage.getTableAge("alden@example.com");
       String expectedAge="22";

        Assert.assertEquals(actualAge,expectedAge,"Actual age and expected age do not match");
    }
}
