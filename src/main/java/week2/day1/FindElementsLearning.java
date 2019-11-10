package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
			
		//Multiple dropdown in page
		
		List<WebElement> alldropdown = driver.findElementsByTagName("Select");
		System.out.println(alldropdown.size());
		WebElement first_select = alldropdown.get(2);
		first_select.click();
		//alldropdown.size(0);
		
		

	}

}
