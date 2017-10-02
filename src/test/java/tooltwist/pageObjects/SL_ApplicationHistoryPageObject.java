package tooltwist.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_ApplicationHistoryPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_ApplicationHistoryPageObject.class);

	public SL_ApplicationHistoryPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void clickStatusHistory() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_APPLICATION_STATHISTORY);
		logger.info("Status history 1 is clicking.");
		Thread.sleep(2000);
		elementUtil.isClickedElementAvailable(dev_SL_APPLICATION_STATHISTORY2);
		logger.info("Status history 2 is clicking.");
		Thread.sleep(2000);
		elementUtil.isClickedElementAvailable(dev_SL_APPLICATION_STATHISTORY3);
		logger.info("Status history 3 is clicking.");
		Thread.sleep(2000);
	}

	public void viewStatusHistory() throws InterruptedException {
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(dev_SL_APPLICATION_STATUSHISTORYVIEW));
		logger.info("Status history is displayed properly.");
	}
	
}
