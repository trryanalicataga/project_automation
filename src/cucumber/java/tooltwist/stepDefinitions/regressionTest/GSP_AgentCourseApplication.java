package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_AgentCourseApplicationPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_AgentCourseApplication {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_AgentCourseApplicationPageObject gSP_AgentCourseApplicationPageObject = null;
	
	public GSP_AgentCourseApplication(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_AgentCourseApplicationPageObject = new GSP_AgentCourseApplicationPageObject(ti);
	}
	
	@When("^I click apply on the bookmarked section$")
	public void i_click_apply_on_the_bookmarked_section() throws Throwable {

		gSP_AgentCourseApplicationPageObject.startTheApplication();

	}

	@When("^I input my student's email in the Student Contact Details$")
	public void i_input_my_student_s_email_in_the_Student_Contact_Details() throws Throwable {


	}

	@When("^The form prompts me to reload all the fields with my student's details$")
	public void the_form_prompts_me_to_reload_all_the_fields_with_my_student_s_details() throws Throwable {


	}

	@When("^I fill in the remaining required fields$")
	public void i_fill_in_the_remaining_required_fields() throws Throwable {


	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {


	}

	@Then("^The student should be applied to the course$")
	public void the_student_should_be_applied_to_the_course() throws Throwable {


	}

	@Then("^I and the student should receive an email about the application$")
	public void i_and_the_student_should_receive_an_email_about_the_application() throws Throwable {


	}

}
