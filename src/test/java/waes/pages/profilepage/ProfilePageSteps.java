package waes.pages.profilepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class ProfilePageSteps {

    private ProfilePage profilePage;

    public ProfilePageSteps() {
        this.profilePage = new ProfilePage();
    }

    @Given("^A user navigates WAES HomePage$")
    public void aUserNavigatesToHomePage() {
        // this.homePage.goToHomePage();
    }

    @And("^I click the LogIn button$")
    public void clickLoginButton() throws InterruptedException {
        // this.homePage.logInButton().click();
    }

    @And("^I click the SignUp button$")
    public void clickSignUpButton() throws InterruptedException {
        // this.homePage.logInButton().click();
    }
}
