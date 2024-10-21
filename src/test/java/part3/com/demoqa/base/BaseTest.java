package part3.com.demoqa.base;

import org.demoa.HomePage;
import org.Base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static Utilities.Utility.setUtilityDriver;

// BaseTest class serves as a foundation for other test classes
public class BaseTest {

    // WebDriver instance to control the browser
    private WebDriver driver;

    // Page object instances for base page and home page
    protected BasePage basePage;
    protected HomePage homePage;

    // URL for the demo application
    private String demoQA = "https://demoqa.com/";

    // Set up method that runs before any test class methods
    @BeforeClass
    public void setUp() {
        // Initialize the ChromeDriver and maximize the browser window
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        implicit wait
//        do not combine implicit wait and explicit wait coz that can cause unexpected wait times
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Set the maximum amount of time to wait for a page to load (5 seconds).
// If the page does not load within this time, throw an error.
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

// Set the maximum amount of time to wait for JavaScript or asynchronous scripts to finish (5 seconds).
// If the script takes longer than this, throw an error.
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

    }

    // Method to capture a screenshot if a test fails
    @AfterMethod
    public void takeFailedResultScreenShot(ITestResult testResult) {
        // Check if the test failed
        if (ITestResult.FAILURE == testResult.getStatus()) {
            // Cast the driver to TakesScreenshot to capture the screenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);

            // Format the timestamp to make it safe for file names
            String timestamp = java.time.LocalDateTime.now()
                    .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS"));
            // Generate a file name for the screenshot
            String fileName = String.format("screenshot_%s_(%s).png", timestamp, testResult.getName());

            // Set the destination path for the screenshot
            File destination = new File("D:\\SeleniumTesting\\SeleniumFirstProject\\src\\main\\resources\\screenshots\\" + fileName);

            try {
                // Copy the screenshot from source to destination
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e); // Handle the exception if file operations fail
            }

            // Print the location of the screenshot
            System.out.println("Screenshot Located at " + destination);
        }
    }

    // Method to load the application before each test method
    @BeforeMethod
    public void loadApplication() {
        // Navigate to the demo QA URL
        driver.get(demoQA);
        basePage = new BasePage(); // Initialize the BasePage
        basePage.setDriver(driver); // Set the WebDriver for the base page
        setUtilityDriver(); // (Assuming this sets up some utility for the driver)
        homePage = new HomePage(); // Initialize the HomePage
    }

    // Tear down method that runs after all test methods in the class
    @AfterClass
    public void tearDown() throws InterruptedException {
        // Sleep for a short duration before closing the browser
        Thread.sleep(2000);
        driver.quit(); // Close the browser and end the WebDriver session
    }
}