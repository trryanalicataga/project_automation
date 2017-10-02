package tooltwist.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_StudentProfileApplicationsPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(TestEmailRyePageObject.class);

	public SL_StudentProfileApplicationsPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void visitApplications() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_APPLICATIONS);
		Thread.sleep(2000);
		logger.info("Applications tab clicked.");
		
	}

	public void viewApplications() throws InterruptedException {
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(dev_SL_VIEWAPPLICATIONS));
		logger.info("Applications displayed.");
		
	}

}
