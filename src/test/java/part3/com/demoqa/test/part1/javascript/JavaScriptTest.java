package part3.com.demoqa.test.part1.javascript;

import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
    }
}