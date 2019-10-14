package waes.pages.profilepage;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebElement;

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

    @And("^I should show see following superpower: \"([^\"]*)\"$")
    public void checkSuperpower(String superpower) {
        String message = this.profilePage.superPowerMessage().getText();
        assertTrue(message.contains(superpower));
    }

    @And("^I click the Logout button$")
    public void logOut() {
        this.profilePage.logout_link().click();
    }

    // @And("^I should see a table with the following users$")
    // public void checkTable(ArrayList<String> array) {
    //     // List<WebElement> tableElements = this.profilePage.usersTable();
    //     for (String user : array) {
            
    //     }
    //     // table.getKe
    //     Object object = table.keySet().toArray();
    //     arraa
    //     assertTrue(tableElements.get(0).findElement(by))
    //     assertTrue(table.containsKey(tableElements.get(0).getText()));
    //     assertTrue(table.containsKey(tableElements.get(1).getText()));
    //     assertTrue(table.containsValue(tableElements.get(0).getText()));
    //     assertTrue(table.containsValue(tableElements.get(1).getText()));
    //     // for(WebElement element : tableElements){
    //     //     assertTrue(element.getText() == table);
    //     // }
    // }
}
