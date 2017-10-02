package tooltwist.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_StudentProfileAgentPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_StudentProfileAgentPageObject.class);

	public SL_StudentProfileAgentPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void visitAgent() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_AGENT);
		Thread.sleep(2000);
		
	}

	public void viewAgentDetails() throws InterruptedException {
		Assert.assertTrue("Agent details is not available", elementUtil.isElementAvailabe(dev_SL_AGENT));
		logger.info("Agent details are displayed.");
	}

}
