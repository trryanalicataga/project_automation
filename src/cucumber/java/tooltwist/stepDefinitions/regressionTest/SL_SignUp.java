package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_SignUpPageObject;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_SignUp {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_SignUpPageObject signUpPageObject = null;
	
	public SL_SignUp(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.signUpPageObject = new SL_SignUpPageObject(ti);
	}
	
	@Given("^I am in studylane sign up page$")
	public void i_am_in_studylane_sign_up_page() throws Throwable {
		signUpPageObject.visitSLSignUp();
	}

	@Given("^I filled out all the required$")
	public void i_filled_out_all_the_required() throws Throwable {
		signUpPageObject.fillUpSignUpFields();
	}

	@Given("^Validations for each field should display if left blank$")
	public void validations_for_each_field_should_display_if_left_blank() throws Throwable {

	}

	@When("^I click Create Account button$")
	public void i_click_Create_Account_button() throws Throwable {

	}

	@Then("^I should be redirected to studylane login page$") 
	public void i_should_be_redirected_to_studylane_login_page() throws Throwable {

	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {

	}
}
