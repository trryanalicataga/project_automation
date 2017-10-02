package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_CheckVersionNumberPageObject;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_CheckVersionNumber {
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_CheckVersionNumberPageObject checkVersionNumberPageObject = null;
	
	public SL_CheckVersionNumber(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.checkVersionNumberPageObject = new SL_CheckVersionNumberPageObject(ti);
	}
	
	
	@Given("^the guest is on the studylane home page$")
	public void the_guest_is_on_the_studylane_home_page() throws Throwable {
		checkVersionNumberPageObject.visitStudylane();
	}

	@When("^I scroll to the bottom of the page$")
	public void i_scroll_to_the_bottom_of_the_page() throws Throwable {

	}

	@Then("^the version number will be displayed on the footer$")
	public void the_version_number_will_be_displayed_on_the_footer() throws Throwable {
		checkVersionNumberPageObject.checkBuildText();
	}
}
