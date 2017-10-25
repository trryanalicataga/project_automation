package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AdminConditionallyApprovePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AdminConditionallyApprove {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AdminConditionallyApprovePageObject gSP_AdminConditionallyApprovePageObject = null;
	
	public GSP_AdminConditionallyApprove(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AdminConditionallyApprovePageObject = new GSP_AdminConditionallyApprovePageObject(ti);
	}
	@Given("^An agent has initially applied$")
	public void an_agent_has_initially_applied() throws Throwable {
		gSP_AdminConditionallyApprovePageObject.viewApplicants();
	}

	@When("^I click on the Conditionally Approve button$")
	public void i_click_on_the_Conditionally_Approve_button() throws Throwable {
	
	}

	@When("^I include a reason$")
	public void i_include_a_reason() throws Throwable {
	
	}

	@Then("^The status of the applicant should be changed to conditionally approved$")
	public void the_status_of_the_applicant_should_be_changed_to_conditionally_approved() throws Throwable {

	}

	@Then("^I should receive an email regarding the status change$")
	public void i_should_receive_an_email_regarding_the_status_change() throws Throwable {

	}

	@Then("^The agent should receive an email with a Create new password token$")
	public void the_agent_should_receive_an_email_with_a_Create_new_password_token() throws Throwable {
	  
	}

	@Then("^The email should have the following contents$")
	public void the_email_should_have_the_following_contents() throws Throwable {
	    
	}
}
