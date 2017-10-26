package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AgentLoginAfterCApprovePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AgentLoginAfterCApprove {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AgentLoginAfterCApprovePageObject gSP_AgentLoginAfterCApprovePageObject = null;
	
	public GSP_AgentLoginAfterCApprove(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AgentLoginAfterCApprovePageObject = new GSP_AgentLoginAfterCApprovePageObject(ti);
	}
	
	@Given("^I am in my agent account dashboard$")
	public void i_am_in_my_agent_account_dashboard() throws Throwable {

		gSP_AgentLoginAfterCApprovePageObject.agentLogin();
		
	}

	@Given("^The following elements are displayed$")
	public void the_following_elements_are_displayed() throws Throwable {
	   
		gSP_AgentLoginAfterCApprovePageObject.checkElements();
		
	}

	@Given("^I complete the remaining missing required documents$")
	public void i_complete_the_remaining_missing_required_documents() throws Throwable {
		
		gSP_AgentLoginAfterCApprovePageObject.sendRequiredDocs();	
		
	}

	@When("^I click on the Send Application button$")
	public void i_click_on_the_Send_Application_button() throws Throwable {
	
	}

	@Then("^The page should prompt that the team is thoroughly reviewing my application process$")
	public void the_page_should_prompt_that_the_team_is_thoroughly_reviewing_my_application_process() throws Throwable {
	
		gSP_AgentLoginAfterCApprovePageObject.checkIfSent();
		
	}

}

//GSP_AgentLoginAfterCApprove