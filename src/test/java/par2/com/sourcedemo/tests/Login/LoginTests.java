package par2.com.sourcedemo.tests.Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import par2.com.sourcedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("256632541");
        loginPage.clickButton();
        String actualErrorMessage=loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"));
    }
}
