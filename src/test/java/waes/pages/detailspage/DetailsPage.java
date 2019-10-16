package waes.pages.detailspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import waes.pages.profilepage.ProfilePage;

/**
 * Details Page page object - Selectors and methods returning page object elements to be used in steps definitions
 */
public class DetailsPage extends ProfilePage{

    DetailsPage() {
        super();
    }
    /**
     * Selectors for page elements
     */
    @FindBy(css = "#___gatsby > div > div > main > div:nth-child(2) > section > ul > li:nth-child(1)")
    private WebElement name;

    @FindBy(css = "#___gatsby > div > div > main > div:nth-child(2) > section > ul > li:nth-child(2)")
    private WebElement email;

    
    /**
     * Element Methods 
     */
    WebElement name() {
        wait.forElementToBeDisplayed(5,name,"name");
        return name;
    }

    WebElement email() {
        return email;
    }
}