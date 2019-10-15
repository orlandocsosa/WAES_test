package waes.pages.homepage;

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
    public void clickLoginButton() throws InterruptedException {
        this.homePage.logInButton().click();
    }

    @And("^I click the SignUp button$")
    public void clickSignUpButton() throws InterruptedException {
        this.homePage.signUpButton().click();
    }
}
