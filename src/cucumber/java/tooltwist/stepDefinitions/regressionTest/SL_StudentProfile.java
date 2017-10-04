package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_StudentProfilePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_StudentProfile {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_StudentProfilePageObject sL_StudentProfilePageObject = null;
	
	public SL_StudentProfile(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_StudentProfilePageObject = new SL_StudentProfilePageObject(ti);

}
	
	@Given("^I am in studylane homepage$")
	public void i_am_in_studylane_homepage() throws Throwable {
		sL_StudentProfilePageObject.visitStudentProfile();
	}


	@When("^I clicked my profile from the menu$")
	public void i_clicked_my_profile_from_the_menu() throws Throwable {

	}

	@Then("^I should be redirected to studylane student profile page$")
	public void i_should_be_redirected_to_studylane_student_profile_page() throws Throwable {

	}

	@Then("^The following details should be displayed$")
	public void the_following_details_should_be_displayed() throws Throwable {
		sL_StudentProfilePageObject.checkProfileElements();

	}

	
}
