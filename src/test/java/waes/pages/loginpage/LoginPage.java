package waes.pages.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import waes.pages.homepage.HomePage;

/**
 * Login Page page object - Selectors and methods returning page object elements to be used in steps definitions
 */
public class LoginPage extends HomePage{

    LoginPage() {
        super();
    }

    /**
     * Selectors for page elements
     */
    @FindBy(id = "username_input")
    private WebElement user_input;

    @FindBy(id = "password_input")
    private WebElement password_input;

    @FindBy(id = "login_button")
    private WebElement login_button;

    /**
     * Elements Methods
     */
    WebElement username() {
        wait.forElementToBeDisplayed(10, this.user_input, "username");
        return user_input;
    }

    WebElement password() {
        return password_input;
    }

    WebElement loginButton() {
        wait.forElementToBeDisplayed(10, this.login_button, "login_button");
        return login_button;
    }
}