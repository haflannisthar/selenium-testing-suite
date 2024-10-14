package part3.com.demoqa.test.part1.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    String Month="October";
    String monthInNumber="10";
    String day="16";
    String year="2024";


    @Test
    public void testSelectingDate(){
        var datePickerPage=homePage.GoToWidgets().clickDatePicker();
                datePickerPage.clickSelectDate();
                datePickerPage.selectMonth(Month);
                datePickerPage.selectYear(year);
                datePickerPage.clickDate(day);


                String actualDate=datePickerPage.getDate();
                String expectedDate=monthInNumber+"/"+day+"/"+year;
        Assert.assertEquals(actualDate,expectedDate,"ACTUAL AND EXPECTED DATE DO NOT MATCH \n actual date : "+actualDate +"\nExpected date : "+expectedDate);
    }

}
