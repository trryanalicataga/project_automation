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

public class GSP_AdminLoginPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_AdminLoginPageObject.class);

	public GSP_AdminLoginPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void startLogin() throws InterruptedException {
		
		driver.get("https://dev.globalstudypartners.com/login");
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(dev_GSP_USERNAME));
		WebElement promo = driver.findElement(By.xpath(dev_GSP_USERNAME));
		promo.sendKeys("globalstudypartners.test@gmail.com");
		//type in field, type password
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(dev_GSP_PASSWORD));
		WebElement promo1 = driver.findElement(By.xpath(dev_GSP_PASSWORD));
		promo1.sendKeys("M0use123");
		Thread.sleep(3000);
		//click on next button
		elementUtil.isClickedElementAvailable(dev_GSP_LOGINBUTTON);
		Thread.sleep(2000);
		
	}

}
