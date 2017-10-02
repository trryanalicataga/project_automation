package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_HealthCheckPageObject;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_HealthCheck {
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_HealthCheckPageObject sL_HealthCheckPageObject = null;
	
	public SL_HealthCheck(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_HealthCheckPageObject = new SL_HealthCheckPageObject(ti);

}
	
	@Given("^I am on the studylane healthcheck url$")
	public void i_am_on_the_studylane_healthcheck_url() throws Throwable {
			sL_HealthCheckPageObject.visitHealthCheck();
	}

	@When("^I check the values in the page$")
	public void i_check_the_values_in_the_page() throws Throwable {
		sL_HealthCheckPageObject.checkHealthValues();
	}

	@Then("^The values should be one$")
	public void the_values_should_be_one() throws Throwable {

	}
	
}