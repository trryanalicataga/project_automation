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

public class TestEmailRyePageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(TestEmailRyePageObject.class);

	public TestEmailRyePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void visitGoogle() {
//		String redirectTo = url.replace("{myURL}", ti.getGoogleURL());
//		driver.navigate().to(redirectTo);
//		logger.info("Redirected to Google site");
		driver.get("https://www.gmail.com");
	}

	public void checkEmailField() throws InterruptedException {
		//Thread.sleep(2000);
		Assert.assertTrue("UNAVAILABLE Google Logo",elementUtil.isElementAvailabe(EMAIL_FIELD));
		logger.info("Gmail email field is available");
	}

	public void typeInEmailField() throws InterruptedException {
		//type in field, type email ad
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(EMAIL_FIELD));
		WebElement promo = driver.findElement(By.xpath(EMAIL_FIELD));
		promo.sendKeys("ryanalimedina@gmail.com");
		
		//click on next button
		elementUtil.isClickedElementAvailable(EMAIL_NEXT);
		Thread.sleep(2000);
		
		//enter password, click sign in
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(EMAIL_PASSWORD));
		WebElement password = driver.findElement(By.xpath(EMAIL_PASSWORD));
		password.sendKeys("tachomal");
		//Thread.sleep(2000);
		elementUtil.isClickedElementAvailable(EMAIL_SIGNIN);
		Thread.sleep(4000);
		
		//check if sign in is success
		Assert.assertTrue("Something went wrong.",elementUtil.isElementAvailabe(SIGNIN_ISSUCC));
		logger.info("Sign in success!");
		
	}
}
