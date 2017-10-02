package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.pageObjects.TestGooglePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class TestEmailRye {
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public TestEmailRyePageObject testEmailRyePageObject = null;
	
	public TestEmailRye(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.testEmailRyePageObject = new TestEmailRyePageObject(ti);
	}

	@Given("I accessed gmail")
	public void i_accessed_gmail() throws Throwable {
		testEmailRyePageObject.visitGoogle();
	}

	@When("I check the email field")
	public void i_check_the_email_field() throws Throwable {
		testEmailRyePageObject.checkEmailField();
	}

	@Then("I should be able to type on it")
	public void i_should_be_able_to_type_on_it() throws Throwable {
		testEmailRyePageObject.typeInEmailField();
	}
	
}
