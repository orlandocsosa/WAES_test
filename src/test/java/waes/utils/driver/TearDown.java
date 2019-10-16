package waes.utils.driver;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

/**
 * Java class handling browser teardown
 */
public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(Scenario scenario){
        this.driver.quit();
    }
}
