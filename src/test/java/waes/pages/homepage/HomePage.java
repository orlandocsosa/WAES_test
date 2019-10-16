package waes.pages.homepage;

import waes.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://waesworks.bitbucket.io/";

    @FindBy(xpath = "/html/body/div/div/div/main/section/h1")
    private WebElement title;

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

    public WebElement homeButton() {
        return homeButton;
    }

    WebElement title() {
        wait.forElementToBeDisplayed(10, this.title, "Title");
        return title;
    }

    public WebElement logInButton() {
        wait.forElementToBeDisplayed(10, this.loginButton, "Login");
        return loginButton;
    }

    public WebElement signUpButton() {
        return signUpButton;
    }
}