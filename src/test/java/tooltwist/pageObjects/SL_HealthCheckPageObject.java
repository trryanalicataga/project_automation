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

public class SL_HealthCheckPageObject extends ObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_HealthCheckPageObject.class);

	public SL_HealthCheckPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void visitHealthCheck() {
		driver.get("https://dev.studylane.com.au/healthcheck");
		logger.info("I'm in Studylane's healthcheck page.");
		
	}

	public void checkHealthValues() {
//		String foo = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_EditControl1_gv']/tbody/tr[11]/td[3]")).getText();
//
//		assertEquals(foo, "Selenium");
//		String bname1 = selenium.getText("//table[@id='bank']/tbody/tr[3]/td[2]");
		String bodyText = driver.findElement(By.xpath(dev_SL_HEALTHCHECK)).getText();
//		String text = "\"status" : \"1\",";
		//Assert.assertTrue("Text not found!", bodyText.contains(text));
		
	}

	

}
