package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/resources/features/Test.feature"},
		glue = {"stefdef"},
		tags = "",
		dryRun = false,
		plugin = { "pretty", "html:target/cucumber-reports/report.html",
				"rerun:target/rerun.text"}
		)
public class TestRunner1 extends AbstractTestNGCucumberTests
{
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		
//		return super.scenarios();
//	}
	
	
	
}
