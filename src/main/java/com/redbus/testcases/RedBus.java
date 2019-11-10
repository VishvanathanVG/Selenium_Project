package com.redbus.testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.LearnReadDataExcelOwn;


public class RedBus extends RedBusSpecificMethods{

		@DataProvider(name="redBusData")
		public String[][] fetchRedBusData() throws IOException {
			
			LearnReadDataExcelOwn readExcel= new LearnReadDataExcelOwn();
			String[][] readDataExcel = readExcel.readDataExcel("RedBus", "RedBusData");
			return readDataExcel;
			
		}
	
		@Test(dataProvider="redBusData")
		public void runRedBus(String fromplace, String toplace) throws InterruptedException {
		
		WebElement from =driver.findElementByXPath("//input[@type='text' and  @data-message='Please enter a source city']");
		from.sendKeys(fromplace);
		Thread.sleep(1000);
		from.sendKeys(Keys.TAB);
		
		WebElement to = driver.findElementByXPath("//input[@type='text' and  @data-message='Please enter a destination city']");
		to.sendKeys(toplace);
		Thread.sleep(1000);
		to.sendKeys(Keys.TAB);
	
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(d);
		int todaydate = Integer.parseInt(today);
		System.out.println("Today date is:" + todaydate);
		
		driver.findElementByXPath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//tr//td[text()='"+todaydate+"']").click();
		driver.findElementByXPath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//table[@class='rb-monthTable first last']//tr//td[text()='"+todaydate+"']").click();
		driver.findElementByXPath("//button[contains(text(),'Search Buses')]").click();
		
		driver.findElementByXPath("(//div[contains(text(),'DEPARTURE TIME')]//following-sibling::ul//following-sibling::label//following-sibling::label[@title='After 6 pm']//preceding-sibling::label[@class='custom-checkbox'])[1]").click();
		driver.findElementByXPath("//div[contains(text(),'BUS TYPES')]//following-sibling::ul//label//following-sibling::label[@title='AC']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(text(),'View Buses')]").click();
		Thread.sleep(1000);
		
		List<WebElement> row = driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
		int count = row.size();
		System.out.println("Total Number of Buses Available from "+fromplace+" to "+ toplace+":" + count);
		List<String> list = new LinkedList<String>();
		for (WebElement eachRow : row) {
			String busName =eachRow.getText();
			//System.out.println(busName);
			list.add(busName);
		}
		
		Collections.sort(list);
		System.out.println("Bus names are:" + list);
		
	}

}
