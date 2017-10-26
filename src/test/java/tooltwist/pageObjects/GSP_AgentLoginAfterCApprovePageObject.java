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

public class GSP_AgentLoginAfterCApprovePageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_AgentLoginAfterCApprovePageObject.class);

	public GSP_AgentLoginAfterCApprovePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void agentLogin() throws InterruptedException {
		
		driver.get("https://dev.globalstudypartners.com/login");
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(dev_GSP_USERNAME));
		WebElement promo = driver.findElement(By.xpath(dev_GSP_USERNAME));
		promo.sendKeys("qweqwe@yopmail.com");
		//type in field, type password
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(dev_GSP_PASSWORD));
		WebElement promo1 = driver.findElement(By.xpath(dev_GSP_PASSWORD));
		promo1.sendKeys("M0use123");
		Thread.sleep(3000);
		//click on next button
		elementUtil.isClickedElementAvailable(dev_GSP_LOGINBUTTON);
		Thread.sleep(2000);
		
	}

	public void checkElements() throws InterruptedException {
		
		
		Assert.assertTrue("Dashboard button is not available", elementUtil.isElementAvailabe(dev_GSP_DASHBOARDBTN));
		logger.info("Dahsboard button is available");
		
		Assert.assertTrue("My Profile button is not available", elementUtil.isElementAvailabe(dev_GSP_MYPROFILEBTN));
		logger.info("My Profile button is available");
		
		Assert.assertTrue("GSP Message is not available", elementUtil.isElementAvailabe(dev_GSP_MESSAGE));
		logger.info("GSP Message is available");
		
		Assert.assertTrue("GSP Progress Tracker is not available", elementUtil.isElementAvailabe(dev_GSP_PROGRESSTRACKER));
		logger.info("GSP Progress Tracker is available");
		
		Assert.assertTrue("GSP Application Percentage is not available", elementUtil.isElementAvailabe(dev_GSP_APPLICATIONPERC));
		logger.info("GSP Application Percentage is available");
		
		//dev_GSP_PROGRESSTRACKER
		
	}
	
	static int interval;
	static Timer timer;

	public void sendRequiredDocs() throws InterruptedException {
//		
//		int delay = 1000;
//		int period = 1000;
//		timer = new Timer();
//		interval = 60;
//		System.out.println(60);
//		timer.scheduleAtFixedRate(new TimerTask() {
//		
		
		driver.findElement(By.xpath(dev_GSP_DOCUMENTTRACKER)).click();
		logger.info("Complete required documents now, 60 seconds.");
		
		Thread.sleep(60000);
		
		driver.findElement(By.xpath(dev_GSP_SENDAPPLICATION)).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(dev_GSP_PROMPTOK)).click();
		logger.info("Successful application sent.");
		
		Thread.sleep(1000);
	}

	public void checkIfSent() throws InterruptedException {
		
		Thread.sleep(1000);
		
		Assert.assertTrue("Required documents can't be sent.", elementUtil.isElementAvailabe(dev_GSP_APPLICATIONSENT));
		logger.info("Required documents has been successfully sent.");
		
	}

}

//GSP_AgentLoginAfterCApprove