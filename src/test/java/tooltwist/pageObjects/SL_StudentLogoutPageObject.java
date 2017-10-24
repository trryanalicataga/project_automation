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

public class SL_StudentLogoutPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_StudentProfileUpdatePageObject.class);

	public SL_StudentLogoutPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void logoutz() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_LOGINPANEL);
		elementUtil.isClickedElementAvailable(dev_SL_LOGOUTBUTTON);
		Assert.assertTrue("Logout fails",elementUtil.isElementAvailabe(dev_SL_LOGINFORM));
		logger.info("Logout success");
		Thread.sleep(1000);
		logger.info("waiting...");

		String url = driver.getCurrentUrl();
		Assert.assertTrue("Successful logout", url!=("https://dev.studylane.com.au/studylane-4"));
		logger.info("Passed");
	}


}
