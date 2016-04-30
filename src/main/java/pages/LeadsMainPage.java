package pages;



import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadsMainPage extends OpentapsWrappers{


	public LeadsMainPage() {
		
		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Leads page", "FAIL");
		}
		}
	
	public MergeMainPage ClickMergeTab ()

	{
		clickByXpath(prop.getProperty("LeadsMain.MergeLead.Xpath"));
		return new MergeMainPage();
	}

	public FindLeads clickFindLead(){
		clickByLink(prop.getProperty("EditLead.EditLead.Link"));
		return new FindLeads();
	}
	
	public FindLeads clickFindLeads(){
		clickByXpath(prop.getProperty("LeadsPage.FindLeads.Xpath"));
		return new FindLeads();
}
}