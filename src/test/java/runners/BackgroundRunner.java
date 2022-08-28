package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\background.feature",
		glue = "steps",
		tags = "@BGChangeFeature",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber",
				"html:target/cucumber.json"
		}
		)

public class BackgroundRunner {

}
