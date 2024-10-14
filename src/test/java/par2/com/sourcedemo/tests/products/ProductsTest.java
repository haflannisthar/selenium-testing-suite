package par2.com.sourcedemo.tests.products;

import org.example.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import par2.com.sourcedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductHeadDisplayed(){
     ProductsPage productsPage= loginPage.loginToApp("standard_user","secret_sauce");

     assertTrue(productsPage.isProductHeaderDisplayed(),"Product header not displayed");
    }
}
