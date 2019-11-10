package stepsforExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseAPI {

	//BaseAPI ba;
	@Before
	public void preScenario(Scenario sc1) {

		System.out.println("Prescenario test cases name:" + sc1.getName());
		System.out.println("Prescenario test cases id:" + sc1.getId());
		System.out.println("Prescenario test cases status:" + sc1.getStatus());
		
		/*ba = new BaseAPI();
		ba.setUp()*/;


	}

	@After
	public void postScenario(Scenario sc1) {

		System.out.println("Postscenario test cases name:" + sc1.getName());
		System.out.println("Postcenario test cases id:" + sc1.getId());
		System.out.println("Postcenario test cases status:" + sc1.getStatus());
		
		//ba.tearDown();
	}

}
