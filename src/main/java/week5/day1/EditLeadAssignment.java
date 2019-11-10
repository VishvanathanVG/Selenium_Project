package week5.day1;

import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class EditLeadAssignment extends ProjectSpecificMethods{

	@Test
	public void runEditLead() throws InterruptedException {

		//login();
		// 6.click lead link
		driver.findElementByLinkText("Leads").click();
		// 7.click find leads
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		// 8.enter first name
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys("Vishvanathan");
		// 9.click on find lead button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(3000);
		
		// 10.click on first resulting lead
		WebElement firtLead= driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]");
		firtLead.click();
		// 11.verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Your title is " + title + " and title is correct");
		} else {
			System.out.println("Your title is " + title + " and title is incorrect");
		}

		// 12.click edit
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();

		// 13.change company name to another name
		WebElement companyName = driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys("TATA Consultancy Services Limited");

		// 14.click update button
		driver.findElementByName("submitButton").click();

		// 15.confirm the changes name appeared correctly
		String companyNameUp = driver.findElementById("viewLead_companyName_sp").getText();
		if (companyNameUp.contains("TATA Consultancy Services Limited")) {
			System.out.println("Your company name is " + companyNameUp + " and it is correct");
		} else {
			System.out.println("Your company name is " + companyNameUp + " and it is incorrect");
		}
		// 16.close the browser
		//closeBrowser();
	}

}
