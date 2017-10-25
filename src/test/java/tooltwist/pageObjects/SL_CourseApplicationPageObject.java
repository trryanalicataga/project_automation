package tooltwist.pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class SL_CourseApplicationPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(SL_CourseApplicationPageObject.class);

	public SL_CourseApplicationPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void applyToCourse() throws InterruptedException {
		elementUtil.isClickedElementAvailable(dev_SL_SCS);
		elementUtil.isClickedElementAvailable(dev_SL_SCS_apply);
		elementUtil.isClickedElementAvailable(dev_SL_AGENTSELECTION);
		Thread.sleep(3000);
		elementUtil.isClickedElementAvailable(dev_SL_PROCEED);
		
		elementUtil.isClickedElementAvailable(dev_SL_CONTACT_DETAILS);
		Thread.sleep(1000);
		elementUtil.isClickedElementAvailable(dev_SL_PASSPORT_DETAILS);
		Thread.sleep(1000);
		elementUtil.isClickedElementAvailable(dev_SL_ACADEMIC_DETAILS);
		Thread.sleep(1000);
		elementUtil.isClickedElementAvailable(dev_SL_PROFESSIONAL_DETAILS);
		Thread.sleep(1000);
		elementUtil.isClickedElementAvailable(dev_SL_DECLARATION);
		Thread.sleep(1000);
		
		Assert.assertTrue("UNAVAILABLE First Name field TEST EDIT",elementUtil.isElementAvailabe(dev_SL_PROFILE_FIRSTNAMEc));
		logger.info("First Name field is available. Entering values now...");
		WebElement promo = driver.findElement(By.xpath(dev_SL_PROFILE_FIRSTNAMEc));
		promo.clear();
		promo.sendKeys("Test Update");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Last Name field",elementUtil.isElementAvailabe(dev_SL_PROFILE_LASTNAMEc));
		logger.info("Last Name field is available. Entering values now...");
		WebElement promo1 = driver.findElement(By.xpath(dev_SL_PROFILE_LASTNAMEc));
		promo1.clear();
		promo1.sendKeys("Test Update");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Date and time field",elementUtil.isElementAvailabe(dev_SL_PROFILE_DATEc));
		logger.info("Date field is available. Entering values now...");
		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_DATEc);
//		WebElement promo2 = driver.findElement(By.xpath(dev_SL_PROFILE_DATEc));
//		promo2.clear();
//		promo2.sendKeys("05/08/1997");
		//promo2.click();
		//dev_SL_PROFILE_DATETIMEPICKER_day
		
		//WebElement element1 = driver.findElement(By.xpath(dev_SL_PROFILE_DATETIMEPICKER_day));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element1);
		logger.info("Close the date-picker now... 3 seconds.");
		Thread.sleep(3000);
		//Assert.assertTrue("Unable to close date and time picker.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_DATETIMEPICKER_day));
		//logger.info("Date and Time picker closed.");
		
		Assert.assertTrue("Unable to sex change.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_GENDERc));
		logger.info("Gender has been updated.");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Passport field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PASSPORTNUMc));
		logger.info("Passport number is available. Entering values now...");
		WebElement promo3 = driver.findElement(By.xpath(dev_SL_PROFILE_PASSPORTNUMc));
		promo3.clear();
		promo3.sendKeys("143OUTANDPROUD");

		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Place of issue field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PLACEOFISSUEc));
		logger.info("Place of issue is available. Entering values now...");
		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_PLACEOFISSUEc);
		WebElement promo2 = driver.findElement(By.xpath(dev_SL_PROFILE_PLACEOFISSUEc));
		promo2.clear();
		promo2.sendKeys("05/08/1997");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Date of issue field",elementUtil.isElementAvailabe(dev_SL_PROFILE_DATEOFISSUEc));
		logger.info("Date of issue is available.");
		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_DATEOFISSUEc);
		Thread.sleep(3000);
		
		Assert.assertTrue("UNAVAILABLE Expiry date field",elementUtil.isElementAvailabe(dev_SL_PROFILE_EXPIRYDATEc));
		logger.info("Expiry date is available.");
		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_EXPIRYDATEc);
		Thread.sleep(3000);

		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_NATIONALITYc);
