package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesginationSortedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//table[@id='table_id']//tr//th[3]").click();
		
		List<String> listofDesgination = new ArrayList<String>();
		
		List<WebElement> list= driver.findElementsByXPath("//table[@id='table_id']//tr//td[3]");
		for (WebElement eachDesgination : list) {
			//System.out.println(eachDesgination.getText());
			listofDesgination.add(eachDesgination.getText());
		}
		
		Collections.sort(listofDesgination);
		
		for (String eachList : listofDesgination) {
			System.out.println(eachList);
		}
		
		
	}

}
