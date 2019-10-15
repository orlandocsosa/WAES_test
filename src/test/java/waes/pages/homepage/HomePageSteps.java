package waes.pages.homepage;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^I navigate to WAES HomePage$")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @And("^I click the LogIn button$")
    public void clickLoginButton() {
        this.homePage.logInButton().click();
    }

    @And("^I click the SignUp button$")
    public void clickSignUpButton() {
        this.homePage.signUpButton().click();
    }

    @And("^I should see the \"([^\"]*)\" title$")
    public void checkHomePage(String homeTitle) {
        assertTrue(this.homePage.title().getText().contains(homeTitle));
    }
}
