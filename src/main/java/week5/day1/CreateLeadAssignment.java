package week5.day1;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLeadAssignment extends ProjectSpecificMethods {
	
	@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vishvanathan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Veerabathiran");
		//10.enter first name local
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("vishva");
		//11.enter last name local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("veera");
		//12.enter salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Welcome Everyone !");
		//13.choose source
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select ss = new Select(source);
		ss.selectByValue("LEAD_EMPLOYEE");
		//14.enter title
		driver.findElementByName("generalProfTitle").sendKeys("Mr.");
		//15.enter annual revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("5,00,000");
		//16.choose industry
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select indust = new Select(industry);
		indust.selectByValue("IND_RETAIL");
		//17.Choose Ownership
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipsel = new Select(ownership);
		List<WebElement> options = ownershipsel.getOptions();
		ownershipsel.selectByIndex(5);
		//18.enter sic code
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		//19.enter description
		driver.findElementById("createLeadForm_description").sendKeys("Welcome Test leaf.Happy learning !");
		//20.enter important note
		driver.findElementById("createLeadForm_importantNote").sendKeys("Thanks Leaf");
		//21.enter country code
		WebElement countrycode =driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		//Thread.sleep(3000);
		countrycode.clear();
		countrycode.sendKeys("2");
		countrycode.sendKeys(Keys.DOWN);
		//22.enter area code
		WebElement area=driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		area.click();
		area.clear();
		area.sendKeys("10");
		//23.enter extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("77670",Keys.UP);
		//24.enter department
		driver.findElementById("createLeadForm_departmentName").sendKeys("testing");
		//25.choose preferred currency
		WebElement preferredCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select preCurrency	= new Select(preferredCurrency);
		preCurrency.selectByVisibleText("INR - Indian Rupee");
		//26.enter number of employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5,50,000");
		//27.enter ticker symbol
		driver.findElementByName("tickerSymbol").sendKeys("Manual", Keys.DOWN);
		//28.enter person to ask for
		driver.findElementByName("primaryPhoneAskForName").sendKeys("Where is test leaf");
		//29.enter web url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com");
		//30.enter to Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Gomathi");
		//31.enter address line 1 and address line 2
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("2/75, Sri Lakshmi vinayagar kovil street");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Karapakkam");
		//32.enter city
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		//33.choose state
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select states = new Select(state);
		states.selectByVisibleText("Indiana");
		//34.choose country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countries = new Select (country);
		countries.selectByVisibleText("India");

		//35.enter zipal /postal code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("641653");
		//36.enter zipal /postal code extension
		driver.findElementByName("generalPostalCodeExt").sendKeys("77670", Keys.UP);
		//37.Choose Marketing campaign
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketCam=new Select(marketingCampaign);
		marketCam.selectByVisibleText("Demo Marketing Campaign");	
		//38.enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9524242092", Keys.DOWN);
		//39.enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vishvatest@gmail.com");
		//40.click create lead
		driver.findElementByName("submitButton").click();
		//41.verify the firstname
		String firstName =driver.findElementById("viewLead_firstName_sp").getText();
		if(firstName.contains("Vishvanathan")) {
			System.out.println("My first name is :" + firstName + " and firstname is correct");
		}
		else
		{
			System.out.println("My first name is :" + firstName + " and firstname is incorrect");
		}
		
		
	}

}
