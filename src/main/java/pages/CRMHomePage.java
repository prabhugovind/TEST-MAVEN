package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT CRMHomePage", "FAIL");
		}
	}
	
public CreateLeadPage ClickCreateLead()

{
	clickByLink(prop.getProperty("CRMHome.CreateLeadLink.LinkText"));
	return new CreateLeadPage();
}

public LeadsMainPage ClickLeadsTab ()

{
	clickByXpath(prop.getProperty("CRMHome.LeadsTab.Xpath"));
	return new LeadsMainPage();
}


public LeadsMainPage clickLeads(){
	clickByXpath(prop.getProperty("CRMHomePage.ClickLeads.Xpath"));
	return new LeadsMainPage();
}

}

