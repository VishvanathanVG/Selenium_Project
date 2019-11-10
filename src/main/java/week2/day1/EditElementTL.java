package week2.day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditElementTL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter email id
		driver.findElementById("email").sendKeys("vishvag@gmail.com");

		// 2.Append Text
		WebElement appends = driver.findElementByXPath("//input[@value ='Append ']");
		// appends =(WebElement) file.append("Hello ! Vishvanathan", Keys.TAB);
		appends.sendKeys("Vishva", Keys.TAB);

		// 3.Get Text
		String text = driver.findElementByName("username").getText();
		System.out.println(text);

		// 4.Clear the value
		driver.findElementByXPath("//input[@value ='Clear me!!']").clear();
		

		// 5.Confirm that field editable
		boolean editable = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")
				.isEnabled();
		System.out.println(editable);

	}

}
