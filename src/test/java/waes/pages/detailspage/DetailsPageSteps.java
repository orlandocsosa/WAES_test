package waes.pages.detailspage;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;

public class DetailsPageSteps {

    private DetailsPage detailsPage;

    public DetailsPageSteps() {
        this.detailsPage = new DetailsPage();
    }

    @Given("^I should see \"([^\"]*)\" and \"([^\"]*)\" in Details page$")
    public void setUsername(String name, String email) {
        String name_element_text = this.detailsPage.name().getText();
        String email_element_text = this.detailsPage.email().getText();
        assertTrue(name_element_text.contains(name));
        assertTrue(email_element_text.contains(email));
    }
}
