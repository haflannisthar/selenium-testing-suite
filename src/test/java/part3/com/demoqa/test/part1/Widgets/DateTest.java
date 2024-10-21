package part3.com.demoqa.test.part1.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;


// DateTest class extends BaseTest to inherit common setup and teardown functionality
public class DateTest extends BaseTest {

    // Test data for the date selection
    String Month = "October";       // Name of the month to select
    String monthInNumber = "10";    // Month in numeric format
    String day = "16";               // Day of the month
    String year = "2024";            // Year to select

    // Test method to verify the functionality of the date picker
    @Test
    public void testSelectingDate() {
        // Navigate to the widgets section and click on the date picker
        var datePickerPage = homePage.goToWidgets().clickDatePicker();

        // Click to select a date
        datePickerPage.clickSelectDate();

        // Select the desired month and year
        datePickerPage.selectMonth(Month);
        datePickerPage.selectYear(year);

        // Click the specified day on the date picker
        datePickerPage.clickDate(day);

        // Retrieve the actual selected date from the date picker
        String actualDate = datePickerPage.getDate();

        // Format the expected date for comparison
        String expectedDate = monthInNumber + "/" + day + "/" + year;

        // Assert that the actual selected date matches the expected date
        Assert.assertEquals(actualDate, expectedDate,
                "ACTUAL AND EXPECTED DATE DO NOT MATCH \n" +
                        "actual date: " + actualDate + "\n" +
                        "expected date: " + expectedDate);
    }
}
