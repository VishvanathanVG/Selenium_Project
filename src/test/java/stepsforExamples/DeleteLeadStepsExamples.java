package stepsforExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLeadStepsExamples {

	public ChromeDriver driver;
	public static WebElement lead;
	public static String leadid;

	@Given("Open the chrome browser for delete lead")
	public void openTheChromeBrowserForDeleteLead() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser for delete lead")
	public void maximiseTheBrowserForDeleteLead() {
		
		driver.manage().window().maximize();
	}

	@Given("Enter the URL for delete lead")
	public void enterTheURLForDeleteLead() {
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}

	@Given("Delete Lead Enter the username as (.*)")
	public void deleteLeadEnterTheUsernameAsUsername(String userName) {
		driver.findElementById("username").sendKeys(userName);
		
	}

	@Given("Delete Lead Enter the password as (.*)")
	public void deletedLeadEnterThePasswordAsPassword(String passWord) {
		
		driver.findElementByName("PASSWORD").sendKeys(passWord);
	}

	@When("Click on login button for delete lead")
	public void clickOnLoginButtonForDeleteLead() {
		
		driver.findElementByClassName("decorativeSubmit").click();
		
	}

	@When("Click on Crmsfa for delete lead")
	public void clickOnCrmsfaForDeleteLead() {
		String crmClick = "  CRM/SFA   ";
		String cmc = crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		
	}

	@Given("Click on lead links for delete lead")
	public void clickOnLeadLinksForDeleteLead() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("Click on find lead link for delete lead")
	public void clickOnFindLeadLinkForDeleteLead() {
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	}

	@When("Click on phone number")
	public void clickOnPhoneNumber() {
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();

	}

	@When("Enter the phone number as (.*) in find lead page")
	public void enterThePhoneNumberAsInFindLeadPage(String Phonenumber) {
		driver.findElementByName("phoneNumber").sendKeys(Phonenumber);
	}

	@When("Click on find leads button")
	public void clickOnFindLeadsButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
	}

	@When("Capture the first resulting lead id")
	public void captureTheFirstResultingLeadId() throws InterruptedException {

		lead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		leadid = lead.getText();
		System.out.println("Lead Id is :" + leadid);

	}

	@Then("Click on First resulting lead id")
	public void clickOnFirstResultingLeadId() {

		lead.click();
	}

	@When("Click on delete button")
	public void clickOnDeleteButton() {
		driver.findElementByXPath("//a[text() ='Delete']").click();
	}

	@When("Click on find leads links for delete")
	public void clickOnFindLeadsLinksForDelete() {
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

	}

	@When("Enter the captured lead id in find lead page")
	public void enterTheCapturedLeadIdInFindLeadPage() {

		driver.findElementByXPath("//label[contains(text(), 'Lead ID:')]/following::input[1]").sendKeys(leadid);

	}

	@When("Click on find lead buttons to find deleted lead id")
	public void clickOnFindLeadButtonsToFindDeletedLeadId() throws InterruptedException {

		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
	}

	@Then("Verify the norecords display message as (.*)")
	public void verifyTheNorecordsDisplayMessage(String NoRecords) {

		String norecords = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if (norecords.startsWith(NoRecords)) {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
		} else {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
		}
	}
	
	
	
	@Then("Close the browser for delete lead")
	public void closetheBrowserForDeleteLead() {
		
		driver.close();
	}

}
