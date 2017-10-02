package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_StudentProfileApplicationsPageObject;
import tooltwist.pageObjects.TestEmailRyePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_StudentProfileApplications {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_StudentProfileApplicationsPageObject sL_StudentProfileApplicationsPageObject = null;
	
	public SL_StudentProfileApplications(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_StudentProfileApplicationsPageObject = new SL_StudentProfileApplicationsPageObject(ti);

}
	
	@When("^I clicked My Applications from the menu$")
	public void i_clicked_My_Applications_from_the_menu() throws Throwable {
		sL_StudentProfileApplicationsPageObject.visitApplications();
	}

	@Then("^I should be redirected my My Applications page$")
	public void i_should_be_redirected_my_My_Applications_page() throws Throwable {
		sL_StudentProfileApplicationsPageObject.viewApplications();
	}
	
}