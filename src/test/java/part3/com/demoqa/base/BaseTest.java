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

import static Utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String demoQA="https://demoqa.com/";


    @BeforeClass
    public  void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void takeFailedResultScreenShot(ITestResult testResult){
        if (ITestResult.FAILURE== testResult.getStatus()){
           TakesScreenshot screenshot= (TakesScreenshot) driver;
          File source=screenshot.getScreenshotAs(OutputType.FILE);
            // Format the timestamp to make it safe for file names
            String timestamp = java.time.LocalDateTime.now()
                    .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS"));
            String fileName = String.format("screenshot_%s_(%s).png", timestamp, testResult.getName());
            File destination = new File("D:\\SeleniumTesting\\SeleniumFirstProject\\src\\main\\resources\\screenshots\\" + fileName);

            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Screenshot Located at "+destination);

        }
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(demoQA);
        basePage=new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage=new HomePage();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
