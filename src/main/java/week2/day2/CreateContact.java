package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElement(By.)
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String crmClick="  CRM/SFA   ";
		String cmc=crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByXPath("//a[contains,(text(),'Create Contact'))]").click();
		
		driver.findElementById("firstNameField").sendKeys("Vishvanathan");
		driver.findElementByName("lastName").sendKeys("Veerabathiran", Keys.DOWN);
		driver.findElementByName("submitButton").click();
		
		
		//find contact
		driver.findElementByXPath("//a[contains(text(),'Find Contacts']").click();
	}

}
