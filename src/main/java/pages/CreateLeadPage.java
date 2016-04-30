package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		
		
		// Find With <title Tag
		//<title>Create Lead | opentaps CRM</title>		

		if(!verifyTitle("Create Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT Create Lead page", "FAIL");
		}

	}
	
	// Enter the Company Name
	
		public CreateLeadPage enterCompanyName(String companyName){
			enterById(prop.getProperty("CreateLead.CompanyName.Id"), companyName);
			return this;
		}
		
		// Enter the First Name
		
			public CreateLeadPage enterFirstName(String firstName){
				enterById(prop.getProperty("CreateLead.FirstName.Id"), firstName);
				return this;
			}
			
			// Enter the Last Name
			
			public CreateLeadPage enterLastName(String LastName){
				enterById(prop.getProperty("CreateLead.LastName.Id"), LastName);
				return this;
			}
			
			public CreateLeadPage enterPhoneNumber(String PhoneNum){
				enterById(prop.getProperty("CreateLead.PhoneNum.Id"), PhoneNum);
				return this;
			}
			
			// Enter the Create Lead Button
			
			public ViewLeadPage clickLeadButton(){
				clickByName(prop.getProperty("CreateLead.CreateLeadButton.Name"));
				//return this;
				return new ViewLeadPage();
				//View Lead | opentaps CRM
			}
	
}
