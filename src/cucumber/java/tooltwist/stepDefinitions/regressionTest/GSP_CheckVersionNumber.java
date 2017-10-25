package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_CheckVersionNumberPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_CheckVersionNumber {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_CheckVersionNumberPageObject gSP_CheckVersionNumberPageObject = null;
	
	public GSP_CheckVersionNumber(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_CheckVersionNumberPageObject = new GSP_CheckVersionNumberPageObject(ti);
	}
	
	@Given("^the guest is on the gsp home page$")
	public void the_guest_is_on_the_gsp_home_page() throws Throwable {
		
		gSP_CheckVersionNumberPageObject.checkBV();
		
	}

	@Given("^scrolls to the bottom of the page$")
	public void scrolls_to_the_bottom_of_the_page() throws Throwable {
	  
	}

	@Then("^the versionn number will be displayed on the footer$")
	public void the_versionn_number_will_be_displayed_on_the_footer() throws Throwable {
	  
	}
}
