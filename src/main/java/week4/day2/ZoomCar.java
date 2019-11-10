package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//input[@placeholder='Tell us your Starting point in Chennai']");
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div[3]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		// date function
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today) + 1;
		int dayaftertomorrow = Integer.parseInt(today) + 2;
		System.out.println("tomorrow date is :" + tomorrow);
		System.out.println("Dayaftertomorrow date is :" + dayaftertomorrow);

		WebElement day1 = driver.findElementByXPath("//div[@class='component-date']//div//div//div[@class='text']"
				+ "//parent::div[contains(text(),'" + tomorrow + "')]");
		String startDayText = day1.getText();
		String startDate = startDayText.replaceAll("[^0-9]", "");
		day1.click();
		System.out.println("your start date is:" + startDate);
		driver.findElementByXPath("//button[text()='Next']").click();

		WebElement dateConfirm = driver.findElementByXPath(
				"	//div[@class='component-date']//div//div//div[@class='text']//parent::div[contains(text(),'"
						+ dayaftertomorrow + "')]");
		String day = dateConfirm.getText();
		String dropOffDate = day.replaceAll("[^0-9]", "");
		System.out.println("your drop confirm date is:" + dropOffDate);
		if (startDate != dropOffDate) {
			System.out.println("your both dates are different : start date is :" + startDate + " and drop off date is:"
					+ dropOffDate);
		} else {
			System.out.println(
					"your both dates are same : start date is :" + startDate + " drop off date is:" + dropOffDate);
		}

		driver.findElementByXPath("//button[text()='Done']").click();

		// Method 1. Using set and list combination

		List<WebElement> rowData = driver
				.findElementsByXPath("//div[@class='img']//following-sibling::div//div[@class='price']");
		int rowDataValue = rowData.size();
		System.out.println("Total no of cars available :" + rowDataValue);

		Set<String> setPrice = new LinkedHashSet<String>();
		for (WebElement eachPrice : rowData) {
			String ea = eachPrice.getText().replaceAll("[\\s+]", "");
			String ea1 = ea.replaceAll("[?₹]", "");
			setPrice.add(ea1);
			for (String eachSetPrices : setPrice) {
				// System.out.println("from set Price :"+ eachSetPrices );
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (String eachPrice : setPrice) {
			String afterReplacing = eachPrice.replaceAll("\\D", "");
			int intPrice = Integer.parseInt(afterReplacing);
			list.add(intPrice);
		}

		Collections.sort(list);

		for (Integer eachListPrice : list) {
			// System.out.println("from list sorting :" + eachListPrice);
		}

		int high = list.size() - 1;
		int highestPrice = list.get(high);
		// System.out.println("highest price :" + highestPrice );

		String finalPrice = "";
		for (String eachSetPrice : setPrice) {
			String str = eachSetPrice.replaceAll(",", "");
			int intPrice = Integer.parseInt(str);
			// System.out.println("int price :" + intPrice);
			if (list.get(high).equals(intPrice)) {
				// System.out.println("integer matching price:" + intPrice);
				finalPrice = eachSetPrice;
			}

		}
		WebElement carText = driver
				.findElementByXPath("//div[@class='img']//following-sibling::div//div" + "[contains(text(),'"
						+ finalPrice + "')]/parent::div//parent::div//parent::div//following-sibling::div//h3");
		String carName = carText.getText();
		driver.findElementByXPath("//div[@class='img']//following-sibling::div//div[contains(text()," + "'" + finalPrice
				+ "')]/following-sibling::div//following-sibling::button[text()='BOOK NOW']").click();

		System.out.println(
				"Car name is:" + carName + " and Highest Price Of Car is: " + finalPrice + " Enjoy your journey !!!");

		// Method 2. Using highest to low price button click
		/*
		 * WebElement highest=driver.
		 * findElementByXPath("//div[@class='sort-bar car-sort-layout']//div[text()=' Price: High to Low ']"
		 * ); highest.click(); System.out.println(highest.getText());
		 * //driver.findElementByXPath(
		 * "(//div[@class='img']//following-sibling::div//div[@class='price'])[1]/following-sibling::div/following-sibling::button"
		 * ).click(); driver.findElementByXPath(
		 * "//div[@class='img']/following-sibling::div//div[@class='price']//following-sibling::button"
		 * ).click(); WebElement highAmount =driver.findElementByXPath(
		 * "(//div[@class='img']//following-sibling::div//div[@class='price'])[1]");
		 * System.out.println("highest amount :" + highAmount.getText());
		 */

	}

}
