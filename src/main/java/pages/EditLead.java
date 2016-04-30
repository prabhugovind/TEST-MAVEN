package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLead extends OpentapsWrappers{
	
	public EditLead() {

		if(!verifyTitle("opentaps CRM")){
			Reporter.reportStep("This is NOT Edit Lead page", "FAIL");
		}

	}
	
	public EditLead selectSource(String Value1){
		selectById(prop.getProperty("UpdateLead.selectSource.Id"),Value1);
		return this;
	}
	
	public EditLead AddSource(){
		clickByXpath(prop.getProperty("UpdateLead.clickEdit.Link.AddSource.Xpath"));
		return this;
	}

	public EditLead selectCampaign(String Value2){
		selectById(prop.getProperty("UpdateLead.selectCampaign.Id"),Value2);
		return this;
	}

	public EditLead AddCampaign(){
		clickByXpath(prop.getProperty("UpdateLead.AddCampaign.Xpath"));
		return this;
	}

	public ViewLeadPage clickUpdate(){
		clickByXpath(prop.getProperty("UpdateLead.Update.Xpath"));
		return new ViewLeadPage();
	}
}
