package org.testleaf.leaftaps.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(username);
		driver.findElementByName("PASSWORD").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		String crmClick="  CRM/SFA   ";
		String cmc=crmClick.trim();
		driver.findElementByLinkText(cmc).click();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		
	}
}
