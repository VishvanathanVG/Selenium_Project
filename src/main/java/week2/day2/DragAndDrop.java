package week2.day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		//WebElement item1 =driver.findElementByXPath("//span[text() ='Item 1']//li));"
		//span[contains(text(),'Item 1')]//li[@class='ui-state-default ui-sortable-handle'];
		WebElement drag1 =driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement drag4 =driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		int drop = drag4.getLocation().getY();
		System.out.println(drop);
		Actions builder = new Actions(driver);
		
	
		//builder.clickAndHold(drag1).clickAndHold(drag4).release().perform();	
		builder.dragAndDropBy(drag1, 0, drop).perform();
		
		
	}

}
