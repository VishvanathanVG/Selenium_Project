package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLearning {

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
		driver.findElementById("createLeadForm_lastName").sendKeys("Veerabathiran");
	
		//Industry - By using visible text
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd = new Select(industry);
		dd.selectByVisibleText("Retail");
		
		//Marketing Campaign - Select last one.
		
		WebElement marketing =driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(marketing);
		List<WebElement> market_options = dd1.getOptions();
		int size=market_options.size();
		dd1.selectByIndex(size-1);
		for (WebElement eachOpt : market_options) {
			System.out.println(eachOpt.getText());
		}
		
	
		//Select corporation using Ownership by using value
		WebElement ownership =driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd2 = new Select(ownership);
		dd2.selectByValue("OWN_CCORP");
		
		driver.close();
	}

}
