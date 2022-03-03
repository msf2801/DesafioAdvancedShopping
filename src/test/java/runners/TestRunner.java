package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features="src/test/resources/features", 
		glue={"steps"},
		monochrome=true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@CT_001",
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		
)
public class TestRunner {

}
