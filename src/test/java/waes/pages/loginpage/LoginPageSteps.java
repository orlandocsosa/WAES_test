package waes.pages.loginpage;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * Class with assertion and element interaction methods for tests using LoginPage page object.
 */
public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("^I set \"([^\"]*)\" as username$")
    public void setUsername(String user) {
        this.loginPage.username().sendKeys(user);
    }

    @And("^I set \"([^\"]*)\" as password$")
    public void setPassword(String password) {
        this.loginPage.password().sendKeys(password);
    }

    @And("^I click the LoginPage Login button$")
    public void login() {
        this.loginPage.loginButton().click();
    }

    @And("^I should see \"([^\"]*)\" message in status component$")
    public void checkMessage(String message){
        assertTrue(this.loginPage.userStatus().getText().contains(message));
    }

    @And("^I click the Heroes Profile button$")
    public void clickHomeButton() {
        this.loginPage.homeButton().click();
    }
}
