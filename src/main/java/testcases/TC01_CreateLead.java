package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_CreateLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC001_POM_Data";
		testCaseName 	= "TC01C - CreateLead(POM)";
		testDescription = "Create Lead using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void CreateLeadForOpentaps(String username,String password, String companyName, String firstName,String LastName,String PhoneNum) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.ClickCRMSFALink()
		.ClickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(LastName)
		.enterPhoneNumber(PhoneNum)
		.clickLeadButton()
		.verifyViewLeadFirstName(firstName);
		
		
		//.clickLoginForFailure()
		//.getErrorMessage();
	}
}
