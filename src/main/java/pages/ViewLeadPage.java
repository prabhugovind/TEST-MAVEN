package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT View Lead page", "FAIL");
		}

	}
	
	// Verify the FirstName

	//AcessModifier WhichPage MethodName(datatype username)
		public ViewLeadPage verifyViewLeadFirstName(String firstName){
			verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), firstName);
			return this;
		}
		
		public EditLead clickEdit(){
			clickByLink(prop.getProperty("ViewLead.clickEdit.Link"));
			return new EditLead();
		}
		
		public ViewLeadPage verifyViewLeadtext(String LeadId)
		{
			verifyTextContainsByXpath(prop.getProperty("ViewLead.LeadText.Xpath"),LeadId);
			return this;
		}
		
		public LeadsMainPage clickDeleteButton(){
			clickByXpath(prop.getProperty("ViewLeadPage.DeleteButton.Xpath"));
			return new LeadsMainPage();
		}
	
}
