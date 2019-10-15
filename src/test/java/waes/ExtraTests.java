package waes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/waes/extra_tests.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"waes.utils.driver",
                "waes.pages.homepage",
                "waes.pages.loginpage",
                "waes.pages.detailspage",
                "waes.pages.profilepage"})
public class ExtraTests {
}
