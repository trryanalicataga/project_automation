package tooltwist.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class GSP_SearchCoursesPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_SearchCoursesPageObject.class);

	public GSP_SearchCoursesPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void startAtHomepage() throws InterruptedException {
		
		driver.get("https://dev.globalstudypartners.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='dialogContent_61']/div/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		
	}

	public void enterKeyword() {
		
		driver.findElement(By.xpath(dev_GSP_SEARCHBOX_SEARCHFIELD)).sendKeys("nursing");
		
	}

	public void clickSearch() throws InterruptedException {
		
		elementUtil.isClickedElementAvailable(dev_GSP_SEARCHBOX_SEARCHBUTTON);
		
	}

	public void verifySearchSuccess() {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("What", url!=("https://dev.globalstudypartners.com/search-result?keywords=nursing&country_id=Australia&duration_id=0&cost_id=0#!?keywords=nursing&country_id=Australia&state_id=&city_id=&institution_id=&cost_id=0&english_language_score_type=&english_language_score=&level_of_study="));
		logger.info("Search successful.");
		
	}

}
