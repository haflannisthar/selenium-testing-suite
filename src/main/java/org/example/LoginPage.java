package org.example;

import org.Base.BasePage;
import org.openqa.selenium.By;


// LoginPage class extends BasePage to manage interactions with the login page
public class LoginPage extends BasePage {
    // Locators for the username field, password field, login button, and error message
    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    // Method to set the username in the username field
    public void setUserName(String username) {
        set(userNameField, username); // Calls the set method from BasePage
    }

    // Method to set the password in the password field
    public void setPassword(String password) {
        set(passwordField, password); // Calls the set method from BasePage
    }

    // Method to click the login button and return a new instance of ProductsPage
    public ProductsPage clickButton() {
        click(loginButton); // Calls the click method from BasePage
        return new ProductsPage(); // Return a new instance of ProductsPage
    }

    // Method to log in to the application using provided credentials
    public ProductsPage loginToApp(String username, String password) {
        setUserName(username); // Set the username
        setPassword(password); // Set the password
        return clickButton(); // Click the login button
    }

    // Method to get the error message displayed on the login page
    public String getErrorMessage() {
        return find(errorMessage).getText(); // Get and return the error message text
    }
}
