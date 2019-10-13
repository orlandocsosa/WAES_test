package waes.pages.homepage;

import waes.pages.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://waesworks.bitbucket.io/";

    @FindBy(id = "login_link")
    private WebElement loginButton;

    @FindBy(id = "signup_link")
    private WebElement signUpButton;

    @FindBy(id = "home_link")
    private WebElement homeButton;

    protected HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    WebElement homeButton() {
        return homeButton;
    }

    WebElement logInButton() {
        return loginButton;
    }

    WebElement signUpButton() {
        return signUpButton;
    }
}