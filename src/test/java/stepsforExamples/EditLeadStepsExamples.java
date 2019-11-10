package stepsforExamples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLeadStepsExamples{
	
	public ChromeDriver driver;

	@Given("Open the chrome browser for edit lead")
	public void openTheChromeBrowserForEditLead() {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("Maximise the browser for edit lead")
	public void maximiseTheBrowserForEditLead() {
		driver.manage().window().maximize();

	}

	@Given("Enter the URL for edit lead")
	public void enterTheURLForEditLead() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@Given("Edit Lead Enter the username as (.*)")
	public void editLeadEnterTheUsernameAsUsername(String userName) {
		driver.findElementById("username").sendKeys(userName);

	}

	@Given("Edit Lead Enter the password as (.*)")
	public void editLeadEnterThePasswordAsPassword(String password) {

		driver.findElementByName("PASSWORD").sendKeys(password);
	}

	@When("Click on login button for edit lead")
	public void clickOnLoginButtonForEditLead() {

		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click on Crmsfa for edit lead")
	public void clickOnCrmsfaForEditLead() {

		String crmClick = "  CRM/SFA   ";
		String cmc = crmClick.trim();
		driver.findElementByLinkText(cmc).click();
	}

	@When("Click on lead links")
	public void clickOnLeadLinks() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("Click on find lead link")
	public void clickOnFindLeadLink() {
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	}

	@When("Enter the firstname in the find lead page as (.*)")
	public void enterFirstNameInFindLeadPage(String FirstName) {
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys(FirstName);
	}

	@When("Click on find lead button in find lead page")
	public void clickOnFindLeadButtonInFindLeadPage() {

		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

	}

	@Then("Select the first resulting lead id")
	public void selectTheFirstResultingLeadId() throws InterruptedException {
		Thread.sleep(2000);
		WebElement firtLead = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]");
		firtLead.click();

	}

	@Then("Verify the title page of view lead page")
	public void verifyTheTitlePageOfViewLeadPage() {

		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Your title is " + title + " and title is correct");
		} else {
			System.out.println("Your title is " + title + " and title is incorrect");
		}

	}

	@When("Click on edit button in view lead page")
	public void clickOnEditButtonInViewLeadPage() {
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();

	}

	@When("Change the company name as (.*) in edit lead page")
	public void changeTheCompanyNameAsTATAConsultancyServicesLimitedInEditLeadPage(String CompanyName) {
		WebElement companyName = driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys(CompanyName);

	}

	@When("Click on submit button")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Confirms the changed name as (.*)")
	public void confirmsTheChangedNameAsCorrectly(String expectCompanyName) {

		String companyNameUp = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("from view page:" + companyNameUp);
		System.out.println("expected:" + expectCompanyName);
		// Assert.assertEquals(companyNameUp, expectCompanyName);
		if (companyNameUp.contains(expectCompanyName)) {
			System.out.println("Your company name is " + companyNameUp + " and it is correct");
		} else {
			System.out.println("Your company name is " + companyNameUp + " and it is incorrect");
		}

	}

	@But("Confirmed the changed name as incorrectly (.*)")
	public void confirmsTheChangedNameAsInCorrectly(String expectCompanyName) {

		String companyNameUp = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("from view page:" + companyNameUp);
		System.out.println("expected:" + expectCompanyName);
		// Assert.assertEquals(companyNameUp, expectCompanyName);
		if (companyNameUp.contains(expectCompanyName)) {
			System.out.println("Your company name is " + companyNameUp + " and it is correct");
		} else {
			System.out.println("Your company name is " + companyNameUp + " and it is incorrect");
		}

	}

	@Then("Close the browser for edit lead")
	public void closeTheBrowserForEditLead() {
		driver.close();
	}

}
