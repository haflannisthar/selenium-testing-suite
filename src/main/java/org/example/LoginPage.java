package org.example;

import org.Base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By userNameField=By.id("user-name");
    private By passwordField=By.id("password");
    private By loginButton=By.id("login-button");
    private By errorMessage=By.cssSelector("#login_button_container h3");


    public void setUserName(String username){
        set(userNameField,username);
    }
    public void setPassword(String password){
        set(passwordField,password);
    }
    public ProductsPage clickButton(){
        click(loginButton);

        return new ProductsPage();
    }


    public ProductsPage loginToApp(String username,String password){
        setUserName(username);
        setPassword(password);
        return clickButton();
    }

public String getErrorMessage(){
        return find(errorMessage).getText();
}

}
