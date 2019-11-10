package org.testleaf.leaftaps.testcases;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import week5.day1.CreateLeadAssignment;
import week5.day1.DeleteLeadAssignment;
import week5.day1.DuplicateLeadAssignment;
import week5.day1.EditLeadAssignment;

public class TestCasesRun extends ProjectSpecificMethods{

	CreateLeadAssignment createlead ;
	EditLeadAssignment editlead;
	DuplicateLeadAssignment duplicatelead;
	DeleteLeadAssignment deletelead;
	
	@BeforeMethod
	public void setUP() {
		
		//login(Str);
	}
	
	@Test(priority=1)
	public void createLeadTest() {
		createlead = new CreateLeadAssignment();
		createlead.runCreateLead();
	}
	
	@Test(priority=2)
	public void editLeadTest() throws InterruptedException {
		
		editlead = new EditLeadAssignment();
		editlead.runEditLead();	
	}
	
	@Test(priority=3)
	public void dulicateLeadTest() throws InterruptedException {
		
		duplicatelead = new DuplicateLeadAssignment();
		duplicatelead.runDuplicateLead();
	}
	
	@Test(priority=4)
	public void deleteLeadTest() throws InterruptedException {
		
		deletelead = new DeleteLeadAssignment();
		deletelead.runDeleteLead();
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
	
	
}
