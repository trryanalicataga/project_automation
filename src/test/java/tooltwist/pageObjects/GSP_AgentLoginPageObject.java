package tooltwist.pageObjects;


import java.util.Timer;

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

public class GSP_AgentLoginPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_AgentLoginPageObject.class);

	public GSP_AgentLoginPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void startInHomepage() throws InterruptedException{
		
		driver.get("https://dev.globalstudypartners.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='dialogContent_61']/div/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(dev_GSP_HEADER_LOGIN)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='loginButton-form']/div[1]/div/div/div[1]/input")).sendKeys("supernewmasteragent@yopmail.com");
		driver.findElement(By.xpath("//*[@id='loginButton-form']/div[2]/div/div/div[1]/input")).sendKeys("M0use123");
		driver.findElement(By.xpath("//*[@id='loginButton-form']/div[4]")).click();
		
		//*[@id="dialogContent_61"]/div/div[2]/div[3]/div[3]
	}

	public void verifyAgent_isLoggedIn() throws InterruptedException {
		
		Assert.assertTrue("List of Students label is not displayed.",elementUtil.isElementAvailabe("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[1]"));
		logger.info("Agent has successfully logged in.");
		
	}

}
