package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_DeleteLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC_01_DeleteLead";
		testCaseName 	= "TC_01 - Delete Lead(POM)";
		testDescription = "Delete Lead From Company Record";
	}
	
	
	@Test(dataProvider="fetchData")
	public void DeleteLeadFromRecord(String username,String password, String phoneNum) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.ClickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhone(phoneNum)
		.clickFindLeadsButton()
		.clickID()
		.clickDeleteButton()
		.clickFindLeads()
		.clickPhone()
		.enterPhone(phoneNum)
		.clickFindLeadsButton()
		.checkNoRecords();
		
	}
}
