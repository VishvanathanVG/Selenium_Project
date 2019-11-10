package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertAndFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://tinyurl.com/SeleniumAlert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() ='Try it']").click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Vishvanathan");
		alert1.accept();
		String name=driver.findElementById("demo").getText();
		if(name.contains("Vishvanathan")) {
			System.out.println("Your name is: " + name);
		}
		else {
			System.out.println("Your name is: " + name + " name is not correct");
		}
	}

}
