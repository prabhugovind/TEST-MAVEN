package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeads extends OpentapsWrappers{
	String id =null;
	public FindLeads() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Find Leads page", "FAIL");
		}

	}
	
	// Enter the Lead ID
		public FindLeads enterLeadID(String userdata){
			enterByXpath(prop.getProperty("EditLead.LeadID.Xpath"), userdata);
			return this;
		}

		// Click Find Leads button
		public FindLeads clickFindLeads(){
			
			clickByXpath(prop.getProperty("EditLead.FindLeads.Xpath"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
	System.out.println("Exception occurred");
			}
			return this;
			
		}

		// Click Lead ID
		public ViewLeadPage clickLeadID(){
			clickByXpath(prop.getProperty("EditLead.clickLead.Xpath"));
			return new ViewLeadPage();
		}
				
		
		public FindLeads clickPhone(){
			clickByXpath(prop.getProperty("FindLeadsPage.Phone.Xpath"));
			return this;
		}
		
		public FindLeads enterPhone(String phoneNum){
			enterByXpath(prop.getProperty("FindLeadsPage.EnterPhone.Xpath"), phoneNum);
			return this;
		}

		public FindLeads clickFindLeadsButton(){
			clickByXpath(prop.getProperty("FindLeadsPage.FindLeadsButton.Xpath"));
			return this;
		}
		
		public FindLeads enterLeadID(){
			System.out.println(id);
			enterByXpath(prop.getProperty("FindLeadsPage.LeadID.Xpath"), id);
			return this;
		}
		
		public FindLeads findID(){
			id = getTextByXpath(prop.getProperty("FindLeadsPage.ClickID.Xpath"));
			System.out.println(id);
			return this;
			
		}
		
		public FindLeads checkNoRecords(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			verifyTextContainsByXpath(prop.getProperty("FindLeadsPage.checkNoRecords.Xpath"), "No records to display");
			return this;
		}
		
		public ViewLeadPage clickID(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickByXpath(prop.getProperty("FindLeadsPage.ClickID.Xpath"));
			return new ViewLeadPage();
		}
		

		

}
