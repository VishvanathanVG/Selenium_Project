package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class DeleteLeadAssignment extends ProjectSpecificMethods {

	@Test
	public void runDeleteLead() throws InterruptedException {
		
		//login();
		// 6.click lead link
		driver.findElementByLinkText("Leads").click();
		// 7.click find leads
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		//8.click on phone
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		//9.enter phone number
		driver.findElementByName("phoneNumber").sendKeys("1");
		//10.click find leads button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		//11.capture lead id first
		WebElement lead=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String leadid =lead.getText();
		System.out.println("Lead Id is :" + leadid);
		//12.click on first resulting lead id
		lead.click();
		//13.click on delete
		driver.findElementByXPath("//a[text() ='Delete']").click();
		//14.click on find leads button
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		//15.enter capture lead id
		driver.findElementByXPath("//label[contains(text(), 'Lead ID:')]/following::input[1]").sendKeys(leadid);
		//16.fine leads
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		//17.verify no records display
		String norecords=driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if(norecords.startsWith("No")) {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
	    }
		else {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
		}
		
		//closeBrowser();
	}

}
