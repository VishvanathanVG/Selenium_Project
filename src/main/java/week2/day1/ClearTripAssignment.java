package week2.day1;

import java.security.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1	// Accept Notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		// 2.Load Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		// 3.click on Round trip
		driver.findElementById("RoundTrip").click();

		// 4.enter from station
		driver.findElementByName("origin").sendKeys("Chennai", Keys.TAB);

		// 5.enter to station
		driver.findElementByName("destination").sendKeys("New York", Keys.TAB);

		// 6 & 7.Depart on
	//	driver.findElementById("DepartDate").sendKeys("29/09/2019", Keys.TAB);
		driver.findElementByXPath("//i[@class='icon ir datePicker']").click();
		driver.findElementByLinkText("29").click();
		

		// 8 & 9.Return on
		
	//	driver.findElementById("ReturnDate").sendKeys("10/10/2019", Keys.TAB);
		driver.findElementByXPath("//i[@class='icon ir datePicker']").click();
		driver.findElementByLinkText("10").click();
		// 10.Select Adults
		WebElement adults = driver.findElementByName("adults");
		Select op = new Select(adults);
		op.selectByValue("2");

		// 11.Select childs
		WebElement childs = driver.findElementByName("childs");
		Select ch = new Select(childs);
		ch.selectByValue("1");

		// 12.select infants
		WebElement infants = driver.findElementById("Infants");
		Select inf = new Select(infants);
		inf.selectByValue("1");

		// 13.click more options
		driver.findElementByXPath("//a[@id='MoreOptionsLink']").click();

		// 14.class of travel
		WebElement class_travel = driver.findElementById("Class");
		Select cla = new Select(class_travel);
		cla.selectByValue("Premium Economy");

		// 15.Preferred airline
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates", Keys.TAB);

		// 16.Search flights
		driver.findElementById("SearchBtn").click();

	}

}
