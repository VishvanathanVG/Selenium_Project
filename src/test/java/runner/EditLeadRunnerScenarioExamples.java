package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/featuresExamples/EditLeadScenarioOutline.feature",
				glue="stepsforExamples",
				monochrome=true,
				dryRun=false,
				snippets=SnippetType.CAMELCASE,
				plugin= {"pretty", "html:test-output","json:test-output/cucumber.json"})
public class EditLeadRunnerScenarioExamples extends AbstractTestNGCucumberTests {

}
