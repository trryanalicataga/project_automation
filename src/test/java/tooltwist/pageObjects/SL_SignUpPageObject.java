package tooltwist.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_SignUpPageObject extends ObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_SignUpPageObject.class);

	public SL_SignUpPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;

}

	public void visitSLSignUp() {
		driver.get("https://dev.studylane.com.au/signup");
		logger.info("Visited STAGE Studylane");
	}

	public void fillUpSignUpFields() throws InterruptedException {
		//Thread.sleep(2000);
		Assert.assertTrue("UNAVAILABLE First Name field",elementUtil.isElementAvailabe(dev_SL_SIGNUP_FNAME));
		logger.info("First Name field is available");
		//type in field, type First Name
		Assert.assertTrue("First Name field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_FNAME));
		WebElement promo = driver.findElement(By.xpath(dev_SL_SIGNUP_FNAME));
		promo.sendKeys("Trash");
		logger.info("First Name field is typing");
		//type in field, type Last Name
		Assert.assertTrue("Last Name field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_LNAME));
		WebElement promo1 = driver.findElement(By.xpath(dev_SL_SIGNUP_LNAME));
		promo1.sendKeys("Bayleaf");
		logger.info("Last Name field is typing");
		//type in field, type Email Ad
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_EMAILAD));
		WebElement promo2 = driver.findElement(By.xpath(dev_SL_SIGNUP_EMAILAD));
		promo2.sendKeys("trishbayleaf1@yopmail.com");
		logger.info("Email field is typing");
		//type in field, type Re-enter email ad
		Assert.assertTrue("Re-enter Email field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_REENTEREMAILAD));
		WebElement promo3 = driver.findElement(By.xpath(dev_SL_SIGNUP_REENTEREMAILAD));
		promo3.sendKeys("trishbayleaf1@yopmail.com");
		logger.info("Re-enter email field is typing");
		//type in field, type Password
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_PASSWORD));
		WebElement promo4 = driver.findElement(By.xpath(dev_SL_SIGNUP_PASSWORD));
		promo4.sendKeys("M0use123");
		logger.info("Password field is typing");
		//type in field, type Re-enter Password
		Assert.assertTrue("Re-enter Password field is not available", elementUtil.isElementAvailabe(dev_SL_SIGNUP_REENTERPASSWORD));
		WebElement promo5 = driver.findElement(By.xpath(dev_SL_SIGNUP_REENTERPASSWORD));
		promo5.sendKeys("M0use123");
		logger.info("Reenter Password field is typing");
		logger.info("Choose a country now... 3 seconds");
		Thread.sleep(3000);
		//choose country
		//elementUtil.isClickedElementAvailable(dev_SL_SIGNUP_COUNTRYDROPDOWN);
		//Select select = new Select(driver.findElement(By.xpath(dev_SL_SIGNUP_COUNTRYDROPDOWN)));
		//select.selectByVisibleText("United Kingdom");
		logger.info("Complete CAPTCHA... 20 seconds");
		Thread.sleep(20000);
		
		
		Assert.assertTrue("CREATE ACCOUNT button is not available",elementUtil.isElementAvailabe(dev_SL_SIGNUP_SIGNUPBTN));
		logger.info("CREATE ACCOUNT button is available");

		
		elementUtil.isClickedElementAvailable(dev_SL_SIGNUP_SIGNUPBTN);
		logger.info("CREATE ACCOUNT button has been clicked.");
		Thread.sleep(3000);
		String signupURL = driver.getCurrentUrl();
		System.out.print("Current URL is " + signupURL);
		String signupSuccessURL = "https://dev.studylane.com.au/n/Login/studylane-123?signUpSuccess=true";
		if (signupURL == signupSuccessURL){ 
	        System.out.print("Sign-up success.");
	    } else {
	        System.err.println(" Sign-up not successful!");
	    } 
		
		//dev_SL_SIGNUP_PASSWORD
	}
}
