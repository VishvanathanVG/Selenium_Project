package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class DuplicateLeadAssignment extends ProjectSpecificMethods{

	@Test
	public void runDuplicateLead() throws InterruptedException {
	
	//login();
	// 6.click lead link
	driver.findElementByLinkText("Leads").click();
	// 7.click find leads
	driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	//8.click on email
	driver.findElementByXPath("//span[contains(text(),'Email')]").click();
	//9.enter email address
	driver.findElementByName("emailAddress").sendKeys("@gmail.com");
	//10.click on find lead button
	driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	Thread.sleep(3000);
	//11.capture name of first leading result
	WebElement name =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
	String getName=name.getText();
	System.out.println("Your name is:" + getName);
	//12.click first resulting lead
	name.click();
	//13.click on duplicate lead
	driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
	//14.verify title as duplicate lead
	String dupTitle=driver.getTitle();
	if(dupTitle.startsWith("Duplicate")) {
		System.out.println("Your title is: " + dupTitle + " And your title is correct");
		}
	else {
		System.out.println("Your title is: " + dupTitle + " And your title is incorrect");
	}
	//15.click on create lead
	//driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
	//16.confirm duplicate name as captured name
	String firstName=driver.findElementById("createLeadForm_firstName").getAttribute("value");
	System.out.println("captured name is " + firstName);
	if(getName.equals(firstName)) {
		System.out.println("Your name is " + firstName + " captured name is correct and duplicated");
	}
	else {
		System.out.println("Your name is " + firstName + " captured name is not duplicated ");
	}
	
	//closeBrowser();
	
}
}
