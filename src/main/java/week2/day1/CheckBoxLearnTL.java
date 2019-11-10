package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxLearnTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the language
		
		//*[@id="contentblock"]/section/div[1]/input[1]
		driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]").click();
		
		//whether selected
		Boolean s =driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected();
		System.out.println("you are selected:" + s);
		
		
		//deselect only checked
		boolean s1=driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/input[2]").isSelected();
		if( s1==true) {
			driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/input[2]").click();
		}

		
		//Select all the option
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[1]").click();
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[2]").click();
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[3]").click();
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[4]").click();
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[5]").click();
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/input[6]").click();
	}

}
