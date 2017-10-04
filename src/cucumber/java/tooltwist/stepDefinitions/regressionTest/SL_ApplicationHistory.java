package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_ApplicationHistoryPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_ApplicationHistory {
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_ApplicationHistoryPageObject sL_ApplicationHistoryPageObject = null;
	
	public SL_ApplicationHistory(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_ApplicationHistoryPageObject = new SL_ApplicationHistoryPageObject(ti);
	}
	@When("^I click status history from the application card$")
	public void i_click_status_history_from_the_application_card() throws Throwable {
		sL_ApplicationHistoryPageObject.clickStatusHistory();
	}

	@Then("^I should be shown a bubble with the history of the application$")
	public void i_should_be_shown_a_bubble_with_the_history_of_the_application() throws Throwable {
		sL_ApplicationHistoryPageObject.viewStatusHistory();
	}
}
