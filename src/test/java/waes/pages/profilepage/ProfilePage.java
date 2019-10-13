package waes.pages.profilepage;

import waes.pages.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage{

    protected ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "home_link")
    private WebElement homeButton;

    @FindBy(id = "profile_link")
    private WebElement profileLink;

    @FindBy(id = "details_link")
    private WebElement detailsLink;

    @FindBy(linkText = "log out")
    private WebElement logout;

    @FindBy(id = "status")
    private WebElement status;

    @FindBy(tagName = "table")
    private WebElement table;

    WebElement homeButton() {
        return homeButton;
    }

    WebElement detailsLink() {
        return detailsLink;
    }

    WebElement profileLink() {
        return profileLink;
    }

    WebElement logout_link() {
        wait.forElementToBeDisplayed(10, this.logout, "logout_link");
        return logout;
    }

    WebElement userLogged() {
        return status;
    }

    WebElement usersTable() {
        return table;
    }
}