package tooltwist.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.ObjectReference;
import tooltwist.utils.TestInit;

public class GSP_AdminApproveAgentPageObject extends ObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(GSP_AdminApproveAgentPageObject.class);

	public GSP_AdminApproveAgentPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti;
	}

	public void startApprove() throws InterruptedException {
		
		driver.findElement(By.xpath(dev_GSP_STATUSSELECTOR)).click();
		Thread.sleep(1000);
		WebElement promowz = driver.findElement(By.xpath(dev_GSP_STATUSSELECTOR));
		promowz.sendKeys("c");
		Thread.sleep(1000);
//		promowz.sendKeys("c");
//		Thread.sleep(1000);
		driver.findElement(By.xpath(dev_GSP_STATUSSELECTOR)).click();
		
	}

	public void startApprove1() throws InterruptedException {
	
		driver.findElement(By.xpath(dev_GSP_APPROVEBUTTON1)).click();
		
//		Thread.sleep(1000);
		
//		try {
//			
//			try {
//				driver.findElement(By.xpath(dev_GSP_APPROVEBUTTON1)).click();
//				logger.info("Alternative Approve button clicked.");
//				
//			} catch(NoSuchElementException | StaleElementReferenceException e) {
//			    logger.info("Impossible to click alternative approve button, trying the alternative option...");
//			}
//			
//			driver.findElement(By.xpath(dev_GSP_APPROVEBUTTON)).click();
//			logger.info("Approve button clicked.");
//			
//		} catch(NoSuchElementException | StaleElementReferenceException e) {
//		    logger.info("Impossible to click Approve button, trying the alternative option...");
//		}
		
		Thread.sleep(1000);
		
//		
		
		driver.findElement(By.xpath(dev_GSP_QAVERIFIEDOKBTN)).click();
		Thread.sleep(1000);

		int x = driver.findElements(By.cssSelector("#become-a-partner-company-profile input[type=radio][value=true]")).size();
		System.out.println("Number of element : " + x);
		
		
		
//		List<WebElement> webelements = driver.findElements(By.xpath(".//input[@type='radio'][./following-sibling::*[contains(., 'Yes')]]"));
//		List<WebElement> webelements = driver.findElements(By.cssSelector("#become-a-partner-company-profile input[type=radio][value=true]"));
//		for(WebElement webelement : webelements){
//			webelement.click();
//		}

		
		driver.findElement(By.xpath(dev_GSP_QAV1)).click();
		logger.info("QAV 1 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV2)).click();
		logger.info("QAV 2 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV3)).click();
		logger.info("QAV 3 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_COMPANYSPECIFICSTAB)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV4)).click();
		logger.info("QAV 4 button clicked.");
		Thread.sleep(3000);
		
//		try {
//			
//			try {
//				driver.findElement(By.xpath(dev_GSP_QAV44)).click();
//				logger.info("QAV 44 button clicked.");
//				
//			} catch(NoSuchElementException | StaleElementReferenceException e) {
//			    logger.info("Impossible to click QAV 44, trying the alternative option...");
//			}
//			
//			driver.findElement(By.xpath(dev_GSP_QAV4)).click();
//			logger.info("QAV 4 button clicked.");
//			
//		} catch(NoSuchElementException | StaleElementReferenceException e) {
//		    logger.info("Impossible to click QAV 4, trying the alternative option...");
//		}
//
//
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath(dev_GSP_STUDENTDATATAB)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(dev_GSP_QAV55)).click();
		logger.info("Alternative QAV 5 button clicked.");
		Thread.sleep(3000);
		
//		try {
//			
//			try {
//				driver.findElement(By.xpath(dev_GSP_QAV55)).click();
//				logger.info("Alternative QAV 5 button clicked.");
//			} catch(NoSuchElementException | StaleElementReferenceException e) {
//			    logger.info("Impossible to click alternative QAV 5. GG");
//			}
//			
//			driver.findElement(By.xpath(dev_GSP_QAV5)).click();
//			logger.info("QAV 5 button clicked.");
//			
//		} catch(NoSuchElementException | StaleElementReferenceException e) {
//		    logger.info("Impossible to click QAV 5, trying the alternative option...");
//		}
//
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath(dev_GSP_QAV66)).click();
		logger.info("Alternative QAV 6 button clicked.");
		Thread.sleep(3000);
		
//		try {
//			
//			try {
//				driver.findElement(By.xpath(dev_GSP_QAV66)).click();
//				logger.info("Alternative QAV 6 button clicked.");
//			} catch(NoSuchElementException | StaleElementReferenceException e) {
//			    logger.info("Impossible to click QAV 6. GG");
//			}
//			
//			driver.findElement(By.xpath(dev_GSP_QAV6)).click();
//			logger.info("QAV 6 button clicked, trying the alternative option...");
//		} catch(NoSuchElementException | StaleElementReferenceException e) {
//		    logger.info("Impossible to click QAV 6");
//		}
		
		
		driver.findElement(By.xpath(dev_GSP_QAV77)).click();
		logger.info("Alternative QAV 7 button clicked.");
		Thread.sleep(3000);
		
//		try {
//			
//			try {
//				driver.findElement(By.xpath(dev_GSP_QAV77)).click();
//				logger.info("Alternative QAV 7 button clicked.");
//			} catch(NoSuchElementException | StaleElementReferenceException e) {
//			    logger.info("Impossible to click alternative QAV 7. GG.");
//			}
//			
//			driver.findElement(By.xpath(dev_GSP_QAV7)).click();
//			logger.info("QAV 7 button clicked.");
//		} catch(NoSuchElementException | StaleElementReferenceException e) {
//		    logger.info("Impossible to click QAV 7, trying the alternative option.");
//		}
		
	
		
		driver.findElement(By.xpath(dev_GSP_STUDENTSERVICESTAB)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV8)).click();
		logger.info("QAV 8 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_DUEDILIGENCEANDSUBMISSIONTAB)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV88)).click();
		logger.info("QAV 88 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dev_GSP_QAV9)).click();
		logger.info("QAV 9 button clicked.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(FINALAPPROVE)).click();
		logger.info("Approved button clicked.");
		Thread.sleep(1000);
		driver.findElement(By.xpath(FAAPPROVEREASON)).click();
		
		WebElement promowz = driver.findElement(By.xpath(FAAPPROVEREASON));
		promowz.sendKeys("c");
		logger.info("Approval reason typed.");
		Thread.sleep(1000);
		driver.findElement(By.xpath(FAPPROVEOKBTN)).click();
		logger.info("OK button was clicked.");
		
		Assert.assertTrue("Successfully  approved!", elementUtil.isElementAvailabe(SUCCESSAPPROVED));
		logger.info("Passed final approval");
		
	}

}

///GSP_AdminApproveAgentPageObject