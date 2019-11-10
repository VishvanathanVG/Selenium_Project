package week5.day2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadFullExcelDataProvider extends ProjectSpecificMethods {

	@DataProvider(name="createLeadData")
	public String[][] fetchCreateLeadData() throws IOException {
		
		LearnReadDataExcelOwn excelData = new LearnReadDataExcelOwn();
		String[][] readDataExcel = excelData.readDataExcel("LeadsFullData","Create_Lead");
		return readDataExcel;
		
	}
	
	@Test(priority=1,dataProvider="createLeadData")
	public void runCreateLead(String companyName,String firtsName, String latsName, String FirstNameLocal,	
			String LastNameLocal,	String Salutation , String Source,	String Title,	String AnnualRevenue,	
			String Industry,	String SICCode,	String Description,	String ImportantNote,	String CountryCode,
			String AreaCode,	String Extension,	String Department,	String Currency,	String NumberOfEmployees,
			String TickerSymbol,	String PersonToAsk,	String WebURL,	String Name,	String Addrline1,	
			String Addrline2,	String City,	String State,	String Country,	String PostalCode,
			String PostalExtension,	String MarketingCampagin,	String PhoneNumber,	String EmailAddr) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firtsName);
		driver.findElementById("createLeadForm_lastName").sendKeys(latsName);
		//10.enter first name local
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys(FirstNameLocal);
		//11.enter last name local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys(LastNameLocal);
		//12.enter salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys(Salutation);
		//13.choose source
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select ss = new Select(source);
		ss.selectByValue(Source);
		//14.enter title
		driver.findElementByName("generalProfTitle").sendKeys(Title);
		//15.enter annual revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys(AnnualRevenue);
		//16.choose industry
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select indust = new Select(industry);
		indust.selectByValue(Industry);
		//17.Choose Ownership
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipsel = new Select(ownership);
		List<WebElement> options = ownershipsel.getOptions();
		ownershipsel.selectByIndex(5);
		//18.enter sic code
		driver.findElementById("createLeadForm_sicCode").sendKeys(SICCode);
		//19.enter description
		driver.findElementById("createLeadForm_description").sendKeys(Description);
		//20.enter important note
		driver.findElementById("createLeadForm_importantNote").sendKeys(ImportantNote);
		//21.enter country code
		WebElement countrycode =driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		//Thread.sleep(3000);
		countrycode.clear();
		countrycode.sendKeys(CountryCode);
		countrycode.sendKeys(Keys.DOWN);
		//22.enter area code
		WebElement area=driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		area.click();
		area.clear();
		area.sendKeys(AreaCode);
		//23.enter extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys(Extension,Keys.UP);
		//24.enter department
		driver.findElementById("createLeadForm_departmentName").sendKeys(Department);
		//25.choose preferred currency
		WebElement preferredCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select preCurrency	= new Select(preferredCurrency);
		preCurrency.selectByVisibleText(Currency);
		//26.enter number of employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys(NumberOfEmployees);
		//27.enter ticker symbol
		driver.findElementByName("tickerSymbol").sendKeys(TickerSymbol, Keys.DOWN);
		//28.enter person to ask for
		driver.findElementByName("primaryPhoneAskForName").sendKeys(PersonToAsk);
		//29.enter web url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys(WebURL);
		//30.enter to Name
		driver.findElementById("createLeadForm_generalToName").sendKeys(Name);
		//31.enter address line 1 and address line 2
		driver.findElementById("createLeadForm_generalAddress1").sendKeys(Addrline1);
		driver.findElementById("createLeadForm_generalAddress2").sendKeys(Addrline2);
		//32.enter city
		driver.findElementById("createLeadForm_generalCity").sendKeys(City);
		//33.choose state
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select states = new Select(state);
		states.selectByVisibleText(State);
		//34.choose country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countries = new Select (country);
		countries.selectByVisibleText(Country);

		//35.enter zipal /postal code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys(PostalCode);
		//36.enter zipal /postal code extension
		driver.findElementByName("generalPostalCodeExt").sendKeys(PostalExtension, Keys.UP);
		//37.Choose Marketing campaign
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketCam=new Select(marketingCampaign);
		marketCam.selectByVisibleText(MarketingCampagin);	
		//38.enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(PhoneNumber, Keys.DOWN);
		//39.enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(EmailAddr);
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
