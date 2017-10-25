package tooltwist.pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class GSP_AdminConditionallyApprovePageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_AdminConditionallyApprovePageObject.class);

	public GSP_AdminConditionallyApprovePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void viewApplicants() throws InterruptedException {
		
//		driver.findElement(By.xpath(dev_GSP_STATUSSELECTOR)).click();
//		WebElement promo = driver.findElement(By.xpath(dev_GSP_STATUSSELECTOR));
//		promo.sendKeys("c");
//		Thread.sleep(1000);
//		promo.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(dev_GSP_CLICKER)).click();
		driver.findElement(By.xpath(dev_GSP_CONDITIONALLYAPPROVE)).click();
		Thread.sleep(1000);
		WebElement promowz = driver.findElement(By.xpath(dev_GSP_CAPPROVEREASON));
		promowz.sendKeys("c");
		Thread.sleep(1000);
		driver.findElement(By.xpath(dev_GSP_CAPPROVEBUTTON)).click();
		Assert.assertTrue("Successfully conditionally approved!", elementUtil.isElementAvailabe(dev_GSP_CAPPROVESUCCESS));
		logger.info("Passed conditionally approved");
		
	}
}
