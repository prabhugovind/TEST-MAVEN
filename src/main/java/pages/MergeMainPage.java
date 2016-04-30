package pages;



import org.openqa.selenium.Alert;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeMainPage extends OpentapsWrappers{


	public MergeMainPage() {

//Yet to write
		}

	// Enter the From Lead
		public MergeMainPage enterFromLead(String Leadexcelvalue){
			enterById(prop.getProperty("MergeMain.FromLead.id"), Leadexcelvalue);
			return this;
		}

		// Enter the To Lead
		public MergeMainPage enterToLead(String Leadexcelvalue){
			enterById(prop.getProperty("MergeMain.ToLead.id"), Leadexcelvalue);
			return this;
		}

		// Click Merge
		public MergeMainPage clickMerge() {
			clickByClassNameForAlert(prop.getProperty("MergeMain.MergeButton.Class"));
			return this;
		}	
			
		//Handle Alert
			public ViewLeadPage AlertAccept() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Alert unexpected");;
				}
				Alert a = driver.switchTo().alert();
			    a.accept();
			    return new ViewLeadPage();
			}
			
			
}
