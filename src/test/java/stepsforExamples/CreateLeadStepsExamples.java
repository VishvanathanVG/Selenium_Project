package stepsforExamples;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadStepsExamples {

	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openTheChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("Maximise the browser")
	public void maximiseTheBrowser() {

		driver.manage().window().maximize();
	}

	@Given("Enter the URL")
	public void enterTheURL() {

		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String userName) {

		driver.findElementById("username").sendKeys(userName);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {

		driver.findElementByName("PASSWORD").sendKeys(password);

	}

	@When("Click on login button")
	public void clickOnLoginButton() {

		driver.findElementByClassName("decorativeSubmit").click();

	}

	@When("Click on Crmsfa")
	public void clickOnCrmsfa() {

		String crmClick = "  CRM/SFA   ";
		String cmc = crmClick.trim();
		driver.findElementByLinkText(cmc).click();

	}

	@Then("Verify HomePage")
	public void verifyHomePage() {
		
		String title =driver.getTitle();
		if(title.contains("My Home | opentaps CRM")) {
			System.out.println("Your home title is:" + title + " and it is correct");
		}
		else {
			System.out.println("Your home title is:" + title + " and it is incorrect");
		}
		

	}

	@When("Click on CreateLead button")
	public void clickOnCreateLeadButton() {

		driver.findElementByLinkText("Create Lead").click();

	}

	@When("Enter the companyname as (.*)")
	public void enterTheCompanynameAsTATAConsultancyServices(String companyname) {

		driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
	}

	@When("Enter the firstname as (.*)")
	public void enterTheFirstnameAsVishvanathan(String firstname) {

		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}

	@When("Enter the lastname as (.*)")
	public void enterTheLastnameAsVeerabathiran(String lastname) {

		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	}

	@Then("Click on CreateSubmitt button")
	public void clickOnCreateSubmittButton() {

		driver.findElementByName("submitButton").click();

	}

	@Then("Verify the leadname")
	public void verifyTheLeadname() {

		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstName.contains("Vishvanathan")) {
			System.out.println("My first name is :" + firstName + " and firstname is correct");
		} else {
			System.out.println("My first name is :" + firstName + " and firstname is incorrect");
		}

	}
	
	@But("Verify the leadname unsucessful")
	public void verifyLeadNameUnsuccess() {
		

		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstName.contains("Vishvanathan1")) {
			System.out.println("My first name is :" + firstName + " and firstname is correct");
		} else {
			System.out.println("My first name is :" + firstName + " and firstname is incorrect");
		}
		
	}
	
	@Then("close the browser")
	public void closeBrowser() {
		
		driver.close();
	}
}
