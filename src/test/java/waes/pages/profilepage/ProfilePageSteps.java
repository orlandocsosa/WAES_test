package waes.pages.profilepage;

import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import cucumber.api.java.en.And;

public class ProfilePageSteps {

    private ProfilePage profilePage;

    public ProfilePageSteps() {
        this.profilePage = new ProfilePage();
    }
  
    @And("^I should see the Welcome message for the \"([^\"]*)\" user$")
    public void checkWelcomeMessage(String user) {
        String message = this.profilePage.welcomeMessage().getText();
        assertTrue(message.contains("How are you doing"));
        assertTrue(message.toLowerCase().contains(user));
    }

    @And("^I should see the New User Welcome message for the \"([^\"]*)\" user$")
    public void checkNewUserMessage(String user) {
        String message = this.profilePage.welcomeMessage().getText();
        assertTrue(message.contains("Welcome to your new profile page"));
        assertTrue(message.toLowerCase().contains(user));
    }

    @And("^I should show see following superpower: \"([^\"]*)\"$")
    public void checkSuperpower(String superpower) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String message = this.profilePage.superPowerMessage().getText();
        assertTrue(message.contains(superpower));
    }

    @And("^I click the Logout button$")
    public void logOut() {
        this.profilePage.logout_link().click();
    }

    @And("^I click the Details Link$")
    public void clickDetailsLink() {
        this.profilePage.detailsLink().click();
    }

    @And("^I should see a table with the following users and emails$")
    public void checkTable(Map<String,String> map) throws InterruptedException {
        for ( String key : map.keySet() ) {
            String element = this.profilePage.usersTable().findElement(By.xpath("//*[text()='" + key +"']/parent::tr")).getText();
            String value = map.get(key);
            assertTrue(element.contains(value));
        }
    }
 
}
