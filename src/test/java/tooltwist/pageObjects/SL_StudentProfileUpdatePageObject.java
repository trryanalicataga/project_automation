package tooltwist.pageObjects;

import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class SL_StudentProfileUpdatePageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_StudentProfileUpdatePageObject.class);

	public SL_StudentProfileUpdatePageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void editDetails() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("UNAVAILABLE First Name field TEST EDIT",elementUtil.isElementAvailabe(dev_SL_PROFILE_FIRSTNAME));
		logger.info("First Name field is available. Entering values now...");
		WebElement promo = driver.findElement(By.xpath(dev_SL_PROFILE_FIRSTNAME));
		promo.clear();
		promo.sendKeys("Test Update");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Last Name field",elementUtil.isElementAvailabe(dev_SL_PROFILE_LASTNAME));
		logger.info("Last Name field is available. Entering values now...");
		WebElement promo1 = driver.findElement(By.xpath(dev_SL_PROFILE_LASTNAME));
		promo1.clear();
		promo1.sendKeys("Test Update");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Date and time field",elementUtil.isElementAvailabe(dev_SL_PROFILE_DATE));
		logger.info("Date field is available. Entering values now...");
		WebElement promo2 = driver.findElement(By.xpath(dev_SL_PROFILE_DATE));
		promo2.clear();
		promo2.sendKeys("05/08/1997");
		//promo2.click();
		//dev_SL_PROFILE_DATETIMEPICKER_day
		
		//WebElement element1 = driver.findElement(By.xpath(dev_SL_PROFILE_DATETIMEPICKER_day));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element1);
		logger.info("Close the date-picker now... 3 seconds.");
		Thread.sleep(3000);
		//Assert.assertTrue("Unable to close date and time picker.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_DATETIMEPICKER_day));
		//logger.info("Date and Time picker closed.");
		
		Assert.assertTrue("Unable to sex change.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_GENDER));
		logger.info("Gender has been updated.");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Passport field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PASSPORTNUM));
		logger.info("Passport number is available. Entering values now...");
		WebElement promo3 = driver.findElement(By.xpath(dev_SL_PROFILE_PASSPORTNUM));
		promo3.clear();
		promo3.sendKeys("143OUTANDPROUD");

		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Place of issue field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PLACEOFISSUE));
		logger.info("Place of issue is available. Entering values now...");
		WebElement promo4 = driver.findElement(By.xpath(dev_SL_PROFILE_PLACEOFISSUE));
		promo4.clear();
		promo4.sendKeys("143OUTANDPROUD");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Date of issue field",elementUtil.isElementAvailabe(dev_SL_PROFILE_DATEOFISSUE));
		logger.info("Date of issue is available.");
		WebElement promo5 = driver.findElement(By.xpath(dev_SL_PROFILE_DATEOFISSUE));
		promo5.clear();
		promo5.sendKeys("07/12/2017");
		logger.info("Pick a date and close the date-picker now... 3 seconds.");
		Thread.sleep(3000);
		
		Assert.assertTrue("UNAVAILABLE Expiry date field",elementUtil.isElementAvailabe(dev_SL_PROFILE_EXPIRYDATE));
		logger.info("Expiry date is available.");
		WebElement promo6 = driver.findElement(By.xpath(dev_SL_PROFILE_EXPIRYDATE));
		promo6.clear();
		promo6.sendKeys("07/29/2017");
		logger.info("Pick a date and close the date-picker now... 3 seconds.");
		Thread.sleep(3000);

		
		WebElement element= driver.findElement(By.xpath(dev_SL_PROFILE_NATIONALITY));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		logger.info("Pick a nationality to close the dropdown now... 3 seconds.");
		Thread.sleep(3000);
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Place of birth field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PLACEOFBIRTH));
		logger.info("Place of birth is available. Entering values now...");
		WebElement promo7 = driver.findElement(By.xpath(dev_SL_PROFILE_PLACEOFBIRTH));
		promo7.clear();
		promo7.sendKeys("ARAYAT");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Street Address field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STREETADDRESS1));
		logger.info("Street Address is available. Entering values now...");
		WebElement promo8 = driver.findElement(By.xpath(dev_SL_PROFILE_STREETADDRESS1));
		promo8.clear();
		promo8.sendKeys("ST JUDE");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Street Address 2 field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STREETADDRESS2));
		logger.info("Street Address 2 is available. Entering values now...");
		WebElement promo9 = driver.findElement(By.xpath(dev_SL_PROFILE_STREETADDRESS2));
		promo9.clear();
		promo9.sendKeys("ST JUDE");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE City field",elementUtil.isElementAvailabe(dev_SL_PROFILE_CITY));
		logger.info("City is available. Entering values now...");
		WebElement promo10 = driver.findElement(By.xpath(dev_SL_PROFILE_CITY));
		promo10.clear();
		promo10.sendKeys("ST JUDE");
		logger.info("City values has been entered...");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Region field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STATEPROVREGION));
		logger.info("Region is available. Entering values now...");
		WebElement promo11 = driver.findElement(By.xpath(dev_SL_PROFILE_STATEPROVREGION));
		promo11.clear();
		promo11.sendKeys("REGION 3");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Postal field",elementUtil.isElementAvailabe(dev_SL_PROFILE_POSTALZIPCODE));
		logger.info("Postal is available. Entering values now...");
		WebElement promo88 = driver.findElement(By.xpath(dev_SL_PROFILE_POSTALZIPCODE));
		promo88.clear();
		promo88.sendKeys("1208");
		
		WebElement element1= driver.findElement(By.xpath(dev_SL_PROFILE_COUNTRY));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);
		logger.info("Pick a country to close the dropdown now... 3 seconds.");
		Thread.sleep(3000);
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Phone Number field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PHONENUMBER));
		logger.info("Phone Number is available. Entering values now...");
		WebElement promo12 = driver.findElement(By.xpath(dev_SL_PROFILE_PHONENUMBER));
		promo12.clear();
		promo12.sendKeys("09173385901");
		
		
		
		Assert.assertTrue("Unable to travel alone.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_TRAVELALONE));
		logger.info("Travel alone has been updated.");
		
		Thread.sleep(5000);
		
//		Assert.assertTrue("Unable to sex change.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_GENDER));
//		logger.info("Gender has been updated.");
		
		Assert.assertTrue("Unable to update Recent Program.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_MOSTRECENTPROGRAM));
		logger.info("Recent Program has been updated.");
		
//		WebElement radioBtn3 = driver.findElement(By.xpath(dev_SL_PROFILE_MOSTRECENTPROGRAM));
//		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn3);
		
//		Assert.assertTrue("Unable to update Recent Level Educ.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_MOSTRECENTPROGRAM));
//		logger.info("Recent Level Educ has been updated.");
		

		
		WebElement element2= driver.findElement(By.xpath(dev_SL_PROFILE_YEARCOMPLETED));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", element2);
		logger.info("Pick a year to close the dropdown now... 3 seconds.");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		Assert.assertTrue("Unable to update Worked after studies",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_WORKEDAFTERSTUDIES));
		logger.info("Worked after studies has been updated.");
		
		Thread.sleep(3000);
		
//		WebElement element3= driver.findElement(By.xpath(dev_SL_PROFILE_DOCUMENTTYPE));
//		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
//		executor3.executeScript("arguments[0].click();", element3);
//		logger.info("Pick a document type to close the dropdown now... 3 seconds.");
//		Thread.sleep(3000);
//		
//		WebElement element4= driver.findElement(By.xpath(dev_SL_PROFILE_ATTACHFILE));
//		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
//		logger.info("Pick a document to close the window now... 5 seconds.");
//		Thread.sleep(5000);
		
		Assert.assertTrue("Unable to update profile",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_UPDATE));
		logger.info("Update button has been clicked.");
		
		Assert.assertTrue("Update profile failed",elementUtil.isElementAvailabe(dev_SL_PROFILE_SUCCESS_UPDATE));
		logger.info("Profile has been successfully updated.");

		
		
//		Select oSelect = new Select(driver.findElement(By.xpath(dev_SL_PROFILE_NATIONALITY)));
//		oSelect.selectByVisibleText("Canada");
		
	}
}
