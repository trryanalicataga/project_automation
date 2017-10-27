package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AgentLoginPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AgentLogin {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AgentLoginPageObject gSP_AgentLoginPageObject = null;
	
	public GSP_AgentLogin(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AgentLoginPageObject = new GSP_AgentLoginPageObject(ti);
	}
	
	@Given("^I am in GSP homepage$")
	public void i_am_in_GSP_homepage() throws Throwable {
			
		gSP_AgentLoginPageObject.startInHomepage();

	}

	@Given("^I click on the Login button in the header$")
	public void i_click_on_the_Login_button_in_the_header() throws Throwable {


	}

	@Given("^A login modal displays$")
	public void a_login_modal_displays() throws Throwable {


	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {


	}

	@Then("^I should be redirected to the Manage Students page$")
	public void i_should_be_redirected_to_the_Manage_Students_page() throws Throwable {


	}

	@Then("^The following tabs should display$")
	public void the_following_tabs_should_display() throws Throwable {

		gSP_AgentLoginPageObject.verifyAgent_isLoggedIn();

	}



}
