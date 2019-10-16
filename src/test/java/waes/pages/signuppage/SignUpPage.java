package waes.pages.signuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import waes.pages.homepage.HomePage;

/**
 * Sign Up Page page object - Selectors and methods returning page object elements to be used in steps definitions
 */
public class SignUpPage extends HomePage{

    SignUpPage() {
        super();
    }

    /**
     * Selectors for page elements
     */
    @FindBy(id = "username_input")
    private WebElement user_input;

    @FindBy(id = "password_input")
    private WebElement password_input;

    @FindBy(id = "name_input")
    private WebElement name_input;

    @FindBy(id = "email_input")
    private WebElement email_input;

    @FindBy(id = "submit_button")
    private WebElement submit_button;
    
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

    WebElement name() {
        return name_input;
    }

    WebElement email() {
        return email_input;
    }

    Select day() {
        Select day_dropdown = new Select(driver.findElement(By.id("day_select")));
        return day_dropdown;
    }

    Select month() {
        Select month_dropdown = new Select(driver.findElement(By.id("month_select")));
        return month_dropdown;
    }
    
    Select year() {
        Select year_dropdown = new Select(driver.findElement(By.id("year_select")));
        return year_dropdown;
    }

    WebElement submitButton() {
        wait.forElementToBeDisplayed(10, this.submit_button, "submit_button");
        return submit_button;
    }

    
}