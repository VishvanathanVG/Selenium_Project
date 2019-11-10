package stepsforExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuplicateLeadStepsExamples {

	public static ChromeDriver driver;
	public static String firstname;

	@Given("Open the chrome browser for duplicate lead")
	public void openTheChromeBrowserForDuplicateLead() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser for duplicate lead")
	public void maximiseTheBrowserForDuplicateLead() {
		
		driver.manage().window().maximize();
	}

	@Given("Enter the URL for duplicate lead")
	public void enterTheURLForDuplicateLead() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}

	@Given("Duplicate Lead Enter the username as (.*)")
	public void duplicateLeadEnterTheUsernameAsUsername(String userName) {
		
		driver.findElementById("username").sendKeys(userName);
	}

	@Given("Duplicate Lead Enter the password as (.*)")
	public void duplicateLeadEnterThePasswordAsPassword(String password) {
		
		driver.findElementByName("PASSWORD").sendKeys(password);
	}

	@When("Click on login button for duplicate lead")
	public void clickOnLoginButtonForDuplicateLead() {
		
		driver.findElementByClassName("decorativeSubmit").click();
		
	}

	@When("Click on Crmsfa for duplicate lead")
	public void clickOnCrmsfaForDuplicateLead() {
		String crmClick = "  CRM/SFA   ";
		String cmc = crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		
	}

	@Given("Click on the Leads links")
	public void clickOnTheLeadsLinks() {

		driver.findElementByLinkText("Leads").click();

	}

	@When("Click on the find leads links")
	public void clickOnTheFindLeadsLinks() {

		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

	}

	@When("Click on Email button in find lead page")
	public void clickOnEmailButtonInFindLeadPage() {
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();

	}

	@When("Enter the email id as (.*) in find lead page")
	public void enterTheEmailIdAsGmailComInFindLeadPage(String emailaddr) {

		driver.findElementByName("emailAddress").sendKeys(emailaddr);

	}

	@When("Click on the find leads button to get leads data")
	public void clickOnTheFindLeadsButtonToGetLeadsData() {
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	}

	@When("Capture the name of first resulting lead")
	public void captureTheNameOfFirstResultingLead() throws InterruptedException {
		Thread.sleep(2000);
		WebElement name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		firstname = name.getText();
		System.out.println("Your name is:" + firstname);
		name.click();

	}

	@When("Click on Duplicate lead button in view lead page")
	public void clickOnDuplicateLeadButtonInViewLeadPage() {

		driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();

	}

	@Then("Verify the view lead page titles as (.*)")
	public void verifyTheViewLeadPageTitles(String duplicatetitlename) {

		String dupTitle = driver.getTitle();
		if (dupTitle.startsWith(duplicatetitlename)) {
			System.out.println("Your title is: " + dupTitle + " And your title is correct");
		} else {
			System.out.println("Your title is: " + dupTitle + " And your title is incorrect");
		}

	}

	@When("Click on the create lead button")
	public void clickOnTheCreateLeadButton() {
		driver.findElementByName("submitButton").click();

	}

	@Then("Confirm the duplicated lead name as captured name")
	public void confirmTheDuplicatedLeadNameAsCapturedName() {

		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("viewlead name is " + firstName);
		if (firstname.equals(firstName)) {
			System.out.println("Your name is " + firstName + " captured name is correct and duplicated");
		} else {
			System.out.println("Your name is " + firstName + " captured name is not duplicated ");
		}

	}

	@Then("Close the browser for duplicate lead")
	public void closeTheBrowserForDuplicateLead() {
	   driver.close();
	}
}
