package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
				glue ="steps",
				monochrome=true,
				dryRun=false,
				snippets=SnippetType.CAMELCASE)

public class CreateLeadRunner extends AbstractTestNGCucumberTests{

}
