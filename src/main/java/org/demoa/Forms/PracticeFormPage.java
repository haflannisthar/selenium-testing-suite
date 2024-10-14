package org.demoa.Forms;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJs;

// PracticeFormPage class that extends FormPage to handle interactions on the practice form page
public class PracticeFormPage extends FormPage {

    // Locators for various elements on the practice form page
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckBox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckBox = By.id("hobbies-checkbox-2");
    private By musicHoobyCheckBox = By.id("hobbies-checkbox-3");
    private By submitBtn = By.id("submit");

    // Method to click the female radio button
    public void clickFemaleRadioButton() {
        scrollToElementJs(femaleRadioButton); // Scroll to the female radio button
        clickJS(femaleRadioButton); // Click the female radio button
    }

    // Method to check if the female radio button is selected
    public boolean isFemaleClicked() {
        return find(femaleRadioButton).isSelected(); // Return true if selected, false otherwise
    }

    // Method to click the sports hobby checkbox if not already selected
    public void clickSportCheckBox() {
        if (!find(sportsHobbyCheckBox).isSelected()) {
            scrollToElementJs(sportsHobbyCheckBox); // Scroll to the sports checkbox
            clickJS(sportsHobbyCheckBox); // Click the sports checkbox
        }
    }

    // Method to click the reading hobby checkbox if not already selected
    public void clickReadCheckBox() {
        if (!find(readingHobbyCheckBox).isSelected()) {
            scrollToElementJs(readingHobbyCheckBox); // Scroll to the reading checkbox
            clickJS(readingHobbyCheckBox); // Click the reading checkbox
        }
    }

    // Method to click the music hobby checkbox if not already selected
    public void clickMusicCheckBox() {
        if (!find(musicHoobyCheckBox).isSelected()) {
            scrollToElementJs(musicHoobyCheckBox); // Scroll to the music checkbox
            clickJS(musicHoobyCheckBox); // Click the music checkbox
        }
    }

    // Method to unselect the music hobby checkbox if selected
    public void unClickMusicCheckBox() {
        if (find(musicHoobyCheckBox).isSelected()) {
            scrollToElementJs(musicHoobyCheckBox); // Scroll to the music checkbox
            clickJS(musicHoobyCheckBox); // Click to unselect the music checkbox
        }
    }

    // Method to check if the music hobby checkbox is selected
    public boolean isMusicSelected() {
        return find(musicHoobyCheckBox).isSelected(); // Return true if selected, false otherwise
    }

    // Method to click the submit button
    public void clickSubmitBtn() {
        click(submitBtn); // Click the submit button
    }
}

