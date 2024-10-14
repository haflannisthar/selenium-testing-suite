package org.demoa.Forms;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJs;

public class PracticeFormPage extends FormPage{

    private By femaleRadioButton=By.id("gender-radio-2");
    private  By sportsHobbyCheckBox=By.id("hobbies-checkbox-1");
    private  By readingHobbyCheckBox=By.id("hobbies-checkbox-2");
    private  By musicHoobyCheckBox=By.id("hobbies-checkbox-3");

    private  By submitBtn=By.id("submit");

    public void clickFemaleRadioButton(){
        scrollToElementJs(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleClicked(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportCheckBox(){
       if (!find(sportsHobbyCheckBox).isSelected()){
           scrollToElementJs(sportsHobbyCheckBox);
           clickJS(sportsHobbyCheckBox);
       }
    }

    public void clickReadCheckBox(){
        if (!find(readingHobbyCheckBox).isSelected()){
            scrollToElementJs(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public void clickMusicCheckBox(){
        if (!find(musicHoobyCheckBox).isSelected()){
            scrollToElementJs(musicHoobyCheckBox);
            clickJS(musicHoobyCheckBox);
        }
    }

    public void unClickMusicCheckBox(){
        if (find(musicHoobyCheckBox).isSelected()){
            scrollToElementJs(musicHoobyCheckBox);
            clickJS(musicHoobyCheckBox);
        }
    }

    public boolean isMusicSelected(){
        return find(musicHoobyCheckBox).isSelected();
    }

    public void clickSubmitBtn(){
//        scrollToElementJs(submitBtn);
        click(submitBtn);
    }
}
