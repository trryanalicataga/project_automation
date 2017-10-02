package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_StudentProfileAgentPageObject;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_StudentProfileAgent {
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_StudentProfileAgentPageObject sL_StudentProfileAgentPageObject = null;
	
	public SL_StudentProfileAgent(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_StudentProfileAgentPageObject = new SL_StudentProfileAgentPageObject(ti);
}
	@When("^I clicked my agent from the menu$")
	public void i_clicked_my_agent_from_the_menu() throws Throwable {
	   sL_StudentProfileAgentPageObject.visitAgent();
	}

	@Then("^I should be redirected to studylane agent profile page$")
	public void i_should_be_redirected_to_studylane_agent_profile_page() throws Throwable {
		sL_StudentProfileAgentPageObject.viewAgentDetails();
	}
	
	@Then("^The following details should be displayedz$")
	public void the_following_details_should_be_displayedz() throws Throwable {
	    
	}
	
}
