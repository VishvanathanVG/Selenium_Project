package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedReleativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String crmClick="  CRM/SFA   ";
		String cmc=crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		
		//Find Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//attribute text
		driver.findElementByXPath("//a[text() ='Find Leads']").click();
		
		//partial attribute
		driver.findElementByXPath("//a[contains(@class,'selected')]").click();
		
		//partial text
		
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		
		//Partical attribut
		
		
		//Text
		
		

	}

}
