package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AdminLoginPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AdminLogin {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AdminLoginPageObject gSP_AdminLoginPageObject = null;
	
	public GSP_AdminLogin(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AdminLoginPageObject = new GSP_AdminLoginPageObject(ti);
	}

	@Given("^I visit the login page of GSP$")
	public void i_visit_the_login_page_of_GSP() throws Throwable {
			gSP_AdminLoginPageObject.startLogin();
	}

	@Given("^The header text displays Account Login$")
	public void the_header_text_displays_Account_Login() throws Throwable {

	}

	@When("^I input my credentials$")
	public void i_input_my_credentials() throws Throwable {

	}

	@When("^I click on the Login button$")
	public void i_click_on_the_Login_button() throws Throwable {

	}

	@Then("^I should be redirected to Partners Applications List$")
	public void i_should_be_redirected_to_Partners_Applications_List() throws Throwable {

	}
	
}
