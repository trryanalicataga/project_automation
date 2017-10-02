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

public class SL_StudentProfilePageObject extends ObjectReference{
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_StudentProfilePageObject.class);

	public SL_StudentProfilePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
}

	public void visitStudentProfile() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://dev.studylane.com.au/login");
		//type in field, type email ad
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(dev_SL_LOGIN_EMAIL));
		WebElement promo = driver.findElement(By.xpath(dev_SL_LOGIN_EMAIL));
		promo.sendKeys("bamboosarah@yopmail.com");
		//type in field, type password
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(dev_SL_LOGIN_PASSWORD));
		WebElement promo1 = driver.findElement(By.xpath(dev_SL_LOGIN_PASSWORD));
		promo1.sendKeys("M0use123");
		Thread.sleep(3000);
		//click on next button
		elementUtil.isClickedElementAvailable(dev_SL_LOGIN_BUTTON);
		Thread.sleep(2000);
	}

	public void checkProfileElements() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Student Personal Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_PERSONAL));
		logger.info("Student Personal Details is available");
		Assert.assertTrue("Student Passport Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_PASSPORT));
		logger.info("Student Passport Details is available");
		Assert.assertTrue("Student Contact Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_CONTACT));
		logger.info("Student Contact Details is available");
		Assert.assertTrue("Student Academic Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_ACADEMIC));
		logger.info("Student Academic Details is available");
		Assert.assertTrue("Student Professional Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_PROFESSIONAL));
		logger.info("Student Professional Details is available");
		Assert.assertTrue("Student Document Details not available",elementUtil.isElementAvailabe(dev_SL_PROFILE_DOCUMENT));
		logger.info("Student Document Details is available");
	}
	
	
	
}
