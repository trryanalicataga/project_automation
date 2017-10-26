package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AdminApproveAgentPageObject;
import tooltwist.pageObjects.GSP_AdminConditionallyApprovePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AdminApproveAgent {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AdminApproveAgentPageObject gSP_AdminApproveAgentPageObject = null;
	
	public GSP_AdminApproveAgent(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AdminApproveAgentPageObject = new GSP_AdminApproveAgentPageObject(ti);
	}



	@Given("^The agent is listed as  Conditionally Approved$")
	public void the_agent_is_listed_as_Conditionally_Approved() throws Throwable {
		gSP_AdminApproveAgentPageObject.startApprove();
	}

	@Given("^I click on the Approve button$")
	public void i_click_on_the_Approve_button() throws Throwable {
		gSP_AdminApproveAgentPageObject.startApprove1(); 
	}

	@Given("^I click on the OK button of the prompt$")
	public void i_click_on_the_OK_button_of_the_prompt() throws Throwable {

	}

	@Given("^I click on the QA Verified - Yes radio button on the following tabs$")
	public void i_click_on_the_QA_Verified_Yes_radio_button_on_the_following_tabs() throws Throwable {

	}

	@When("^I click on the Approve button in the QA verified page$")
	public void i_click_on_the_Approve_button_in_the_QA_verified_page() throws Throwable {

	}

	@Then("^The status of the applicant should be changed to approve$")
	public void the_status_of_the_applicant_should_be_changed_to_approve() throws Throwable {
	   
	}
	
}

//GSP_AdminApproveAgent