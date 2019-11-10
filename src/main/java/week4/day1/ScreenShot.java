package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Driver method screen shot for whole page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/Imga001.jpg");
		FileUtils.copyFile(source, destination);
		
		WebElement username =driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		
		//element method screen shot for particular element
		File source1 = username.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./snaps/Imga003.jpg");
		FileUtils.copyFile(source1, destination1);
		driver.quit();
	}

}
