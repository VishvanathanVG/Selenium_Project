package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsMergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String crmClick="  CRM/SFA   ";
		String cmc=crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		driver.findElementByLinkText("Leads").click();
		//merge lead click
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> windows=driver.getWindowHandles();
		List<String> allWindows=new ArrayList<String>(windows);
		/*System.out.println(allWindows.get(0));
		System.out.println(allWindows.get(1));
		*/
		for (String eachwindowID : allWindows) {
			System.out.println(eachwindowID);
		}
		
		System.out.println(allWindows.size());
		String baseWindow=allWindows.get(0);
		String firstWindow=allWindows.get(1);
		driver.switchTo().window(firstWindow);

		driver.findElementByName("firstName").sendKeys("a");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		WebElement firstID =driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//tr//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String firstNameID=firstID.getText();
		firstID.click();
		System.out.println("your first lead id :"+firstNameID);
		driver.switchTo().window(baseWindow);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> windows1=driver.getWindowHandles();
		List<String> allWindows1=new ArrayList<String>(windows1);
		/*System.out.println(allWindows1.get(0));
		System.out.println(allWindows1.get(1));
		*/
		for (String eachwindowID1 : allWindows1) {
			System.out.println(eachwindowID1);
		}
		
		System.out.println(allWindows1.size());
		String firstWindow1=allWindows1.get(1);
		driver.switchTo().window(firstWindow1);
		driver.findElementByName("lastName").sendKeys("s");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		WebElement id =driver.findElementByXPath("(//table[@class='x-grid3-row-table']//tr//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[1]");
		String mergerID =id.getText();
		id.click();
		Thread.sleep(2000);
		System.out.println("your merge id is :" + mergerID);
		driver.switchTo().window(baseWindow);
		Thread.sleep(2000);
		//driver.findElementByLinkText("Merge").click();
		driver.findElementByXPath("//a[text()='Merge']").click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		WebElement ID=driver.findElementById("viewLead_companyName_sp");
		String mergeViewID =ID.getText();
		if(mergeViewID.contains(mergerID)) {
			System.out.println("your id is correct and ID is: " + mergeViewID );
		}
		else {
			System.out.println("your id is Incorrect and ID is: " + mergeViewID);
		}
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(firstNameID);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		String message =driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if(message.contains("No records to display")) {
			System.out.println("First Lead id result is :"+ message + " and This message confirm the successful merge");
		}
			else{
			System.out.println("First Lead id result is :"+ message + " and This message confirm the unsuccessful merge");
		}
		
		driver.close();
	}

}
