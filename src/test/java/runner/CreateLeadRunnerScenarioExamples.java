package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/featuresExamples/CreateLeadScenarioOutline.feature",
				glue ="stepsforExamples",
				monochrome=true,
				dryRun=false,
				snippets=SnippetType.CAMELCASE,
				//tags= {"@SmokeTest"},
				plugin= {"pretty", "html:test-output","json:test-output/cucumber.json"})

/*{"@SmokeTest or @RegressionTest"} --> either one will run
 *{"@SmokeTest and @RegressionTest"} --> it will check the annotations(@SmokeTest  @RegressionTest) in which scenarios is available 
 *{~@SmokeTest} --> Particular test cases will be skipped
 * 
 * */


public class CreateLeadRunnerScenarioExamples extends AbstractTestNGCucumberTests{

}
