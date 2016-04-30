package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC04_MergeLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "Chrome";
		dataSheetName 	= "TC04_MergeLead";
		testCaseName 	= "TC04_MergeLead";
		testDescription = "CreateLead using using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void MergeLeadTest(String username,String password,String FromLead,String ToLead, String Value3) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.ClickCRMSFALink()
		.ClickLeadsTab()
		.ClickMergeTab()
		.enterFromLead(FromLead)
		.enterToLead(ToLead)
		.clickMerge()
		.AlertAccept()
		.verifyViewLeadtext(Value3);
	
	}
}
