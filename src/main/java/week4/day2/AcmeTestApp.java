package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@class ='form-control'])[1]").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByXPath("(//input[@class ='form-control'])[2]").sendKeys("leaf@12");
		driver.findElementByXPath("//button[text()='Log In']").click();
		WebElement vendorElement =driver.findElementByXPath("//button[text()=' Vendors']");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendorElement).perform();
		Thread.sleep(3000);
		driver.findElementByLinkText("Search for Vendor").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@class='form-control'])[2]").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[text()='Search']").click();
		String countryName=driver.findElementByXPath("//table[@class='table']//td[5]").getText();
		System.out.println("Country is name is : " + countryName);
		driver.findElementByLinkText("Log Out").click();
		driver.quit();
		
	}

}
