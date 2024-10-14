package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// This is the main class where the Selenium test will be written
public class FirstSeleniumFailTest {

    // Declare a WebDriver object. This will control the browser.
    WebDriver driver;

    // This method will run before all the test methods in this class.
    // It sets up the environment for the test.
    @BeforeClass
    public void setUp() {
        // Create an instance of ChromeDriver to open the Chrome browser.
        driver = new ChromeDriver();

        // Maximize the browser window so it fills the screen.
        driver.manage().window().maximize();

        // Open the specified website URL (in this case, the OrangeHRM login page).
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // This method will run after all the test methods in this class.
    // It's used to clean up or close the browser after the test.
    @AfterClass
    public void tearDown() {
        // Quit or close the browser after the tests are done.
        // This is commented out, so the browser will not close automatically.
        // Uncomment it when you want the browser to close after the test.
        // driver.quit();
    }

    // This is the test method where we perform the actual login test.
    @Test
    public void loginToApplication() throws InterruptedException {

        // Pause the program for 2 seconds to wait for the page to load fully.
        // In real-world testing, you should avoid using Thread.sleep and use WebDriver waits instead.
        Thread.sleep(2000);

        // Find the username input field on the webpage by its name attribute (name="username").
        // Save the element into a WebElement variable called 'userName'.
        WebElement userName = driver.findElement(By.name("username"));

        // Type "Admin" into the username field (simulate typing the username).
        userName.sendKeys("Admin");

        // Similarly, find the password input field by its name attribute (name="password").
        var password = driver.findElement(By.name("password"));

        // Type "admin123" into the password field (simulate typing the password).
        password.sendKeys("admin123");

        // Find the login button by its HTML tag name ("button").
        // Since there is only one button on this page, we use the tag name to find it.
        // Simulate clicking the login button to submit the login form.
        driver.findElement(By.tagName("button")).click();


//        not good using Thread.sleep this is for demo purpose
        Thread.sleep(2000);
//        get the value of something in dashboard  (here h6 is taken coz there is only one h6)
//        check with the expected results
        String actualResults=driver.findElement(By.tagName("h6")).getText();
        String expectedResults="Dashboard";

        Assert.assertNotEquals(actualResults,expectedResults);

    }
}
