package part3.com.demoqa.test.part1.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){
        var selectMenuPage=homePage.GoToWidgets().clickMenu();
        selectMenuPage.MultiSelect("Volvo");
        selectMenuPage.MultiSelect(1);
        selectMenuPage.MultiSelect("Audi");
        selectMenuPage.MultiSelect(2);

        selectMenuPage.deSelectMulti("saab");

       List<String> actualSelectedOptions=selectMenuPage.getMultiAllSelectedOptions();

        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
