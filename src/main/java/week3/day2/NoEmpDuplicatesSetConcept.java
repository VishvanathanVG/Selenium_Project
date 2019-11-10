package week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoEmpDuplicatesSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		
		List<WebElement> getRow= driver.findElementsByXPath("//table[@id='table_id']//tr//td[1]");
		System.out.println(getRow.size());
		int listRowCount = getRow.size();
		System.out.println("************************");
		
		Set<String> setempid= new HashSet<String>();
		List<WebElement> list= driver.findElementsByXPath("//table[@id='table_id']//tr//td[1]");
		for (WebElement eachEmp : list) {
			System.out.println(eachEmp.getText());
			setempid.add(eachEmp.getText());
		}
		System.out.println(setempid.size());
		int setRowCount = setempid.size();

			
		if (listRowCount==setRowCount) {
			System.out.println("Count is equal");
		} 
		else {

		}
		}
	}

