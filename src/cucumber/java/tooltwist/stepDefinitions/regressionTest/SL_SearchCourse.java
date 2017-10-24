package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.SL_SearchCoursePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class SL_SearchCourse {
	
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public SL_SearchCoursePageObject sL_SearchCoursePageObject = null;
	
	public SL_SearchCourse(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.sL_SearchCoursePageObject = new SL_SearchCoursePageObject(ti);

}
	
	@When("^I enter a keyword in the enter search textbox$")
	public void i_enter_a_keyword_in_the_enter_search_textbox() throws Throwable {
	    sL_SearchCoursePageObject.enterKeyword();
	}

	@When("^click search$")
	public void click_search() throws Throwable {
	    
	}

	@Then("^I should be forwarded to the search results with courses related to the fields I entered$")
	public void i_should_be_forwarded_to_the_search_results_with_courses_related_to_the_fields_I_entered() throws Throwable {
	   
	}

}
