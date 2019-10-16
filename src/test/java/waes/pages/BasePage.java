package waes.pages;

import waes.utils.driver.Setup;
import waes.utils.driver.Wait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }

    public JavascriptExecutor jsExecutor() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        return executor;
    }
}