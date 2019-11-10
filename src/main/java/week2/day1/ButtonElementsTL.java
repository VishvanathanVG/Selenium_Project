package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonElementsTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//1.travel to home page
		driver.findElementById("home").click();
		
		//Coming back to button screen
		
		//driver.findElementByXPath("//img[@src ='images/button.png']").click();
		driver.findElementByXPath("//img[contains(@src, 'images/button.png')]");
		
		//2.find the position of button
	
		Point position =driver.findElementById("position").getLocation();
		System.out.println("Position is:" + position);
		
		//3.find the color of the button
		String colorName=driver.findElementById("color").getCssValue("background-color");
		System.out.println("color code is :"+ colorName);
		
		//4.find the heigh and width
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Size is:" + size);
		
	}

}
