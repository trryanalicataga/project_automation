package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_StudentProfileUpdatePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_StudentProfileUpdate {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_StudentProfileUpdatePageObject sL_StudentProfileUpdatePageObject = null;
	
	public SL_StudentProfileUpdate(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_StudentProfileUpdatePageObject = new SL_StudentProfileUpdatePageObject(ti);
	}
	
	@When("^I edit the details in my profile$")
	public void i_edit_the_details_in_my_profile() throws Throwable {
		sL_StudentProfileUpdatePageObject.editDetails();
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {

	}

	@Then("^The details I added should reflect in My Profile$")
	public void the_details_I_added_should_reflect_in_My_Profile() throws Throwable {

	}

}
