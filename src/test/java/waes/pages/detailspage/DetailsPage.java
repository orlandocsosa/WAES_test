package waes.pages.detailspage;

import waes.pages.profilepage.ProfilePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage extends ProfilePage{

    DetailsPage() {
        super();
    }

    @FindBy(tagName = "li")
    private List<WebElement> data;

    WebElement name() {
        wait.forLoading(5);
        return data.get(0);
    }

    WebElement email() {
        return data.get(1);
    }
}