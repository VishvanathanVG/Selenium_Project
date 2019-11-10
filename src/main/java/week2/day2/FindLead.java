package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
				
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("12");
				
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(3000);
				
				//Parent to Child using first value
				
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			

		

		
		
	}

}
