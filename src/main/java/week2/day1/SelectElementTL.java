package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectElementTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		
		//1.Select id by using index
		WebElement dropdown =driver.findElementById("dropdown1");
		Select ss = new Select(dropdown);
		List<WebElement> ind = ss.getOptions();
		ss.selectByIndex(2);
		
		//2.select by using text
		WebElement dropdown2 =driver.findElementByName("dropdown2");
		Select ss1=new Select(dropdown2);
		ss1.selectByVisibleText("UFT/QTP");
		
		//3.Select by using value
		
		WebElement dropdown3 =driver.findElementById("dropdown3");
		Select ss2=new Select(dropdown3);
		ss2.selectByValue("4");
		
		//4.get the drop down options
		WebElement dropdown4=driver.findElementByClassName("dropdown");
		Select ss3=new Select(dropdown4);
		List getSize=ss3.getOptions();
		System.out.println("Number of dropdown options are :" + getSize.size());
		
		
		//5.Send Key to select
		WebElement dropdown5 =driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		dropdown5.sendKeys("Selenium");
		
		//6.Select your program
		//"//option[contains (text() ,'Select training program using Index')]
		//*[@id="contentblock"]/section/div[6]/select
		WebElement dropdown6 =driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select"); 
		Select ss5 = new Select(dropdown6);
		List option =ss5.getOptions();
		ss5.selectByValue("1");
		ss5.selectByVisibleText("UFT/QTP");
		
		
	}
	
	
	

}
