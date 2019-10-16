package waes.pages.homepage;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * Class with assertion and element interaction methods for tests using HomePage page object.
 */
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

    @And("^I click the WAES Link$")
    public void clickWaesLink() {
        this.homePage.waesLink().click();
    }

    @And("^I should see WAES url$")
    public void checkWaesUrl() {
        assertTrue(this.homePage.url().equals("https://www.wearewaes.com/"));
    }

    @And("^I should see the \"([^\"]*)\" title$")
    public void checkHomePage(String homeTitle) {
        assertTrue(this.homePage.title().getText().contains(homeTitle));
    }
}
