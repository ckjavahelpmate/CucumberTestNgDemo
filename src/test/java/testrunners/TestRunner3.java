package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/resources/features/Test3.feature"},
		glue = {"stefdef"},
		tags = "",
		dryRun = false,
		plugin = { "pretty", "html:target/cucumber-reports/report.html" }
		)
public class TestRunner3 extends AbstractTestNGCucumberTests
{
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		
//		return super.scenarios();
//	}
	
}
