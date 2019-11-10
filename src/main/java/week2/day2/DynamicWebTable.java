package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.TAB);
		
		WebElement tostation =driver.findElementById("txtStationTo");
		tostation.clear();
		tostation.sendKeys("NMKL" , Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		//List<WebElement> row=driver.findElementsByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td/parent::tr");
		List<WebElement> row=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		System.out.println("Row size are :" + row.size());
		
		String trianname = driver.findElementByXPath("//a[contains(text(),'PALAKKAD EXP')]/preceding::a[1]").getText();
		System.out.println(trianname);
		
		
		String trainName=driver.findElementByXPath("//a[contains(text(),'PALAKKAD EXP')]/following::a[contains(text(),'NMKL')]//preceding::a[3]").getText();
		System.out.println(trainName);


	}

}
