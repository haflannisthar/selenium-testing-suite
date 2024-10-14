package par2.com.sourcedemo.base;

import org.Base.BasePage;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
// BaseTest class serves as a foundation for all test classes
public class BaseTest {

    // Protected members for driver and page objects to be accessible in derived test classes
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;

    // URL for the application to be tested
    private String url = "https://www.saucedemo.com/";

    // Method to set up the test environment before any test methods in derived classes are executed
    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver and maximize the browser window
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the specified URL
        driver.get(url);

        // Initialize page objects
        basePage = new BasePage();
        basePage.setDriver(driver); // Set the driver for the base page
        loginPage = new LoginPage(); // Initialize the LoginPage object
    }

    // Method to clean up resources after all test methods in derived classes are executed
    @AfterClass
    public void tearDown() {
        // Quit the browser and close all associated windows
        driver.quit();
    }
}