package com.amazon.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.LearnReadDataExcelOwn;

public class Amazon extends AmazonProjectSpecific {

	//author vishva
	@DataProvider(name="amazonData")
	public String[][] readExceldata() throws IOException {
		
		LearnReadDataExcelOwn readExcel = new LearnReadDataExcelOwn();
		String[][] readDataExcel = readExcel.readDataExcel("Amazon", "AmazonData");
		return readDataExcel;
	}
	
	
	@Test(dataProvider="amazonData")
	public void runAmazon(String searchitems) throws InterruptedException {
		
		WebElement search =driver.findElementById("twotabsearchtextbox");
		search.sendKeys(searchitems);
		search.sendKeys(Keys.ENTER);
		
		//1.Highest Price of book
		List<WebElement> count = driver.findElementsByXPath("//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price-whole']");
		int bookCount = count.size();
		System.out.println("Total number of Books available:" + bookCount);
		List<Integer>list = new LinkedList<Integer>();
		for (WebElement eachBook : count) {
			String bookName = eachBook.getText();
			String prc =bookName.replaceAll("[^0-9]","");
			String prc1 =prc.replaceAll(",", "");
			if(!prc1.equals("")) {
			int bookPrice =Integer.parseInt(prc);
			list.add(bookPrice);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
		int size =list.size()-1;
		Integer highestPrice = list.get(size);
		System.out.println("Highest price of book is:" + highestPrice);
		
		
		//2.Find the lowest discount book in this page
		List<Integer> list1 = new ArrayList<Integer>();
		for (WebElement eachPrice : count) {
			String afterDiscountedPrice =eachPrice.getText();
			if(!afterDiscountedPrice.equals("")) {
				String prc1 =afterDiscountedPrice.replaceAll(",", "");
				int afterDiscountPrice =Integer.parseInt(prc1);
				System.out.println("AfterDiscountPrice:" +afterDiscountPrice );
				List<WebElement> price1 = driver.findElementsByXPath("//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price-whole' and text()='"+afterDiscountedPrice+"']//parent::span//parent::span//following-sibling::span[@class='a-price a-text-price']//following-sibling::span");
				for (WebElement eachPrice1 : price1) {
					String prc =eachPrice1.getText();
					if(!prc.equals("")) {
						String prc2=prc.replaceAll("₹", "");
						String prc3=prc2.replaceAll("[^0-9]", "");
						int originalValue=Integer.parseInt(prc3);
						System.out.println("OriginalPrice:" + originalValue );
						int newValue = originalValue-afterDiscountPrice;
						double divideValue1=(double)newValue;
						double divideValue=(divideValue1/originalValue);
						System.out.println("divideValue:"+ divideValue );
						double perValue=divideValue*100;
						System.out.println("discountPerinDouble:"+perValue );
						double perValue1=Math.round(perValue);
						int discountPer = (int)perValue1;
						System.out.println("DiscountPercentage:" + discountPer);
						list1.add(discountPer);		
						System.out.println("*********************");
												
					}
					
				}
						
			}	
			
		}
		
		Collections.sort(list1);
		int discountPercantage=list1.get(0);
		/*int discountPercentage =0;
		for (Integer eachDiscount : list1) {
			if(eachDiscount>0) {
				discountPercentage= eachDiscount;
				break;
			}*/
			
			
		
		//System.out.println("Lowest discount of book value is:" + list1.get(0)+"%");
		System.out.println("Lowest discount of book value is:" + discountPercantage+"%");
		
		WebElement name=driver.findElementByXPath("//span[contains(text(),'"+discountPercantage+"%')]//preceding-sibling::span//preceding-sibling::a//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//h2//a//span[@class='a-size-medium a-color-base a-text-normal']");
		String bookName=name.getText();
		System.out.println("Lowest book price name is:" +bookName+" and discount value is:" + discountPercantage );
		
		//3.Find the books which is lesser than 150rs.
		int counter =0;
		Map<String,Integer> map= new HashMap<String,Integer>();
		for (Integer eachPrice : list) {
			if(eachPrice<150) {
				counter ++;
				WebElement name1=driver.findElementByXPath("//span[@class='a-price-whole' and text()='"+eachPrice+"']//preceding-sibling::span//parent::span//parent::span//parent::a//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//h2//a//span");
				String bookName1=name1.getText();
				map.put(bookName1, eachPrice);
			}
			
		}
		
		System.out.println("Total number of books less than Rs.150:" +counter );
		for (Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Bookname is:" +entry.getKey()+" and price is:" + entry.getValue());
			
		}
		
	}

}