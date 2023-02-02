package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By emailField = By.cssSelector("input[data-test='email']");
    By passwordField = By.id("password");
    By loginButton = By.cssSelector("input[data-test='login-submit']");
    private By signInLink = By.cssSelector("a[data-test='nav-sign-in']");

    By userNameInMenu = By.id("user-menu");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginUser(String username, String password){
        typeIn(emailField, username);
        typeIn(passwordField, password);
        clickOnElement(loginButton);
        return this;
    }


}
