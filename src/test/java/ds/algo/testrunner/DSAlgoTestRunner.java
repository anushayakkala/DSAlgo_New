package ds.algo.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = { "ds.algo.stepdef"}, monochrome = true, plugin = {
	"pretty", "html:target/report/dsAlgoCucumber-report.html" })

public class DSAlgoTestRunner extends AbstractTestNGCucumberTests {

}
