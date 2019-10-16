package waes.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import waes.utils.driver.Setup;
import waes.utils.driver.Wait;

/**
 * Base Page page object - Abstract page for handling driver and wait and javascript executor
 */
public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }

    /**
     * Method for handling elements with javascript capabilities
     */
    public JavascriptExecutor jsExecutor() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        return executor;
    }
}