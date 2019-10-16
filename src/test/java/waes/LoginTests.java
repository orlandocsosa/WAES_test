package waes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Login Tests Java runner
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/waes/login_tests.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"waes.utils.driver",
                "waes.pages.homepage",
                "waes.pages.loginpage",
                "waes.pages.profilepage"})
public class LoginTests {
}
