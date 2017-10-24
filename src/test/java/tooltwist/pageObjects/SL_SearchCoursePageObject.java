package tooltwist.pageObjects;

import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_SearchCoursePageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_SearchCoursePageObject.class);

	public SL_SearchCoursePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void enterKeyword() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_LOGO);
		Assert.assertTrue("Search field unavailable", elementUtil.isElementAvailabe(dev_SL_SEARCHFIELD));
		WebElement promo = driver.findElement(By.xpath(dev_SL_SEARCHFIELD));
		promo.sendKeys("engineering");
		
		elementUtil.isClickedElementAvailable(dev_SL_SEARCHBUTTON);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("What", url!=("https://dev.studylane.com.au/search-result?keywords=engineering&country_id=Australia&duration_id=0&cost_id=0#!?keywords=engineering&country_id=Australia&state_id=&city_id=&institution_id=&cost_id=0&english_language_score_type=&english_language_score=&level_of_study="));
		logger.info("Search successful.");
		
		//https://dev.studylane.com.au/search-result?keywords=engineering&country_id=Australia&duration_id=0&cost_id=0#!?keywords=engineering&country_id=Australia&state_id=&city_id=&institution_id=&cost_id=0&english_language_score_type=&english_language_score=&level_of_study=
	
		elementUtil.isClickedElementAvailable(dev_SL_SHORTLISTBUTTON);
		elementUtil.isClickedElementAvailable(dev_SL_SHORTLISTBUTTON1);
		elementUtil.isClickedElementAvailable(dev_SL_SHORTLIST);
		elementUtil.isClickedElementAvailable(dev_SL_SHORTLIST1);
		elementUtil.isClickedElementAvailable(dev_SL_COMPARE);
		
		Assert.assertTrue("Enter email field unavailable", elementUtil.isElementAvailabe(dev_SL_ENTEREMAILFIELD));
		logger.info("Course compare successful.");
	}

}
