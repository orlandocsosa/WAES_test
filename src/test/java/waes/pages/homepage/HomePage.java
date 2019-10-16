package waes.pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import waes.pages.BasePage;

/**
 * Home Page page object - Selectors and methods returning page object elements to be used in steps definitions
 */
public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://waesworks.bitbucket.io/";

    /**
     * Selectors for page elements
     */
    @FindBy(xpath = "/html/body/div/div/div/main/section/h1")
    private WebElement title;

    @FindBy(id = "login_link")
    private WebElement loginButton;

    @FindBy(className = "footer-module--footer__img--VfhG8")
    private WebElement waesLink;

    @FindBy(id = "signup_link")
    private WebElement signUpButton;

    @FindBy(id = "home_link")
    private WebElement homeButton;

    @FindBy(id = "status")
    private WebElement status;

    protected HomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Go to WAES Login page method
     */
    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }
    /**
     * Elements Methods
     */
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

    public WebElement userStatus() {
        return status;
    }

    public WebElement waesLink() {
        return waesLink;
    }

    /**
     * Method for retrieving the current url of browser
     */
    public String url() {
        return driver.getCurrentUrl();
    }
}