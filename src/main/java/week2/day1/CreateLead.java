package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		//Create Lead
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vishvanathan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Veerabathiran", Keys.DOWN);
		driver.findElementByName("submitButton").click();
		String leadname=driver.findElementById("viewLead_firstName_sp").getText();
		//System.out.println(leadname);
		if(leadname.equals("Vishvanathan")) {
			System.out.println("Lead created successfully name as:" + leadname);
		}
		else {
			System.out.println("Lead Name is created wrongly");
		}
		
		//driver.quit();

	}

}
