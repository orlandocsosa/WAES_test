package waes.pages.detailspage;

import waes.pages.profilepage.ProfilePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage extends ProfilePage{

    DetailsPage() {
        super();
    }

    @FindBy(css = "#___gatsby > div > div > main > div:nth-child(2) > section > ul > li:nth-child(1)")
    private WebElement name;

    @FindBy(css = "#___gatsby > div > div > main > div:nth-child(2) > section > ul > li:nth-child(2)")
    private WebElement email;

    

    WebElement name() {
        wait.forElementToBeDisplayed(5,name,"name");
        return name;
    }

    WebElement email() {
        return email;
    }
}