package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_CourseApplicationPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_CourseApplication {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_CourseApplicationPageObject sL_CourseApplicationPageObject = null;
	
	public SL_CourseApplication(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_CourseApplicationPageObject = new SL_CourseApplicationPageObject(ti);

}
	@Given("^I am in the studylane homepage$")
	public void i_am_in_the_studylane_homepage() throws Throwable {
		sL_CourseApplicationPageObject.goToHome();
	}
	
	@When("^I am redirected to an agent selection page$")
	public void i_am_redirected_to_an_agent_selection_page() throws Throwable {
		sL_CourseApplicationPageObject.applyToCourse();
	}

	@When("^I have selected an agent$")
	public void i_have_selected_an_agent() throws Throwable {
		
	}

	@When("^I am redirected to the course application page$")
	public void i_am_redirected_to_the_course_application_page() throws Throwable {
		
	}

	@When("^I fill-in all the required fields in the form accordions$")
	public void i_fill_in_all_the_required_fields_in_the_form_accordions() throws Throwable {
		
	}

	@When("^I have uploaded my documents$")
	public void i_have_uploaded_my_documents() throws Throwable {
		
	}

	@When("^I click the Submit button$")
	public void i_click_the_Submit_button() throws Throwable {
		
	}

	@Then("^The course should be applied$")
	public void the_course_should_be_applied() throws Throwable {
		
	}

	@Then("^An account should be created for me$")
	public void an_account_should_be_created_for_me() throws Throwable {
		
	}

	@Then("^My uploaded documents should display in my profile$")
	public void my_uploaded_documents_should_display_in_my_profile() throws Throwable {
		
	}

	@Then("^I should receive an email to set up a new password$")
	public void i_should_receive_an_email_to_set_up_a_new_password() throws Throwable {
		
	}	

}
