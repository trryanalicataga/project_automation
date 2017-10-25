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

public class GSP_CheckVersionNumberPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_CheckVersionNumberPageObject.class);

	public GSP_CheckVersionNumberPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}



	public void checkBV() throws InterruptedException {
		driver.get("https://dev.globalstudypartners.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(dev_GSP_SPLASH)).click();
		logger.info("Scroll down now.");
		
		Thread.sleep(2000);
		Assert.assertTrue("Build version is not displayed.",elementUtil.isElementAvailabe(dev_GSP_FOOTER));
		logger.info("Check 1.");
		WebElement txt= driver.findElement(By.xpath(dev_GSP_FOOTER));
		logger.info("Build version is displayed");
		System.out.println(txt.getText());
		
	}
}
