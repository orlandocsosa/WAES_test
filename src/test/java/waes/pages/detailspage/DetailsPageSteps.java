package waes.pages.detailspage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DetailsPageSteps {

    private DetailsPage detailsPage;

    public DetailsPageSteps() {
        this.detailsPage = new DetailsPage();
    }

    // @Given("^I set \"([^\"]*)\" as username$")
    // public void setUsername(String user) throws InterruptedException {
    //     this.loginPage.username().sendKeys(user);
    // }

    // @And("^I set \"([^\"]*)\" as password$")
    // public void setPassword(String password) {
    //     this.loginPage.password().sendKeys(password);
    // }

    // @And("^I click the LoginPage Login button$")
    // public void login() throws InterruptedException {
    //     this.loginPage.LoginButton().click();
    // }
}
