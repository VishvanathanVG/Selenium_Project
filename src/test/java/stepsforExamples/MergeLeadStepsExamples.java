package stepsforExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MergeLeadStepsExamples {

	public ChromeDriver driver;
	public String baseWindow;
	public String mergerID;
	public String firstNameID;

	@Given("Open the chrome browser for merge lead")
	public void openTheChromeBrowserForMergeLead() {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("Maximise the browser for merge lead")
	public void maximiseTheBrowserForMergeLead() {
		driver.manage().window().maximize();

	}

	@Given("Enter the URL for merge lead")
	public void enterTheURLForMergeLead() {

		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Merge Lead Enter the username as (.*)")
	public void mergeLeadEnterTheUsernameAsDemoSalesManager(String userName) {
		driver.findElementById("username").sendKeys(userName);

	}

	@Given("Merge Lead Enter the password as (.*)")
	public void mergeLeadEnterThePasswordAsCrmsfa(String passWord) {

		driver.findElementByName("PASSWORD").sendKeys(passWord);
	}

	@When("Click on login button for merge lead")
	public void clickOnLoginButtonForMergeLead() {

		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click on Crmsfa for merge lead")
	public void clickOnCrmsfaForMergeLead() {

		String crmClick = "  CRM/SFA   ";
		String cmc = crmClick.trim();
		driver.findElementByLinkText(cmc).click();

	}

	@When("Click on lead links for merge lead")
	public void clickOnLeadLinksForMergeLead() {

		driver.findElementByLinkText("Leads").click();
	}

	@When("Click on merge lead links")
	public void clickOnMergeLeadLinks() {

		driver.findElementByLinkText("Merge Leads").click();
	}

	@When("Click on fromlead icon on merge lead page")
	public void clickOnFromleadIconOnMergeLeadPage() {

		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();

	}

	@When("Navigating to find leads for merge firstname")
	public void navigatingToFindLeadsForMergeFirstname() {

		Set<String> windows = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windows);
		/*
		 * System.out.println(allWindows.get(0)); System.out.println(allWindows.get(1));
		 */
		for (String eachwindowID : allWindows) {
			System.out.println(eachwindowID);
		}

		System.out.println(allWindows.size());
		baseWindow = allWindows.get(0);
		String firstWindow = allWindows.get(1);
		driver.switchTo().window(firstWindow);

	}

	@When("Entering the firstname as (.*) in find lead page")
	public void enteringTheFirstnameAsAInFindLeadPage(String firstname) {
		driver.findElementByName("firstName").sendKeys(firstname);

	}

	@When("Click on find lead button in find lead page to find firstname lead")
	public void clickOnFindLeadButtonInFindLeadPageToFindFirstnameLead() {

		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@When("Select the first resulting lead id for firstname")
	public void selectTheFirstResultingLeadIdForFirstname() throws InterruptedException {

		Thread.sleep(2000);
		
		WebElement firstID = driver.findElementByXPath(
				"(//table[@class='x-grid3-row-table'])[1]//tr//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		firstNameID = firstID.getText();
		firstID.click();
		System.out.println("your first lead id :" + firstNameID);
	}

	@When("Back to basewindow after selecting firstname")
	public void backToBasewindowAfterSelectingFirstname() {

		driver.switchTo().window(baseWindow);

	}

	@When("Click on tolead icon on merge lead page")
	public void clickOnToleadIconOnMergeLeadPage() {
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();

	}

	@When("Navigating to find leads for merge lastname")
	public void navigatingToFindLeadsForMergeLastname() {
		Set<String> windows1 = driver.getWindowHandles();
		List<String> allWindows1 = new ArrayList<String>(windows1);
		/*
		 * System.out.println(allWindows1.get(0));
		 * System.out.println(allWindows1.get(1));
		 */
		for (String eachwindowID1 : allWindows1) {
			System.out.println(eachwindowID1);
		}

		System.out.println(allWindows1.size());
		String firstWindow1 = allWindows1.get(1);
		driver.switchTo().window(firstWindow1);

	}

	@When("Entering the Lastname as (.*) in find lead page")
	public void enteringTheLastnameAsCInFindLeadPage(String lastname) {
		driver.findElementByName("lastName").sendKeys(lastname);

	}

	@When("Click on find lead button in find lead page to find lastname lead")
	public void clickOnFindLeadButtonInFindLeadPageToFindLastnameLead() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

	}

	@When("Select the first resulting lead id for lastname")
	public void selectTheFirstResultingLeadIdForLastname() throws InterruptedException {

		Thread.sleep(2000);
		WebElement id = driver.findElementByXPath(
				"(//table[@class='x-grid3-row-table']//tr//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[1]");
		mergerID = id.getText();
		id.click();
		Thread.sleep(2000);
		System.out.println("your merge id is :" + mergerID);
	}

	@When("Back to basewindow after selecting lastname")
	public void backToBasewindowAfterSelectingLastname() {

		driver.switchTo().window(baseWindow);
	}

	@When("Click on merge lead button in merge lead page")
	public void clickOnMergeLeadButtonInMergeLeadPage() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Merge']").click();

	}

	@When("Accepting the alert")
	public void acceptingTheAlert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("verify mergerid in viewleadpage")
	public void verifyMergeridInViewleadpage() {

		WebElement ID = driver.findElementById("viewLead_companyName_sp");
		String mergeViewID = ID.getText();
		if (mergeViewID.contains(mergerID)) {
			System.out.println("your id is correct and ID is: " + mergeViewID);
		} else {
			System.out.println("your id is Incorrect and ID is: " + mergeViewID);
		}
	}

	@When("Click on the find lead links to validate id")
	public void clickOnTheFindLeadLinksToValidateId() {
		driver.findElementByLinkText("Find Leads").click();

	}

	@When("Enter the firstname id from captured fromlead id")
	public void enterTheFirstnameIdFromCapturedFromleadId() {
		driver.findElementByName("id").sendKeys(firstNameID);

	}

	@When("Click on find lead button to check the fromlead id")
	public void clickOnFindLeadButtonToCheckTheFromleadId() {

		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	}

	@Then("Verify the norecords display for fromlead id")
	public void verifyTheNorecordsDisplayForFromleadId() throws InterruptedException {

		Thread.sleep(2000);
		
		String message = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if (message.contains("No records to display")) {
			System.out
					.println("First Lead id result is :" + message + " and This message confirm the successful merge");
		} else {
			System.out.println(
					"First Lead id result is :" + message + " and This message confirm the unsuccessful merge");
		}

	}

	@Then("Close the browser for merge lead page.")
	public void closeTheBrowserForMergeLeadPage() {

		driver.close();
	}

}