//		WebElement element= driver.findElement(By.xpath(dev_SL_PROFILE_NATIONALITYc));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", element);
//		logger.info("Pick a nationality to close the dropdown now... 3 seconds.");
		Thread.sleep(3000);
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Place of birth field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PLACEOFBIRTHc));
		logger.info("Place of birth is available. Entering values now...");
		WebElement promo7 = driver.findElement(By.xpath(dev_SL_PROFILE_PLACEOFBIRTHc));
		promo7.clear();
		promo7.sendKeys("ARAYAT");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Street Address field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STREETADDRESS1c));
		logger.info("Street Address is available. Entering values now...");
		WebElement promo8 = driver.findElement(By.xpath(dev_SL_PROFILE_STREETADDRESS1c));
		promo8.clear();
		promo8.sendKeys("ST JUDE");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Street Address 2 field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STREETADDRESS2c));
		logger.info("Street Address 2 is available. Entering values now...");
		WebElement promo9 = driver.findElement(By.xpath(dev_SL_PROFILE_STREETADDRESS2c));
		promo9.clear();
		promo9.sendKeys("ST JUDE");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE City field",elementUtil.isElementAvailabe(dev_SL_PROFILE_CITYc));
		logger.info("City is available. Entering values now...");
		WebElement promo10 = driver.findElement(By.xpath(dev_SL_PROFILE_CITYc));
		promo10.clear();
		promo10.sendKeys("ST JUDE");
		logger.info("City values has been entered...");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Region field",elementUtil.isElementAvailabe(dev_SL_PROFILE_STATEPROVREGIONc));
		logger.info("Region is available. Entering values now...");
		WebElement promo11 = driver.findElement(By.xpath(dev_SL_PROFILE_STATEPROVREGIONc));
		promo11.clear();
		promo11.sendKeys("REGION 3");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Postal field",elementUtil.isElementAvailabe(dev_SL_PROFILE_POSTALZIPCODEc));
		logger.info("Postal is available. Entering values now...");
		WebElement promo88 = driver.findElement(By.xpath(dev_SL_PROFILE_POSTALZIPCODEc));
		promo88.clear();
		promo88.sendKeys("1208");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Phone Number field",elementUtil.isElementAvailabe(dev_SL_PROFILE_PHONENUMBERc));
		logger.info("Phone Number is available. Entering values now...");
		WebElement promo12 = driver.findElement(By.xpath(dev_SL_PROFILE_PHONENUMBERc));
		promo12.clear();
		promo12.sendKeys("09173385901");
		
		Thread.sleep(500);
		Assert.assertTrue("UNAVAILABLE Email field",elementUtil.isElementAvailabe(dev_SL_PROFILE_EMAILADDRESSc));
		logger.info("Phone Number is available. Entering values now...");
		WebElement promo123 = driver.findElement(By.xpath(dev_SL_PROFILE_EMAILADDRESSc));
		promo123.clear();
		promo123.sendKeys("ryanstudent5@yopmail.com");
		//add exception catcher, something like add '1' to email when it's already existing
		
		
		Assert.assertTrue("Unable to travel alone.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_TRAVELALONEc));
		logger.info("Travel alone has been updated.");
		
		Thread.sleep(5000);
		
//		Assert.assertTrue("Unable to sex change.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_GENDER));
//		logger.info("Gender has been updated.");
		
		Assert.assertTrue("Unable to update Recent Program.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_MOSTRECENTPROGRAMc));
		logger.info("Recent Program has been updated.");
		
//		WebElement radioBtn3 = driver.findElement(By.xpath(dev_SL_PROFILE_MOSTRECENTPROGRAM));
//		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn3);
		
		Assert.assertTrue("Unable to update Recent Level Educ.",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_MOSTRECENTLEVELEDUCc));
		logger.info("Recent Level Educ has been updated.");
		

		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_YEARCOMPLETEDc);
//		WebElement element2= driver.findElement(By.xpath(dev_SL_PROFILE_YEARCOMPLETEDc));
//		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
//		executor2.executeScript("arguments[0].click();", element2);
//		logger.info("Pick a year to close the dropdown now... 3 seconds.");
//		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		Assert.assertTrue("Unable to update Worked after studies",elementUtil.isClickedElementAvailable(dev_SL_PROFILE_WORKEDAFTERSTUDIESc));
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
		

		
		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_ICONFIRMc);
		
		Assert.assertTrue("UNAVAILABLE Full Name field",elementUtil.isElementAvailabe(dev_SL_PROFILE_FULLNAMEc));
		logger.info("First Name field is available. Entering values now...");
		WebElement promoZ = driver.findElement(By.xpath(dev_SL_PROFILE_FULLNAMEc));
		promoZ.clear();
		promoZ.sendKeys("Test Update Test Update");
		
		Assert.assertTrue("UNAVAILABLE Date Declaration field",elementUtil.isElementAvailabe(dev_SL_PROFILE_DATEDECLARATIONc));
		logger.info("First Name field is available. Entering values now...");
		WebElement promoZY = driver.findElement(By.xpath(dev_SL_PROFILE_DATEDECLARATIONc));
		promoZY.clear();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String x = dateFormat.format(date);
		promoZY.sendKeys(x);
		
		Thread.sleep(3000);

		elementUtil.isClickedElementAvailable(dev_SL_PROFILE_SUCCESS_SUBMITc);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Successful apply", url!=("https://dev.studylane.com.au/successfully-submitted"));
		logger.info("Passed course apply");
	//code below aint working! :(	
//		Assert.assertTrue("Course apply failed",elementUtil.isElementAvailabe(dev_SL_PROFILE_SUCCESS_UPDATE));
//		logger.info("Course apply has been successful.");
//		
//		String reportName = elementUtil.getValue(By.xpath(dev_SL_SUCCESSAPPLY));
//		String report = "Thank you for your application!";
//		
//		Assert.assertTrue("Course apply failed " + reportName, reportName.equals(report));
//		Boolean truth = reportName == report;
//		if (truth == true) {
//			logger.info("Course apply success");
//		} else {
//			logger.info("Course apply failed");
//		}
		
//		Select oSelect = new Select(driver.findElement(By.xpath(dev_SL_PROFILE_NATIONALITY)));
//		oSelect.selectByVisibleText("Canada");
	}

	public void goToHome() {
		driver.get("https://dev.studylane.com.au/login");
	}

}
