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

public class SL_CheckVersionNumberPageObject extends ObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_CheckVersionNumberPageObject.class);

	public SL_CheckVersionNumberPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void visitStudylane() {
		driver.get("https://dev.studylane.com.au");
		
	}

	public void checkBuildText() throws InterruptedException {
		Assert.assertTrue("Build version is not displayed.",elementUtil.isElementAvailabe(dev_SL_BV));
		WebElement txt= driver.findElement(By.xpath(dev_SL_BV));
		logger.info("Build version is displayed");
		System.out.println(txt.getText());
		
	}

}
