package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksElementTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//1.Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Home page is : " + driver.getCurrentUrl());
		
		driver.findElementByXPath("//img[@src ='images/link.png']").click();
		
		//2.where i am supposed to go with me
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		System.out.println("You are supposed to be  " + driver.getCurrentUrl());
		
		driver.findElementByXPath("//img[@src= '../images/testleaf_logo.png']").click();
		driver.findElementByXPath("//img[@src ='images/link.png']").click();
		
		//3.verify i am broken
		driver.findElementByLinkText("Verify am I broken?").click();
		String url =driver.getCurrentUrl();
		if(url.contains("error.html")) {
			System.out.println("You are Broken");
		}
		else {
			System.out.println("You are not broken");
		}
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		
		//4.Go to same page
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Home page is : " + driver.getCurrentUrl());
		driver.navigate().back();
		//System.out.println(driver.getCurrentUrl());
		
		
		//5.how many link are available
		List<WebElement> list = driver.findElementsByTagName("a");
		System.out.println("Total links are:" + list.size());
		
	

	}

}
