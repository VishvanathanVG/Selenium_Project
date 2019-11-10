package week2.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		
		// Clear and Enter the From Station
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);		
		// Clear and Enter the To Station
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);		
		// uncheck
		driver.findElementById("chkSelectDateOnly").click();
		// Number of rows		
		List<WebElement> rows = driver.findElementsByXPath
				("//table[@class='DataTable TrainList TrainListHeader']//tr");
		System.out.println(rows.size());
		// Get the train name
		String trainName = driver.findElementByXPath
				("//a[text()='PALAKKAD EXP']/preceding::a[1]").getText();
		System.out.println(trainName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}













