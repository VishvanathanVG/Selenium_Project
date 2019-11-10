package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@class='inputtext login_form_input_box'])[1]").sendKeys("vichu.eee69@gmail.com");
		driver.findElementByXPath("(//input[@class='inputtext login_form_input_box'])[2]").sendKeys("Vishva@12");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("//input[@name='q']").sendKeys("Testleaf solutions",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[text()='TestLeaf'])[1]").click();
		Boolean likeSelected =driver.findElementByXPath("//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']").isSelected();
		if(likeSelected != true) {
			driver.findElementByXPath("//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']").click();
		}
		driver.quit();
	}

}
