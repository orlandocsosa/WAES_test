package waes.pages.loginpage;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("^I set \"([^\"]*)\" as username$")
    public void setUsername(String user) throws InterruptedException {
        this.loginPage.username().sendKeys(user);
    }

    @And("^I set \"([^\"]*)\" as password$")
    public void setPassword(String password) {
        this.loginPage.password().sendKeys(password);
    }

    @And("^I click the LoginPage Login button$")
    public void login(){
        this.loginPage.loginButton().click();
    }

    @And("^I should see the Login button from Login page$")
    public void checkLoginPresent(){
        assertTrue(this.loginPage.loginButton().isDisplayed());
    }
}
