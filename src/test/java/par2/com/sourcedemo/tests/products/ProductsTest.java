package par2.com.sourcedemo.tests.products;

import org.example.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import par2.com.sourcedemo.base.BaseTest;


// ProductsTest class extends BaseTest to utilize common setup and teardown functionality
public class ProductsTest extends BaseTest {

    // Test method to verify that the product header is displayed after logging in
    @Test
    public void testProductHeadDisplayed() {
        // Log in to the application with valid credentials and retrieve the ProductsPage
        ProductsPage productsPage = loginPage.loginToApp("standard_user", "secret_sauce");

        // Assert that the product header is displayed on the ProductsPage
        assertTrue(productsPage.isProductHeaderDisplayed(), "Product header not displayed");
    }
}