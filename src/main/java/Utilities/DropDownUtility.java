package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility{


    private static Select findByDropDown(By locator){
        return new Select(driver.findElement(locator));
    }

    public  static void selectByVisibleText(By locator,String text){
        findByDropDown(locator).selectByVisibleText(text);
    }

    public  static void selectByIndex(By locator,int index){
        findByDropDown(locator).selectByIndex(index);
    }

    public  static void selectByValue(By locator,String text){
        findByDropDown(locator).selectByValue(text);
    }

    public static void deSelectByValue(By locator,String text){
        findByDropDown(locator).deselectByValue(text);
    }


    public static List<String> getAllSelectedOptions(By locator){
       List<WebElement> allSelectedOptions=findByDropDown(locator).getAllSelectedOptions();
       return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
