package tooltwist.stepDefinitions.regressionTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.pageObjects.GSP_SearchCoursesPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

public class GSP_SearchCourses {
	//test changes
	public WebDriver driver =  null;
	public ElementUtil elementUtil = null;
	public GSP_SearchCoursesPageObject gSP_SearchCoursesPageObject = null;
	
	public GSP_SearchCourses(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.gSP_SearchCoursesPageObject = new GSP_SearchCoursesPageObject(ti);
	}
	
	@Given("^I am in the homepage of GSP$")
	public void i_am_in_the_homepage_of_GSP() throws Throwable {

		gSP_SearchCoursesPageObject.startAtHomepage();

	}

	@When("^I enter a keyword in the searchfield$")
	public void i_enter_a_keyword_in_the_searchfield() throws Throwable {

		gSP_SearchCoursesPageObject.enterKeyword();

	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {

		gSP_SearchCoursesPageObject.clickSearch();
		
	}

	@Then("^I should be forwarded to the course results page with courses related to the keywords I entered$")
	public void i_should_be_forwarded_to_the_course_results_page_with_courses_related_to_the_keywords_I_entered() throws Throwable {

		gSP_SearchCoursesPageObject.verifySearchSuccess();

	}

}
