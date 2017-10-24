package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_StudentLogoutPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_StudentLogout {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_StudentLogoutPageObject sL_StudentLogoutPageObject = null;
	
	public SL_StudentLogout(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_StudentLogoutPageObject = new SL_StudentLogoutPageObject(ti);
	}
	
	@When("^I click the logout link in the header$")
	public void i_click_the_logout_link_in_the_header() throws Throwable {
	    sL_StudentLogoutPageObject.logoutz();
	}
	
	@Then("^I should be logged out of studylane$")
	public void i_should_be_logged_out_of_studylane() throws Throwable {
	
	}

	@Then("^I should not be able to access the my account page$")
	public void i_should_not_be_able_to_access_the_my_account_page() throws Throwable {
	   
	}
}
