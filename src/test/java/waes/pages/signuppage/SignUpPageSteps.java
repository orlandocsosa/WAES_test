package waes.pages.signuppage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * Class with assertion and element interaction methods for tests using SignUpPage page object.
 */
public class SignUpPageSteps {

    private SignUpPage signUpPage;

    public SignUpPageSteps() {
        this.signUpPage = new SignUpPage();
    }

    @Given("^I set \"([^\"]*)\" as username in Sign Up Page$")
    public void setUsername(String user) {
        this.signUpPage.username().sendKeys(user);
    }

    @And("^I set \"([^\"]*)\" as password in Sign Up Page$")
    public void setPassword(String password) {
        this.signUpPage.password().sendKeys(password);
    }

    @And("^I set \"([^\"]*)\" as name in Sign Up Page$")
    public void setName(String name) {
        this.signUpPage.name().sendKeys(name);
    }

    @And("^I set \"([^\"]*)\" as email in Sign Up Page$")
    public void setEmail(String email) {
        this.signUpPage.email().sendKeys(email);
    }

    @And("^I click the Sign Up Page submit button$")
    public void submit() {
        JavascriptExecutor executor = this.signUpPage.jsExecutor();
        executor.executeScript("arguments[0].click();", this.signUpPage.submitButton());
    }

    @And("^I should see \"([^\"]*)\" message in status component$")
    public void checkMessage(String message){
        assertTrue(this.signUpPage.userStatus().getText().contains(message));
    }

    @And("^I set \"([^\"]*)\"/\"([^\"]*)\"/\"([^\"]*)\" in date of birth dropdowns$")
    public void setDateOfBirth(String day,String month,String year) {
        this.signUpPage.day().selectByVisibleText(day);;
        this.signUpPage.month().selectByVisibleText(month);
        this.signUpPage.year().selectByVisibleText(year);
    }
}
