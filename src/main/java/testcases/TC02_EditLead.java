package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_EditLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC01_EditLead";
		testCaseName 	= "TC01 - EditLead (POM)";
		testDescription = "Edit Lead to Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String username,String password, String loginName, String userdata,String Value1, String Value2, String Value3) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.ClickCRMSFALink()
		.ClickLeadsTab()
		.clickFindLead()
		.enterLeadID(userdata)
		.clickFindLeads()
		.clickLeadID()
		.clickEdit()
		.selectSource(Value1)
		.AddSource()
		.selectCampaign(Value2)
		.AddCampaign()
		.clickUpdate()
		.verifyViewLeadtext(Value3);
		
		
		
	}
}
