package waes.pages.profilepage;

import waes.pages.BasePage;


import java.util.List;
import org.openqa.selenium.By;
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

    @FindBy(className = "view-module--view--3wzVy")
    private WebElement section;

    @FindBy(id = "status")
    private WebElement status;

    @FindBy(id = "users_list_table")
    private WebElement table;

    WebElement homeButton() {
        return homeButton;
    }

    WebElement detailsLink() {
        return detailsLink;
    }

    public WebElement profileLink() {
        return profileLink;
    }

    WebElement logout_link() {
        wait.forElementToBeDisplayed(10, this.logout, "logout_link");
        return logout;
    }

    WebElement userLogged() {
        return status;
    }

    WebElement welcomeMessage() {
        wait.forLoading(5);
        List<WebElement> elements = section.findElements(By.tagName("p"));
        return elements.get(0);
    }

    WebElement superPowerMessage() {
        List<WebElement> elements = section.findElements(By.tagName("p"));
        return elements.get(1);
    }

    WebElement usersTable() {
        return table;
    }
}